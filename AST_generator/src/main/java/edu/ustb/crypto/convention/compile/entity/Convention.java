package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedHashMap;
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
    String conventionName;

    LinkedHashMap<String, List<Pair<String, String>>> partys;
    LinkedHashMap<String, List<Pair<String, String>>> assets;
    LinkedHashMap<String, List<Pair<String, String>>> additions;
    List<Objects> legalRights;

    final String _n = "\n";
    final String separator = " ";

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("convention");
        res.append(separator);
        res.append(conventionName);
        res.append(separator);
        res.append("{");
        res.append(_n);

        // party
        partys.forEach((key, value) -> {
            res.append("party");
            res.append(separator);
            String partyname = key;
            res.append(partyname);
            res.append(separator);
            res.append("{");
            res.append(_n);
            for (Pair<String, String> pair : value) {
                String prop = pair.a;
                String val = pair.b;
                res.append(prop);
                res.append(":");
                res.append(val);
                res.append(_n);
            }
            res.append(_n);
            res.append("}");
            res.append(_n);
        });

        // asset
        assets.forEach((key, value) -> {
            res.append("asset");
            res.append(separator);
            String partyname = key;
            res.append(partyname);
            res.append(separator);
            res.append("{");
            res.append(_n);
            for (Pair<String, String> pair : value) {
                String prop = pair.a;
                String val = pair.b;
                res.append(prop);
                res.append(":");
                res.append(val);
                res.append(_n);
            }
            res.append(_n);
            res.append("}");
            res.append(_n);
        });

        // addition
        additions.forEach((key, value) -> {
            res.append("addition");
            res.append(separator);
            String partyname = key;
            res.append(partyname);
            res.append(separator);
            res.append("{");
            res.append(_n);
            for (Pair<String, String> pair : value) {
                String prop = pair.a;
                String val = pair.b;
                res.append(prop);
                res.append(":");
                res.append(val);
                res.append(_n);
            }
            res.append(_n);
            res.append("}");
            res.append(_n);
        });
        if (bindClauses != null) {
            for (BindClause bindClause : bindClauses) {
                res.append(bindClause);
                res.append(_n);
            }
        }
        if (generalClauses != null) {
            for (GeneralClause generalClause : generalClauses) {
                res.append(generalClause);
                res.append(_n);
            }
        }
        if (breachClauses != null) {
            for (BreachClause breachClause : breachClauses) {
                res.append(breachClause);
                res.append(_n);
            }
        }

        res.append("}");
        return res.toString();
    }

/*    @Override
    public String toString() {
        System.out.println("合约类型：" + contractType);
        System.out.println("合约名称：" + contractName);
        System.out.println("当事人：" + partys);
        System.out.println("附加信息：" + additions);
//        System.out.println("法定权利：" + legalRights);
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
    }*/


}
