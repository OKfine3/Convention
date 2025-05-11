package edu.ustb.crypto.convention.contractUtils;

import edu.ustb.crypto.convention.compile.entity.*;

import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/24 10:39
 */
public class TermClauseHandler {


    public <T extends Term> T getTermByAction(List<T> terms, String name) {
        for (T term : terms) {
            String actionName = term.getActionName();
            if (actionName.equals(name)) {
                return term;
            }
        }
        // TODO 后续可能需要抛出异常信息
//        System.out.println("没有与 actionName 相匹配的条款");
        return null;
    }


    public <C extends Clause> C getClauseByAction(List<C> clauses, String name) {
        for (C clause : clauses) {
            String actionName = clause.getActionName();
            if (actionName.equals(name)) {
                return clause;
            }
        }
//        System.out.println("没有与 actionName 相匹配的条款");
        return null;
    }

    public String getTermNameByAction() {

        return null;

    }

    /**
     * 获取私约条款中的条件
     *
     * @param generalTerm
     * @return
     */
    public Condition getCondInTerm(GeneralTerm generalTerm) {
        Condition condition = new Condition();

        WhenStatement whenStatement = generalTerm.getWhenStatement();
        WhileStatement whileStatement = generalTerm.getWhileStatement();
        WhereStatement whereStatement = generalTerm.getWhereStatement();
        if (whenStatement != null) {
            condition.setWhenStatement(whenStatement);
        }
        if (whileStatement != null) {
            condition.setWhileStatement(whileStatement);
        }
        if (whereStatement != null) {
            condition.setWhereStatement(whereStatement);
        }
        return condition;
    }

    /**
     * 获取公约条款中的条件
     *
     * @param generalClause
     * @return
     */
    public Condition getCondInClause(GeneralClause generalClause) {
        Condition condition = new Condition();

        WhenStatement whenStatement = generalClause.getWhenStatement();
        WhileStatement whileStatement = generalClause.getWhileStatement();
        WhereStatement whereStatement = generalClause.getWhereStatement();
        if (whenStatement != null) {
            condition.setWhenStatement(whenStatement);
        }
        if (whileStatement != null) {
            condition.setWhileStatement(whileStatement);
        }
        if (whereStatement != null) {
            condition.setWhereStatement(whereStatement);
        }
        return condition;
    }

}
