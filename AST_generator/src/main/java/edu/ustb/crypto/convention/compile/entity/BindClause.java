package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lijiru152@qq.com
 * @date 2024/6/1 14:55
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BindClause {
    private String clauseName;
    private OrExpression childExpression;
    private OrExpression factorBinds;
}
