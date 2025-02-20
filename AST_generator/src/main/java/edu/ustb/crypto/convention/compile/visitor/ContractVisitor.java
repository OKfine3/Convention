package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.compile.entity.Convention;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther lwj
 * @date 2025/2/20 19:19
 */
public class ContractVisitor extends SpescBaseVisitor<Contract> {
    @Override
    public Contract visitContractDefinition(SpescParser.ContractDefinitionContext ctx) {
        String text = ctx.contractType().getText();
        Contract contract = new Contract();  //创建一个新的合约对象
        if(!text.equals("contract")){
            contract = new Convention();
        }
        String contractName=ctx.IDENTIFIER().get(0).getText();
        contract.setContractName(contractName);
        TerminalNode terminalNode = ctx.CONSTRAINT_BY();
        if(terminalNode!=null){
            contract.setConstrainttedContractName(ctx.conventionName().get(0).getText());
        }

        //设置Contract中的party内容
        SpescParser.ContractBodyContext contractBodyContext = ctx.contractBody();
        HashMap<String, List<Pair<String, String>>> partyMap = new HashMap<>();
        for (SpescParser.PartyContext partyContext: contractBodyContext.party()) {
            PartyVisitor partyVisitor = new PartyVisitor();
            AttributeTreeNode node = partyVisitor.visitParty(partyContext);
            String partyName = node.getNodeName();
            ArrayList<Pair<String,String>> pairs = new ArrayList<>();
            for (AttributeTreeNode child : node.getChildren()){
                if(child.getType()== AttributeTypeEnum.Value){
                    String nodeName=child.getNodeName();
                    String value=child.getChildren().get(0).getNodeName();
                    pairs.add(new Pair<>(nodeName,value));
                }
            }
            partyMap.put(partyName,pairs);
        }
        contract.setPartys(partyMap);

        //设置Contract中的asset内容
        Map<String, List<Pair<String,String>>> assetMap = new HashMap<>();
        Map<String, List<Pair<String,String>>> assetExtraProps = new HashMap<>();
        for (SpescParser.AssetContext assetContext : contractBodyContext.asset()) {
            AssetVisitor assetVisitor = new AssetVisitor();
            AttributeTreeNode node = assetVisitor.visitAsset(assetContext);
            String assetName = node.getNodeName();
            ArrayList<Pair<String, String>> pairs = new ArrayList<>();
            for (AttributeTreeNode child : node.getChildren()) {
                if(child.getType() == AttributeTypeEnum.Value){
                    String nodeName = child.getNodeName();
                    String value = child.getChildren().get(0).getNodeName();
                    pairs.add(new Pair<>(nodeName, value));
                }
            }
            assetMap.put(assetName,pairs);
            pairs = new ArrayList<>();
            PropertyVisitor propertyVisitor = new PropertyVisitor();
            for (SpescParser.PropertyContext propertyContext : assetContext.property()) {
                AttributeTreeNode propertyNode = propertyVisitor.visitProperty(propertyContext);
                String key = propertyNode.getNodeName();
                String value = propertyNode.getChildren().get(0).getNodeName();
                pairs.add(new Pair<>(key, value));
            }
            assetExtraProps.put(assetName,pairs);
        }
        contract.setAssets(assetMap);
        contract.setAssetExtraProps(assetExtraProps);

        //设置Contract中的addition内容
        Map<String, List<Pair<String,String>>> additionMap = new HashMap<>();
        for (SpescParser.AdditionContext additionContext : contractBodyContext.addition()) {
            AdditionVisitor additionVisitor = new AdditionVisitor();
            AttributeTreeNode node = additionVisitor.visitAddition(additionContext);
            String name = node.getNodeName();
            List<Pair<String,String>> pairs = new ArrayList<>();
            for (AttributeTreeNode child : node.getChildren()) {
                String key = child.getNodeName();
                String value = child.getChildren().get(0).getNodeName();
                pairs.add(new Pair<>(key,value));
            }
            additionMap.put(name,pairs);
        }
        contract.setAdditions(additionMap);


        return null;

//        return super.visitContractDefinition(ctx);
    }
}
