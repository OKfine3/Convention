package edu.ustb.crypto.convention.analysis;

import lombok.Data;
import org.antlr.v4.runtime.misc.Pair;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * @auther lwj
 * @date 2025/2/27 10:59
 */
@Data
public class ContractData {
    public static String contractName;
    public static Map<String, List<Pair<String, String>>> partys;

    public static Map<String, List<Pair<String, String>>> assets;
    public static Map<String, List<Pair<String, String>>> assetExtraProps;

    public static Map<String, List<Pair<String, String>>> additions;

    // 下面是映射表信息
    public static Map<String, String> partyMap;
    public static Map<String, String> actionMap;
    public static Map<String, String> assetMap;
    public static Map<String, String> attributeMap;

    public static Map<String, List<Pair<String, String>>> getPartys() {
        return partys;
    }

    public static void setPartys(Map<String, List<Pair<String, String>>> partys) {
        ContractData.partys = partys;
    }

    public static Map<String, List<Pair<String, String>>> getAssets() {
        return assets;
    }

    public static void setAssets(Map<String, List<Pair<String, String>>> assets) {
        ContractData.assets = assets;
    }

    public static Map<String, List<Pair<String, String>>> getAssetExtraProps() {
        return assetExtraProps;
    }

    public static void setAssetExtraProps(Map<String, List<Pair<String, String>>> assetExtraProps) {
        ContractData.assetExtraProps = assetExtraProps;
    }

    public static Map<String, List<Pair<String, String>>> getAdditions() {
        return additions;
    }

    public static void setAdditions(Map<String, List<Pair<String, String>>> additions) {
        ContractData.additions = additions;
    }

    public static Map<String, String> getPartyMap() {
        return partyMap;
    }

    public static void setPartyMap(Map<String, String> partyMap) {
        ContractData.partyMap = partyMap;
    }

    public static Map<String, String> getActionMap() {
        return actionMap;
    }

    public static void setActionMap(Map<String, String> actionMap) {
        ContractData.actionMap = actionMap;
    }

    public static Map<String, String> getAssetMap() {
        return assetMap;
    }

    public static void setAssetMap(Map<String, String> assetMap) {
        ContractData.assetMap = assetMap;
    }

    public static Map<String, String> getAttributeMap() {
        return attributeMap;
    }

    public static void setAttributeMap(Map<String, String> attributeMap) {
        ContractData.attributeMap = attributeMap;
    }

}
