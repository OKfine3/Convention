package edu.ustb.crypto.convention.mapping;

import edu.ustb.crypto.convention.compile.entity.BreachClause;
import edu.ustb.crypto.convention.compile.entity.Convention;
import edu.ustb.crypto.convention.compile.entity.GeneralClause;
import org.antlr.v4.runtime.misc.Pair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;
import java.util.*;

/**
 * 获取公约需要映射的内容 作为映射表中的键信息
 *
 * @auther lwj
 * @date 2025/2/25 16:16
 */
public class ConventionMap {

    /**
     * 创建映射表，其中 key 是公约中的对应信息，值此处设为 null,待后续私约填充
     * @param convention
     * @return
     */
    public Map<String, List<Pair<String, String>>> getConventionKey(Convention convention) {
        // 存放映射信息
        Map<String, List<Pair<String, String>>> mappingTable = new LinkedHashMap<>();

        //取出公约中的party结构  partys : <Seller:field>
        Map<String, List<Pair<String, String>>> partys = convention.getPartys();
        // 创建一个List来存储公约中的party名称，作为party映射表中的键
        List<Pair<String, String>> partyPairs = new ArrayList<>();

        partys.forEach((key, value) -> {
            //mapName 表示是 party 结构的映射
            String mapName = key;
            Pair<String, String> pair = new Pair<>(mapName, null);
            partyPairs.add(pair);
        });
        mappingTable.put("party", partyPairs);

        //取出公约中的 asset 结构  assets : <Goods:field>
        Map<String, List<Pair<String, String>>> assets = convention.getAssets();
        List<Pair<String, String>> assetPairs = new ArrayList<>();
        assets.forEach((key, vlaue) -> {
            //此处的 key 表示公约结构中的资产名称
            Pair<String, String> pair = new Pair<>(key, null);
            assetPairs.add(pair);
        });
        mappingTable.put("asset", assetPairs);

        //取出公约中的属性 addition 结构  additions : <addition:field>
        Map<String, List<Pair<String, String>>> additions = convention.getAdditions();
        List<Pair<String, String>> additionPairs = new ArrayList<>();
        additions.forEach((key, value) -> {
            for (Pair<String, String> pair : value) {
                String fieldKey = pair.a;
                Pair<String, String> newPair = new Pair<>(fieldKey, null);
                additionPairs.add(newPair);
            }
        });
        mappingTable.put("attribute", additionPairs);

        //提取公约中的 actionName
        List<GeneralClause> generalClauses = convention.getGeneralClauses();
        List<BreachClause> breachClauses = convention.getBreachClauses();
        List<Pair<String, String>> actionPairs = new ArrayList<>();
        for (GeneralClause generalClause : generalClauses) {
            String actionName = generalClause.getActionName();
            Pair<String, String> pair = new Pair<>(actionName, null);
            actionPairs.add(pair);
        }
        for (BreachClause breachClause : breachClauses) {
            String actionName = breachClause.getActionName();
            Pair<String, String> pair = new Pair<>(actionName, null);
            actionPairs.add(pair);
        }
        mappingTable.put("action", actionPairs);
        return mappingTable;
    }

    /**
     * 将公约中获取到的映射表中的key填入到mapping.yaml文件中
     * @param mappingTable
     * @param filePath
     */
    public void convertToYaml(Map<String, List<Pair<String, String>>> mappingTable, String filePath) {
        StringBuilder yamlContent = new StringBuilder();

        // 遍历Map并构建YAML内容
        for (Map.Entry<String, List<Pair<String, String>>> entry : mappingTable.entrySet()) {
            String key = entry.getKey();
            List<Pair<String, String>> pairs = entry.getValue();

            // 添加键
            yamlContent.append(key).append(":\n");

            // 添加键对应的Pair列表
            for (Pair<String, String> pair : pairs) {
                yamlContent.append("  - ").append(pair.a).append(": ").append(pair.b).append("\n");
            }
        }

        // 将内容写入文件
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(yamlContent.toString());
            System.out.println("映射表YAML文件已生成：" + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
