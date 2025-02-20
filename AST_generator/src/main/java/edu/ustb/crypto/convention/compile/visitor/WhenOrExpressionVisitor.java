package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.compile.entity.AndExpression;
import edu.ustb.crypto.convention.compile.entity.OrExpression;
import edu.ustb.crypto.convention.compile.entity.WhenGeneralExpression;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/20 21:41
 */
public class WhenOrExpressionVisitor extends SpescBaseVisitor<OrExpression> {
    @Override
    public OrExpression visitOrExpression(SpescParser.OrExpressionContext ctx) {
        List<SpescParser.AndExpressionContext> andExpressionContexts = ctx.andExpression();
        OrExpression orExpression = new OrExpression();
        orExpression.setAndExpression(new ArrayList<>());
        for (SpescParser.AndExpressionContext andExpressionContext : andExpressionContexts) {
            List<AndExpression> andExpressions = orExpression.getAndExpression();
            for (SpescParser.AndChildExpressionContext andChildExpressionContext : andExpressionContext.andChildExpression()) {
                AndExpression andExpression = new AndExpression();
                WhenGeneralExpression generalExpression = new WhenGeneralExpression();
                SpescParser.NotExpressionContext notExpressionContext = andChildExpressionContext.notExpression();
                SpescParser.TimeExpressionContext timeExpressionContext = andChildExpressionContext.timeExpression();
                if(notExpressionContext != null){
                    generalExpression.setIfNot(Boolean.TRUE);
                    timeExpressionContext = notExpressionContext.timeExpression();
                }
                SpescParser.BoundedTimePredicateContext boundedTimePredicateContext = timeExpressionContext.timePeriodExpression().boundedTimePredicate();
                String preStatement = "";
                if(boundedTimePredicateContext.WITHIN() != null){
                    generalExpression.setIfWithIn(Boolean.TRUE);
                    preStatement = boundedTimePredicateContext.WITHIN().getText();
                    preStatement += " ";
                    preStatement += boundedTimePredicateContext.timeConstant().rule_INTEGER().getText();
                    preStatement += " ";
                    preStatement += boundedTimePredicateContext.timeConstant().timeConstantUnit().getText();
                    generalExpression.setRuleINTEGER(boundedTimePredicateContext.timeConstant().rule_INTEGER().getText());
                    generalExpression.setTimeConstantUnit(boundedTimePredicateContext.timeConstant().timeConstantUnit().getText());
                }

                String timeOperator = boundedTimePredicateContext.timePredicateOperator().getText();
                generalExpression.setTimeOperator(timeOperator);
                SpescParser.TimePointExpressionContext timePointExpressionContext = boundedTimePredicateContext.timePointExpression();
                if(timePointExpressionContext.actionEnforcedTimeQuery() != null){
                    String partyName = timePointExpressionContext.actionEnforcedTimeQuery().partyName().getText();
                    String duty = timePointExpressionContext.actionEnforcedTimeQuery().termDuty().getText();
                    String actionName = timePointExpressionContext.actionEnforcedTimeQuery().action().actionName().getText();
                    generalExpression.setActionName(actionName);
                    generalExpression.setDuty(duty);
                    generalExpression.setIfAction(Boolean.TRUE);
                    generalExpression.setPartyName(partyName);
                }else if(timePointExpressionContext.timeQueryOperator() != null){
                    String queryOperator = timePointExpressionContext.timeQueryOperator().getText();
                    generalExpression.setQueryOperator(queryOperator);
                }
                andExpression.setWhenGeneralExpression(generalExpression);
                andExpressions.add(andExpression);

            }
            return orExpression;
        }
        return null;
    }
}
