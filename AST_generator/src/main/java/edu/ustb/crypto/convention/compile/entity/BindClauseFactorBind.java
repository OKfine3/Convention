package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author lijiru152@qq.com
 * @date 2024/6/1 15:19
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BindClauseFactorBind {
    String partyName;

    Boolean ifNotIn = Boolean.FALSE;

    String itemLimitationName;
    List<String> itemLimitations;
}
