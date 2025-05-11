package edu.ustb.crypto.convention.checkProxy;

import edu.ustb.crypto.convention.compile.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther lwj
 * @date 2025/2/25 14:59
 */
public class BreachClauseInterfaceImpl implements ClauseInterface<BreachTerm, BreachClause> {
    private static final Logger logger = LoggerFactory.getLogger(BreachClauseInterfaceImpl.class);

    public BreachTerm checkBreach(BreachTerm breachTerm, BreachClause breachClause, String termName) {
        boolean preHandle = preHandle(breachTerm, breachClause);
        boolean process = process(breachTerm, breachClause);
        boolean postHandle = postHandle(breachTerm, breachClause);

        BreachTerm newBreachTerm;
        newBreachTerm = breachTerm;

        if (preHandle == true) {
            logger.info("The [precondition] for the [breach term {} : {}] is missing and needs to be supplemented by the convention.", termName, breachTerm.getActionName());
//            System.out.println("条款" + breachTerm.getActionName() + "，公约需要补全私约前置条件！");
            newBreachTerm.setWhenStatement(breachClause.getWhenStatement());
        }
        if (process == true) {
            logger.info("The [transaction] for the [breach term {} : {}] is missing and needs to be supplemented by the convention.", termName, breachTerm.getActionName());
            System.out.println("条款" + breachTerm.getActionName() + "，公约需要补全伴随条件！");
            newBreachTerm.setWhileStatement(breachClause.getWhileStatement());
        }
        if (postHandle == true) {
            logger.info("The [postcondition] for the [breach term {} : {}] is missing and needs to be supplemented by the convention.", termName, breachTerm.getActionName());
            newBreachTerm.setWhereStatement(breachClause.getWhereStatement());
        }
        return newBreachTerm;
    }

    @Override
    public boolean preHandle(BreachTerm breachTerm, BreachClause breachClause) {
        WhenStatement whenStatement_ct = breachTerm.getWhenStatement();
        WhenStatement whenStatement_cv = breachClause.getWhenStatement(); //公约中的前置条件 cv代表公约（Convention）
        //判断公约和私约对应条款中的前置条件 如果公约存在 preCondition，私约不存在 preCondition,返回true
        if (whenStatement_cv != null && whenStatement_ct == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean postHandle(BreachTerm breachTerm, BreachClause breachClause) {
        WhileStatement whileStatement_ct = breachTerm.getWhileStatement();
        WhileStatement whileStatement_cv = breachClause.getWhileStatement();

        if (whileStatement_cv != null && whileStatement_ct == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean process(BreachTerm breachTerm, BreachClause breachClause) {
        WhereStatement whereStatement_ct = breachTerm.getWhereStatement();
        WhereStatement whereStatement_cv = breachClause.getWhereStatement();
        if (whereStatement_cv != null && whereStatement_ct != null) {
            return true;
        }
        return false;
    }

}
