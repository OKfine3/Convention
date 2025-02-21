package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.compile.entity.AndExpression;
import edu.ustb.crypto.convention.compile.entity.OrExpression;
import edu.ustb.crypto.convention.compile.entity.WhereGeneralExpression;
import edu.ustb.crypto.convention.compile.entity.WhereStatement;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/21 10:41
 */
public class WhereStatementVisitor extends SpescBaseVisitor<WhereStatement> {
    @Override
    public WhereStatement visitWhereStatement(SpescParser.WhereStatementContext ctx) {
        if(ctx == null){
            return null;
        }
        OrExpression orExpression = new OrExpression();
        orExpression.setAndExpression(new ArrayList<>());
        List<AndExpression> andExpressions = orExpression.getAndExpression();
        // TODO 处理 or 逻辑
        for (SpescParser.LogicalAndExpressionContext logicalAndExpressionContext : ctx.logicalOrExpression().logicalAndExpression()) {
            for (SpescParser.ChildExpressionContext childExpressionContext : logicalAndExpressionContext.childExpression()) {
                WhereGeneralExpression whereGeneralExpression = new WhereGeneralExpression();
                SpescParser.Assignment_expressionContext context = childExpressionContext.assignment_expression();
                String p0 = context.IDENTIFIER().getText();
                List<SpescParser.Arithmetic_expressionContext> arithmetic_expressionContexts = context.childExpression().relational_expression().arithmetic_expression();
                SpescParser.Arithmetic_expressionContext arithmetic_expressionContext = arithmetic_expressionContexts.get(0);
                whereGeneralExpression.setP0(p0);
                whereGeneralExpression.setP1(arithmetic_expressionContext);
                AndExpression andExpression = new AndExpression();
                andExpression.setWhereGeneralExpression(whereGeneralExpression);
                andExpressions.add(andExpression);
            }
        }
        orExpression.setAndExpression(andExpressions);
        WhereStatement whereStatement = new WhereStatement(orExpression);
        return whereStatement;
    }
}
