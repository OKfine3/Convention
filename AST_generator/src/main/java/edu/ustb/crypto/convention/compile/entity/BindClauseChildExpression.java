package edu.ustb.crypto.convention.compile.entity;

import edu.ustb.crypto.convention.spescParser.SpescParser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lijiru152@qq.com
 * @date 2024/6/1 15:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BindClauseChildExpression {
    final String separator = " ";

    String p0;
    String equalSeparator;
    SpescParser.Arithmetic_expressionContext p1;
}
