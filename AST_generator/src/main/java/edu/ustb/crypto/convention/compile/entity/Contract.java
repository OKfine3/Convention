package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    String contractType = "contract";
    String contractName;

    String constrainttedContractName;

    Map<String, List<Pair<String,String>>> partys;

    Map<String, List<Pair<String,String>>> assets;
    Map<String, List<Pair<String,String>>> assetExtraProps;

    Map<String, List<Pair<String,String>>> additions;

    List<GeneralTerm> generalTerms;

    // TODO 违约条款

    // TODO 仲裁条款

    final String _n = "\n";
    final String separator = " ";

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append("contract");
        res.append(separator);
        res.append(contractName);
        res.append(separator);
        res.append("{");
        res.append(_n);

        // party
        partys.forEach((key,value) ->{
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
        assets.forEach((key,value) ->{
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
        additions.forEach((key,value) ->{
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
        if(generalTerms!=null){
            for (GeneralTerm generalTerm : generalTerms) {
                res.append(generalTerm.toString());
                res.append(_n);
            }
        }
        res.append("}");
        return res.toString();
    }
}
