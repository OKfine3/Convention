package edu.ustb.crypto.convention.contractUtils;

import edu.ustb.crypto.convention.compile.entity.*;

import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/24 10:39
 */
public class TermClauseHandler {


    /**
     * 根据 action 名称获取对应的私约条款
     * (条款中应当不允许存在 actionName 重复的条款)
     *
     * @param generalTerms
     * @param name
     * @return
     */
    public GeneralTerm getTermByAction(List<GeneralTerm> generalTerms, String name) {
        for (GeneralTerm generalTerm : generalTerms) {
            String actionName = generalTerm.getActionName();
            if (actionName.equals(name)) {
                return generalTerm;
            }
        }
        // TODO 后续可能需要抛出异常信息
        System.out.println("没有与 actionName 相匹配的条款");
        return null;
    }

    /**
     * 根据 action 名称获取对应的公约条款
     *
     * @param generalClauses
     * @param name
     * @return
     */
    public GeneralClause getClauseByAction(List<GeneralClause> generalClauses, String name) {
        for (GeneralClause generalClause : generalClauses) {
            String actionName = generalClause.getActionName();
            if (actionName.equals(name)) {
                return generalClause;
            }
        }
        System.out.println("没有与 actionName 相匹配的条款");
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
