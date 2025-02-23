package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.compile.entity.AndExpression;
import edu.ustb.crypto.convention.compile.entity.OrExpression;
import edu.ustb.crypto.convention.compile.entity.WhenGeneralExpression;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理whenStatement中的orExpression表达式，此处的or表达式，主要是用于解决时间逻辑中的or表达式
 * 例如：after Buyer did buyMeat and before payDate
 * @auther lwj
 * @date 2025/2/20 21:41
 */
public class WhenOrExpressionVisitor extends SpescBaseVisitor<OrExpression> {

    /**
     * 以 when after Buyer did buyMeat and before payDate 为例
     *   andExpressionContexts            when after Buyer did buyMeat and before payDate
     *   andExpressionContext            ①when after Buyer did buyMeat    ②and    ③before payDate
     *   andChildExpressionContext       ①when   ②after Buyer did buyMeat
     * @param ctx the parse tree
     * @return
     */
    @Override
    public OrExpression visitOrExpression(SpescParser.OrExpressionContext ctx) {
        List<SpescParser.AndExpressionContext> andExpressionContexts = ctx.andExpression();
        OrExpression orExpression = new OrExpression();
        orExpression.setAndExpression(new ArrayList<>());
        for (SpescParser.AndExpressionContext andExpressionContext : andExpressionContexts) {
            //创建一个空的 andExpressions 对象
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
                //timeExpressionContext 也应该判空一下（但是由于when条件中几乎都有时间判断，此处暂省略）
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
                //设置动作完成时间
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
                }//TODO 时间常量 timeConstant 的处理
                andExpression.setWhenGeneralExpression(generalExpression);
                andExpressions.add(andExpression);

            }
            return orExpression;
        }
        return null;
    }
}
