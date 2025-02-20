package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AndExpression {
    // 其中之一
    WhenGeneralExpression whenGeneralExpression;
    WhileGeneralExpression whileGeneralExpression;
    WhereGeneralExpression whereGeneralExpression;

    BindClauseChildExpression bindClauseChildExpression;
    BindClauseFactorBind bindClauseFactorBind;
}
