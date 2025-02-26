package edu.ustb.crypto.convention.mapping;

import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.compile.entity.GeneralTerm;
import org.antlr.v4.runtime.misc.Pair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * @auther lwj
 * @date 2025/2/26 19:32
 */
public class ContractMap {
    public void buildContractMap(Contract contract, String filePath) {
        // 存放私约映射信息
        Map<String, List<Pair<String, String>>> mappingTable = new LinkedHashMap<>();

        //party
        Map<String, List<Pair<String, String>>> partys = contract.getPartys();

        partys.forEach((key, value) -> {
            List<Pair<String, String>> partyPairs = new ArrayList<>();
            for (Pair<String, String> pair : value) {
                Pair<String, String> newPair = new Pair<>(pair.a, pair.b);
                partyPairs.add(newPair);
            }
            mappingTable.put(key, partyPairs);
        });

        //asset
        Map<String, List<Pair<String, String>>> assets = contract.getAssets();

        assets.forEach((key, value) -> {
            List<Pair<String, String>> assetPairs = new ArrayList<>();
            for (Pair<String, String> pair : value) {
                Pair<String, String> newPair = new Pair<>(pair.a, pair.b);
                assetPairs.add(newPair);
            }
            mappingTable.put(key, assetPairs);
        });

        //addition
        Map<String, List<Pair<String, String>>> additions = contract.getAdditions();
        List<Pair<String, String>> additionPairs = new ArrayList<>();
        additions.forEach((key, value) -> {
            for (Pair<String, String> pair : value) {
                Pair<String, String> newPair = new Pair<>(pair.a, pair.b);
                additionPairs.add(newPair);
            }
        });
        mappingTable.put("addition", additionPairs);

        List<Pair<String, String>> actions = new ArrayList<>();
        List<GeneralTerm> generalTerms = contract.getGeneralTerms();
        for (GeneralTerm generalTerm : generalTerms) {
            String actionName = generalTerm.getActionName();
            Pair<String, String> pair = new Pair<>(actionName, null);
            actions.add(pair);
        }
        mappingTable.put("action", actions);

        new ConventionMap().convertToYaml(mappingTable, filePath);
    }
}
