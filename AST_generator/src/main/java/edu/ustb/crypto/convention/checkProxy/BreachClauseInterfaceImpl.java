package edu.ustb.crypto.convention.checkProxy;

import edu.ustb.crypto.convention.compile.entity.*;

/**
 * @auther lwj
 * @date 2025/2/25 14:59
 */
public class BreachClauseInterfaceImpl implements TermInterface<BreachTerm, BreachClause> {

    public BreachTerm checkBreach(BreachTerm breachTerm, BreachClause breachClause) {
        boolean preHandle = preHandle(breachTerm, breachClause);
        boolean process = process(breachTerm, breachClause);
        boolean postHandle = postHandle(breachTerm, breachClause);

        BreachTerm newBreachTerm;
        newBreachTerm = breachTerm;

        if (preHandle == true) {
            System.out.println("条款" + breachTerm.getActionName() + "，公约需要补全私约前置条件！");
            newBreachTerm.setWhenStatement(breachClause.getWhenStatement());
        }
        if (process == true) {
            System.out.println("条款" + breachTerm.getActionName() + "，公约需要补全伴随条件！");
            newBreachTerm.setWhileStatement(breachClause.getWhileStatement());
        }
        if (postHandle == true) {
            System.out.println("条款" + breachTerm.getActionName() + "，公约需要补全后置条件！");
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
