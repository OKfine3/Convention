package edu.ustb.crypto.convention.analysis;

import lombok.Data;
import org.antlr.v4.runtime.misc.Pair;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther lwj
 * @date 2025/2/27 10:59
 */
@Data
public class ContractData {
    public static String contractName;
    public static LinkedHashMap<String, List<Pair<String, String>>> partys;

    public static LinkedHashMap<String, List<Pair<String, String>>> assets;
    public static LinkedHashMap<String, List<Pair<String, String>>> assetExtraProps;

    public static LinkedHashMap<String, List<Pair<String, String>>> additions;

    // 下面是映射表信息
    public static LinkedHashMap<String, String> partyMap;
    public static LinkedHashMap<String, String> actionMap;
    public static LinkedHashMap<String, String> assetMap;
    public static LinkedHashMap<String, String> attributeMap;

    public static LinkedHashMap<String, List<Pair<String, String>>> getPartys() {
        return partys;
    }

    public static void setPartys(LinkedHashMap<String, List<Pair<String, String>>> partys) {
        ContractData.partys = partys;
    }

    public static LinkedHashMap<String, List<Pair<String, String>>> getAssets() {
        return assets;
    }

    public static void setAssets(LinkedHashMap<String, List<Pair<String, String>>> assets) {
        ContractData.assets = assets;
    }

    public static LinkedHashMap<String, List<Pair<String, String>>> getAssetExtraProps() {
        return assetExtraProps;
    }

    public static void setAssetExtraProps(LinkedHashMap<String, List<Pair<String, String>>> assetExtraProps) {
        ContractData.assetExtraProps = assetExtraProps;
    }

    public static LinkedHashMap<String, List<Pair<String, String>>> getAdditions() {
        return additions;
    }

    public static void setAdditions(LinkedHashMap<String, List<Pair<String, String>>> additions) {
        ContractData.additions = additions;
    }

    public static LinkedHashMap<String, String> getPartyMap() {
        return partyMap;
    }

    public static void setPartyMap(LinkedHashMap<String, String> partyMap) {
        ContractData.partyMap = partyMap;
    }

    public static LinkedHashMap<String, String> getActionMap() {
        return actionMap;
    }

    public static void setActionMap(LinkedHashMap<String, String> actionMap) {
        ContractData.actionMap = actionMap;
    }

    public static LinkedHashMap<String, String> getAssetMap() {
        return assetMap;
    }

    public static void setAssetMap(LinkedHashMap<String, String> assetMap) {
        ContractData.assetMap = assetMap;
    }

    public static LinkedHashMap<String, String> getAttributeMap() {
        return attributeMap;
    }

    public static void setAttributeMap(LinkedHashMap<String, String> attributeMap) {
        ContractData.attributeMap = attributeMap;
    }

}
