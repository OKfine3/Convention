package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 一个条款中包含的条件
 *
 * @auther lwj
 * @date 2025/2/24 10:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Condition {

    WhenStatement whenStatement;
    WhileStatement whileStatement;
    WhereStatement whereStatement;
}
