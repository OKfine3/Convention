package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GeneralClause {
    private String clauseName;

    private String partyName;
    // right or obligation
    private String dutyConditionType;
    private String actionName;

    private WhenStatement whenStatement;
    private WhileStatement whileStatement;
    private WhereStatement whereStatement;
}
