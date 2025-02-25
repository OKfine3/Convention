package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.compile.entity.BreachTerm;
import edu.ustb.crypto.convention.compile.entity.GeneralTerm;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.ArrayList;
import java.util.List;

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
        }else if(breachTermContext != null) {
            SpescParser.BreachTermDeclarationContext breachTermDeclarationContext = breachTermContext.breachTermDeclaration();

            String idxText = breachTermDeclarationContext.index().getText();
            List<SpescParser.IndexContext> indexs = breachTermDeclarationContext.againstDeclaration().index();
            String partyName = breachTermDeclarationContext.partyName().getText();
            String duty = breachTermDeclarationContext.duty().getText();
            String actionName = breachTermDeclarationContext.action().actionName().getText();

            BreachTerm breachTerm = new BreachTerm();
            breachTerm.setTermName(idxText);
            breachTerm.setPartyName(partyName);
            breachTerm.setDuty(duty);
            breachTerm.setActionName(actionName);
            ArrayList<String> againstNames = new ArrayList<>();

            for (SpescParser.IndexContext againstIndex : indexs) {
                String name = againstIndex.INDEX().getText();
                againstNames.add(name);
            }
            breachTerm.setAgainstTermName(againstNames);

            ArrayList<String> strings = new ArrayList<>();
            if (breachTermDeclarationContext.action().parametersList() != null) {
                for (SpescParser.ParameterContext parameterContext : breachTermDeclarationContext.action().parametersList().parameter()) {
                    strings.add(parameterContext.getText());
                }
            }
            breachTerm.setParameterList(strings);
            if (breachTermContext.whenStatement() != null) {
                breachTerm.setWhenStatement(new WhenStatementVisitor().visitWhenStatement(breachTermContext.whenStatement()));
            }
            if (breachTermContext.whileStatement() != null) {
                breachTerm.setWhileStatement(new WhileStatementVisitor().visitWhileStatement(breachTermContext.whileStatement()));
            }
            if (breachTermContext.whereStatement() != null) {
                breachTerm.setWhereStatement(new WhereStatementVisitor().visitWhereStatement(breachTermContext.whereStatement()));
            }

            AttributeTreeNode node = new AttributeTreeNode();
            node.setType(AttributeTypeEnum.Object);
            node.setObject(breachTerm);
            return node;

        }else{
            // TODO
        }
        return null;
    }
}
