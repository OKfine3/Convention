package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.compile.entity.AndExpression;
import edu.ustb.crypto.convention.compile.entity.OrExpression;
import edu.ustb.crypto.convention.compile.entity.WhileGeneralExpression;
import edu.ustb.crypto.convention.compile.entity.WhileStatement;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/21 9:40
 */
public class WhileStatementVisitor extends SpescBaseVisitor<WhileStatement> {

    @Override
    public WhileStatement visitWhileStatement(SpescParser.WhileStatementContext ctx) {
        if(ctx == null){
            return null;
        }

        //暂时没明白为什么要有orExpression
        OrExpression orExpression = new OrExpression();
        orExpression.setAndExpression(new ArrayList<>());
        List<AndExpression> andExpressions = orExpression.getAndExpression();

        for (SpescParser.TransferOperationContext transferOperationContext : ctx.transferOperation()) {
            TerminalNode deposit = transferOperationContext.DEPOSIT();
            TerminalNode withdraw = transferOperationContext.WITHDRAW();
            TerminalNode transfer = transferOperationContext.TRANSFER();
            TerminalNode grant = transferOperationContext.GRANT();

            //创建 WhileGeneralExpression 对象
            WhileGeneralExpression whileGeneralExpression = new WhileGeneralExpression();

            //处理deposit逻辑
            if (deposit != null) {
//                String depositText = deposit.getText();
                whileGeneralExpression.setIsDeposit(Boolean.TRUE);

                SpescParser.MoneyExpressionContext moneyExpressionContext = transferOperationContext.moneyExpression();
                //TODO moneyExpression 和 assetExpression 逻辑暂未处理
                whileGeneralExpression.setMoneyExpressionContext(moneyExpressionContext);
            }

            //处理withdraw逻辑
            if(withdraw!=null){
                whileGeneralExpression.setIsWithdraw(Boolean.TRUE);
                SpescParser.MoneyExpressionContext moneyExpressionContext = transferOperationContext.moneyExpression();
                //TODO moneyExpression 和 assetExpression 逻辑暂未处理
                whileGeneralExpression.setMoneyExpressionContext(moneyExpressionContext);
            }

            //处理transfer逻辑
            if(transfer!=null){
                whileGeneralExpression.setIsTransfer(Boolean.TRUE);
                SpescParser.MoneyExpressionContext moneyExpressionContext = transferOperationContext.moneyExpression();
                String toTarget = transferOperationContext.name().getText();
                whileGeneralExpression.setToTarget(toTarget);
                //TODO moneyExpression 和 assetExpression 逻辑暂未处理
                whileGeneralExpression.setMoneyExpressionContext(moneyExpressionContext);
            }

            //TODO grant处理逻辑

            AndExpression andExpression = new AndExpression();
            andExpression.setWhileGeneralExpression(whileGeneralExpression);
            andExpressions.add(andExpression);
        }

        orExpression.setAndExpression(andExpressions);
        WhileStatement whileStatement = new WhileStatement(orExpression);
        return whileStatement;
    }
}
