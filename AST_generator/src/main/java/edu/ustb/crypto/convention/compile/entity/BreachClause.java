package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/21 16:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BreachClause {
    private String clauseName;
    private List<String> againstClauseName;
    private String partyName;
    //right or obligation(canExerciseRight | mustFulfilObligation | CANNOT)
    private String dutyConditionType;
    private String actionName;
    private WhenStatement whenStatement;
    private WhileStatement whileStatement;
    private WhereStatement whereStatement;



}
