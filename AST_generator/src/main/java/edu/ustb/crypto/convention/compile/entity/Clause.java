package edu.ustb.crypto.convention.compile.entity;

import lombok.Data;

/**
 * @auther lwj
 * @date 2025/2/25 15:09
 */
@Data
public class Clause {
    private String clauseName;

    private String partyName;
    // right or obligation(canExerciseRight | mustFulfilObligation | CANNOT)
    private String dutyConditionType;
    private String actionName;

    private WhenStatement whenStatement;
    private WhileStatement whileStatement;
    private WhereStatement whereStatement;
}
