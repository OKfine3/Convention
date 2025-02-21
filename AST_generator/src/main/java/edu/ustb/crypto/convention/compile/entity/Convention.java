package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @auther lwj
 * @date 2025/2/20 19:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Convention extends Contract {
    String contractType = "convention";
    List<GeneralClause> generalClauses;
    List<BreachClause> breachClauses;
    List<BindClause> bindClauses;
    String contractName;

    Map<String, List<Pair<String, String>>> partys;
    Map<String, List<Pair<String, String>>> assets;
    Map<String, List<Pair<String, String>>> additions;
    List<Objects> legalRights;

    @Override
    public String toString() {
        System.out.println("合约类型：" + contractType);
        System.out.println("合约名称：" + contractName);
        System.out.println("当事人：" + partys);
        System.out.println("附加信息：" + additions);
        System.out.println("法定权利：" + legalRights);
        System.out.println("公约 - 普通条款：");
        for (GeneralClause generalClause : generalClauses) {
            System.out.println(generalClause);
        }
        System.out.println("公约 - 违约条款：");
        for (BreachClause breachClause : breachClauses) {
            System.out.println(breachClause);
        }
        System.out.println("公约 - 约束条款：");
        for (BindClause bindClause : bindClauses) {
            System.out.println(bindClause);
        }
        System.out.println();
        return "";
    }


}
