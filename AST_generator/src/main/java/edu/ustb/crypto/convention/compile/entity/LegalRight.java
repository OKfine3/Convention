package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/23 9:19
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LegalRight {
    //权利名称
    String rightName;
    //包含子权利
    String includingRightName;

    //权利主体
    String rightSubject;

    //权利客体
    List<String> rightObjectName;
    //法律来源
    List<String> lawSource;
}
