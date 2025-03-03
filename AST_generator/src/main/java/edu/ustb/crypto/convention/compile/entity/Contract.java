package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.antlr.v4.runtime.misc.Pair;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    String contractType = "contract";
    String contractName;

    String constrainttedContractName;

    LinkedHashMap<String, List<Pair<String, String>>> partys;

    LinkedHashMap<String, List<Pair<String, String>>> assets;
    LinkedHashMap<String, List<Pair<String, String>>> assetExtraProps;

    LinkedHashMap<String, List<Pair<String, String>>> additions;

    List<GeneralTerm> generalTerms;

    List<BreachTerm> breachTerms;

    // TODO 仲裁条款

    LinkedHashMap<String, List<Pair<String, String>>> signatures;

    final String _n = "\n";
    final String separator = " ";

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append("contract");
        res.append(separator);
        res.append(contractName);
        res.append(separator);
        res.append("constraint_by ");
        res.append(constrainttedContractName);
        res.append("{");
        res.append(_n);

        // party
        partys.forEach((key, value) -> {
            res.append("\tparty");
            res.append(separator);
            String partyname = key;
            res.append(partyname);
            res.append(separator);
            res.append("{");
            res.append(_n);
            for (Pair<String, String> pair : value) {
                String prop = pair.a;
                String val = pair.b;
                res.append("\t\t");
                res.append(prop);
                res.append(":");
                res.append(val);
                res.append(_n);
            }
            res.append(_n);
            res.append("\t}");
            res.append(_n);
        });

        // asset
        assets.forEach((key, value) -> {
            res.append("\tasset");
            res.append(separator);
            String partyname = key;
            res.append(partyname);
            res.append(separator);
            res.append("{");
            res.append(_n);
            for (Pair<String, String> pair : value) {
                String prop = pair.a;
                String val = pair.b;
                res.append("\t\t");
                res.append(prop);
                res.append(":");
                res.append(val);
                res.append(_n);
            }
            res.append(_n);
            res.append("\t}");
            res.append(_n);
        });


        // addition
        additions.forEach((key, value) -> {
            res.append("\taddition");
            res.append(separator);
            String partyname = key;
            res.append(partyname);
            res.append(separator);
            res.append("{");
            res.append(_n);
            for (Pair<String, String> pair : value) {
                String prop = pair.a;
                String val = pair.b;
                res.append("\t\t");
                res.append(prop);
                res.append(":");
                res.append(val);
                res.append(_n);
            }
            res.append(_n);
            res.append("\t}");
            res.append(_n);
        });
        if (generalTerms != null) {
            for (GeneralTerm generalTerm : generalTerms) {
                res.append("\t");
                res.append(generalTerm.toString());
                res.append(_n);
            }
        }
        if (breachTerms != null) {
            for (BreachTerm breachTerm : breachTerms) {
                res.append("\t");
                res.append(breachTerm.toString());
                res.append(_n);
            }
        }

        signatures.forEach((key, value) -> {
            res.append("\tsignature of party ");
            res.append(key);
            res.append("{");
            res.append(_n);
            for (Pair<String, String> pair : value) {
                String name = pair.a;
                String val = pair.b;
                res.append("\t\t");
                res.append(name);
                res.append(":");
                res.append(val);
                res.append(_n);
            }
            res.append("\t}");
            res.append(_n);
        });

        res.append("}");
        return res.toString();
    }
}
