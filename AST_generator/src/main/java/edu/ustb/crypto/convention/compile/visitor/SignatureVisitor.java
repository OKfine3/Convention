package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther lwj
 * @date 2025/3/3 15:23
 */
public class SignatureVisitor extends SpescBaseVisitor<AttributeTreeNode> {
    @Override
    public AttributeTreeNode visitSignature(SpescParser.SignatureContext ctx) {
        if (ctx == null) {
            return null;
        }

        List<AttributeTreeNode> signatureNode = new ArrayList<AttributeTreeNode>();
//        AttributeTreeNode(AttributeTypeEnum.Object, );
        List<SpescParser.ValueContext> value = ctx.value();
        List<SpescParser.TypeContext> type = ctx.type();
        String date = ctx.RULE_DATE().getText();

        List<String> signatures = ctx.value()
                .stream()
                .map(valueContext -> valueContext.getText())
                .collect(Collectors.toList());

        AttributeTreeNode node = new AttributeTreeNode(AttributeTypeEnum.Leaf, signatures.get(0));
        AttributeTreeNode attributeTreeNode = new AttributeTreeNode(AttributeTypeEnum.Value, ctx.IDENTIFIER().getText());
        attributeTreeNode.addChild(node);

        AttributeTreeNode node1 = new AttributeTreeNode(AttributeTypeEnum.Leaf, signatures.get(1));
//        AttributeTreeNode attributeTreeNode1 = new AttributeTreeNode(AttributeTypeEnum.Value, "signature");
        attributeTreeNode.addChild(node1);

        AttributeTreeNode node2 = new AttributeTreeNode(AttributeTypeEnum.Leaf, date);
//        AttributeTreeNode attributeTreeNode2 = new AttributeTreeNode(AttributeTypeEnum.Value, "date");
        attributeTreeNode.addChild(node2);

        return attributeTreeNode;
    }
}
