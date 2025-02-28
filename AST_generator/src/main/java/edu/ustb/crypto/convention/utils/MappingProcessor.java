package edu.ustb.crypto.convention.utils;

import edu.ustb.crypto.convention.analysis.ContractData;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author lijiru152@qq.com
 * @date 2024/6/16 14:36
 */
public class MappingProcessor {
    public static void main(String[] args) {
        String str = "partyName";
        getMappingText(str);
    }

    /**
     * 根据约束条款中的变量名称，到公私约映射表中获取到对应的私约属性
     * @param text
     * @return
     */
    public static String getMappingText(String text) {
        Map<String, String> assetMap = ContractData.getAssetMap();
        Map<String, String> attributeMap = ContractData.getAttributeMap();
        Map<String, String> actionMap = ContractData.getActionMap();
        Map<String, String> partyMap = ContractData.getPartyMap();

        AtomicReference<String> res = new AtomicReference<>("");
        assetMap.forEach((key, value) -> {
            if (key.equals(text)) {
                res.set(new String(value));
            }
        });
        attributeMap.forEach((key, value) -> {
            if (key.equals(text)) {
                res.set(new String(value));
            }
        });
        actionMap.forEach((key, value) -> {
            if (key.equals(text)) {
                res.set(new String(value));
            }
        });
        partyMap.forEach((key, value) -> {
            if (key.equals(text)) {
                res.set(new String(value));
            }
        });
        return res.get();
    }
}
