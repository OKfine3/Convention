package edu.ustb.crypto.convention.compile.entity;

import lombok.Data;

import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/25 15:07
 */
@Data
public class Term {
    private String termName;
    private String partyName;
    private String duty;
    private String actionName;
    private List<String> parameterList;
    private WhenStatement whenStatement;
    private WhileStatement whileStatement;
    private WhereStatement whereStatement;
}
