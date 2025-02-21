package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.compile.entity.GeneralTerm;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.ArrayList;

/**
 * @auther lwj
 * @date 2025/2/20 21:17
 */
public class TermVisitor extends SpescBaseVisitor<AttributeTreeNode> {
    @Override
    public AttributeTreeNode visitTerm(SpescParser.TermContext ctx) {
        if (ctx == null) {
            return null;
        }
        SpescParser.GeneralTermContext generalTermContext = ctx.generalTerm();
        SpescParser.BreachTermContext breachTermContext = ctx.breachTerm();
        SpescParser.ArbiTermContext arbiTermContext = ctx.arbiTerm();

        if (generalTermContext != null) {
            SpescParser.GeneralTermDeclarationContext generalTermDeclarationContext = generalTermContext.generalTermDeclaration();
            //获取条款的各部分名称（index,partyName,duty,action）
            String idxText = generalTermDeclarationContext.index().getText();
            String partyNameText = generalTermDeclarationContext.partyName().getText();
            String dutyText = generalTermDeclarationContext.duty().getText();
            String actionText = generalTermDeclarationContext.action().actionName().getText();

            //设置GeneralTerm
            GeneralTerm generalTerm = new GeneralTerm();
            generalTerm.setTermName(idxText);
            generalTerm.setPartyName(partyNameText);
            generalTerm.setDuty(dutyText);
            generalTerm.setActionName(actionText);

            //设置action中参数
            ArrayList<String> parameters = new ArrayList<>();
            if (generalTermDeclarationContext.action().parametersList() != null) {
                for (SpescParser.ParameterContext parameterContext : generalTermDeclarationContext.action().parametersList().parameter()) {
                    parameters.add(parameterContext.getText());
                }
            }
            generalTerm.setParameterList(parameters);

            //前置条件
            if (generalTermContext.whenStatement() != null) {
                generalTerm.setWhenStatement(new WhenStatementVisitor().visitWhenStatement(generalTermContext.whenStatement()));
            }
            //伴随条件
            if(generalTermContext.whileStatement() != null){
                generalTerm.setWhileStatement(new WhileStatementVisitor().visitWhileStatement(generalTermContext.whileStatement()));
            }
            //后置条件
            if(generalTermContext.whereStatement() != null){
                generalTerm.setWhereStatement(new WhereStatementVisitor().visitWhereStatement(generalTermContext.whereStatement()));
            }
            AttributeTreeNode node = new AttributeTreeNode();
            node.setType(AttributeTypeEnum.Object);
            node.setObject(generalTerm);
            return node;
        }else if(breachTermContext != null){
            // TODO
        }else{
            // TODO
        }
        return null;
    }
}
