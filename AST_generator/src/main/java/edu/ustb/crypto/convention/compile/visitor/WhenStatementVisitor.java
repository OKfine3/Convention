package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.compile.entity.OrExpression;
import edu.ustb.crypto.convention.compile.entity.WhenStatement;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

/**
 * @auther lwj
 * @date 2025/2/20 21:37
 */
public class WhenStatementVisitor extends SpescBaseVisitor<WhenStatement> {
    @Override
    public WhenStatement visitWhenStatement(SpescParser.WhenStatementContext ctx) {
        if(ctx == null){
            return null;
        }
        OrExpression orExpression = null;
        for (SpescParser.RelationalExpressionContext relationalExpressionContext : ctx.predicate().relationalExpression()) {
            SpescParser.OrExpressionContext orExpressionContext = relationalExpressionContext.timeUnit().orExpression();
            orExpression = new WhenOrExpressionVisitor().visitOrExpression(orExpressionContext);
            return new WhenStatement(orExpression);
        }
        return null;
    }

}
