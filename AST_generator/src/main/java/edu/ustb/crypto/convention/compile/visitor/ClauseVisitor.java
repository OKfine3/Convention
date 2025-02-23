package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.compile.entity.*;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author lijiru152@qq.com
 * @date 2024/6/1 14:48
 */
public class ClauseVisitor extends SpescBaseVisitor<AttributeTreeNode> {
    @Override
    public AttributeTreeNode visitClause(SpescParser.ClauseContext ctx) {
        SpescParser.BindClauseContext bindClauseContext = ctx.bindClause();
        SpescParser.GeneralClauseContext generalClauseContext = ctx.generalClause();
        SpescParser.BreachClauseContext breachClauseContext = ctx.breachClause();
        AttributeTreeNode node = new AttributeTreeNode();
        node.setType(AttributeTypeEnum.Object);
        if(bindClauseContext != null){
            BindClause bindClause = new BindClause();
            String index = bindClauseContext.index().getText();
            bindClause.setClauseName(index);
            OrExpression orExpression = new OrExpression();
            ArrayList<AndExpression> andExpressions = new ArrayList<>();
            for (SpescParser.ChildExpressionContext childExpressionContext : bindClauseContext.childExpression()) {
                String p0 = childExpressionContext.relational_expression().arithmetic_expression().get(0).addSubExpression().mulDivExpression().get(0).primaryExpression().get(0).value().getText();
                SpescParser.Arithmetic_expressionContext p1 = childExpressionContext.relational_expression().arithmetic_expression().get(1);
                BindClauseChildExpression bindClauseChildExpression = new BindClauseChildExpression();
                bindClauseChildExpression.setP0(p0);
                bindClauseChildExpression.setP1(p1);
                bindClauseChildExpression.setEqualSeparator(childExpressionContext.relational_expression().getChild(1).getText());
                AndExpression andExpression = new AndExpression();
                andExpression.setBindClauseChildExpression(bindClauseChildExpression);
                andExpressions.add(andExpression);
            }
            orExpression.setAndExpression(andExpressions);
            bindClause.setChildExpression(orExpression);
            orExpression = new OrExpression();
            andExpressions = new ArrayList<>();
            for (SpescParser.FactorBindContext factorBindContext : bindClauseContext.factorBind()) {
                AndExpression andExpression = new AndExpression();
                BindClauseFactorBind bindClauseFactorBind = new BindClauseFactorBind();
                String partyName = factorBindContext.factor().partyName().getText();
                bindClauseFactorBind.setPartyName(partyName);
                if("NOT_IN".equals(factorBindContext.lo_type().getText())){
                    bindClauseFactorBind.setIfNotIn(Boolean.TRUE);
                }
                bindClauseFactorBind.setItemLimitationName(factorBindContext.itemLimitation().itemLimitationName().getText());
                ArrayList<String> strings = new ArrayList<>();
                for (TerminalNode terminalNode : factorBindContext.itemLimitation().IDENTIFIER()) {
                    strings.add(terminalNode.getText());
                }
                bindClauseFactorBind.setItemLimitations(strings);
                andExpression.setBindClauseFactorBind(bindClauseFactorBind);
                andExpressions.add(andExpression);
            }
            orExpression.setAndExpression(andExpressions);
            bindClause.setFactorBinds(orExpression);
            node.setObject(bindClause);
        }else if(generalClauseContext != null){
            GeneralClause generalClause = new GeneralClause();
            generalClause.setClauseName(generalClauseContext.clauseDeclaration().index().getText());
            generalClause.setActionName(generalClauseContext.clauseDeclaration().action().actionName().getText());
            generalClause.setPartyName(generalClauseContext.clauseDeclaration().partyName().getText());
            generalClause.setDutyConditionType(generalClauseContext.clauseDeclaration().cvDuty().getText());
            if(generalClauseContext.whenStatement()!=null){
                generalClause.setWhenStatement(new WhenStatementVisitor().visitWhenStatement(generalClauseContext.whenStatement()));
            }
            if(generalClauseContext.whileStatement()!=null){
                generalClause.setWhileStatement(new WhileStatementVisitor().visitWhileStatement(generalClauseContext.whileStatement()));
            }
            if(generalClauseContext.whereStatement()!=null){
                generalClause.setWhereStatement(new WhereStatementVisitor().visitWhereStatement(generalClauseContext.whereStatement()));
            }
            node.setObject(generalClause);
        }else if(breachClauseContext != null){
            BreachClause breachClause = new BreachClause();
            breachClause.setAgainstClauseName(breachClauseContext.breachClauseDeclaration().againstDeclaration().index().stream().map(item -> item.getText()).collect(Collectors.toList()));
            breachClause.setClauseName(breachClauseContext.breachClauseDeclaration().index().getText());
            breachClause.setActionName(breachClauseContext.breachClauseDeclaration().action().actionName().getText());
            breachClause.setPartyName(breachClauseContext.breachClauseDeclaration().partyName().getText());
            breachClause.setDutyConditionType(breachClauseContext.breachClauseDeclaration().cvDuty().getText());
            if(breachClauseContext.whenStatement()!=null){
                breachClause.setWhenStatement(new WhenStatementVisitor().visitWhenStatement(breachClauseContext.whenStatement()));
            }
            if(breachClauseContext.whileStatement()!=null){
                breachClause.setWhileStatement(new WhileStatementVisitor().visitWhileStatement(breachClauseContext.whileStatement()));
            }
            if(breachClauseContext.whereStatement()!=null){
                breachClause.setWhereStatement(new WhereStatementVisitor().visitWhereStatement(breachClauseContext.whereStatement()));
            }
            node.setObject(breachClause);
        }
        return node;
    }
}
