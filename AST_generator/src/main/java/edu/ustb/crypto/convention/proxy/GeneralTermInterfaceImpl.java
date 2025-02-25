package edu.ustb.crypto.convention.proxy;

import edu.ustb.crypto.convention.compile.entity.*;

/**
 * 对于私约和公约中同时存在的条款进行检查  条款覆盖关系
 *
 * @auther lwj
 * @date 2025/2/24 10:16
 */
public class GeneralTermInterfaceImpl implements TermInterface<GeneralTerm, GeneralClause> {

    /**
     * 检查公约和私约中的一般条款，给私约补全相应缺失条件
     *
     * @param generalTerm
     * @param generalClause
     * @return
     */
    public GeneralTerm checkGeneral(GeneralTerm generalTerm, GeneralClause generalClause) {
        boolean preHandle = preHandle(generalTerm, generalClause);
        boolean process = process(generalTerm, generalClause);
        boolean postHandle = postHandle(generalTerm, generalClause);

        GeneralTerm newGeneralTerm;
        newGeneralTerm = generalTerm;

        if (preHandle == true) {
            System.out.println("该条款中，公约需要补全私约前置条件！");
            newGeneralTerm.setWhenStatement(generalClause.getWhenStatement());
        }
        if (process == true) {
            System.out.println("该条款中，公约需要补全伴随条件！");
            newGeneralTerm.setWhileStatement(generalClause.getWhileStatement());
        }
        if (postHandle == true) {
            System.out.println("该条款中，公约需要补全后置条件！");
            newGeneralTerm.setWhereStatement(generalClause.getWhereStatement());
        }
        return newGeneralTerm;
    }

    /**
     * 从公约是否需要补全私约的角度出发
     * 公约需补全私约前置条件时，返回true（即公约存在preCondition但是私约不存在），其余情况返回false
     *
     * @param generalTerm
     * @param generalClause
     * @return
     */
    @Override
    public boolean preHandle(GeneralTerm generalTerm, GeneralClause generalClause) {
        WhenStatement whenStatement_ct = generalTerm.getWhenStatement();
        WhenStatement whenStatement_cv = generalClause.getWhenStatement(); //公约中的前置条件 cv代表公约（Convention）
        //判断公约和私约对应条款中的前置条件 如果公约存在 preCondition，私约不存在 preCondition,返回true
        if (whenStatement_cv != null && whenStatement_ct == null) {
            return true;
        }
        return false;
    }

    // TODO 存在公约和私约都有对应的条件项时，公约对私约条件项进行检查的情况（后续可以考虑）

    /**
     * 从公约是否需要补全私约的角度出发
     * 公约需补全私约伴随条件时，返回true（即公约存在transaction但是私约不存在），其余情况返回false
     *
     * @param generalTerm
     * @param generalClause
     * @return
     */
    @Override
    public boolean process(GeneralTerm generalTerm, GeneralClause generalClause) {
        WhileStatement whileStatement_ct = generalTerm.getWhileStatement();
        WhileStatement whileStatement_cv = generalClause.getWhileStatement();

        if (whileStatement_cv != null && whileStatement_ct == null) {
            return true;
        }
        return false;
    }


    /**
     * 从公约是否需要补全私约的角度出发
     * 公约需补全私约后置条件时，返回true（即公约存在postCondition但是私约不存在），其余情况返回false
     *
     * @param generalTerm
     * @param generalClause
     * @return
     */
    @Override
    public boolean postHandle(GeneralTerm generalTerm, GeneralClause generalClause) {
        System.out.println("Checking " + generalTerm.getTermName() + " postCondition");
        WhereStatement whereStatement_ct = generalTerm.getWhereStatement();
        WhereStatement whereStatement_cv = generalClause.getWhereStatement();
        if (whereStatement_cv != null && whereStatement_ct != null) {
            return true;
        }
//        System.out.println(generalTerm.getTermName() + "不存在 postCondition ");
        return false;
    }


}
