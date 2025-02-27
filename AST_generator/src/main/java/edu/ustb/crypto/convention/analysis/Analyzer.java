package edu.ustb.crypto.convention.analysis;

import edu.ustb.crypto.convention.compile.entity.*;
import edu.ustb.crypto.convention.config.Mapping;
import edu.ustb.crypto.convention.exception.BindException;
import edu.ustb.crypto.convention.utils.MappingProcessor;
import edu.ustb.crypto.convention.utils.ParserUtil;
import org.antlr.v4.runtime.misc.Pair;


import java.util.*;

import static edu.ustb.crypto.convention.utils.YamlReader.loadYaml;


/**
 * @auther lwj
 * @date 2025/2/26 21:29
 */
public class Analyzer {

    /**
     * 加载映射文件
     *
     * @param contract
     * @param convention
     * @param mappingFile
     * @return
     * @throws Exception
     */
    public static Contract start(Contract contract, Convention convention, String mappingFile, String contractMappingFile) throws Exception {
        // the final contract
        Contract res = new Contract();
        res = contract;

        // load mapping file to memory(ContractData)
        setMappingInfos(mappingFile);

        // load contract infos to memory(ContractData)
        Analyzer.setRuntimeContractData(contract);

        // check bind
        checkConventionBind(convention, contract, contractMappingFile, res);
        // check clause
        System.out.println(res);
        return res;
    }

    //检查约束条款中的内容
    private static void checkConventionBind(Convention convention, Contract contract, String contractMappingFile, Contract newContract) throws BindException {
        List<BindClause> bindClauses = convention.getBindClauses();
        for (BindClause bindClause : bindClauses) {
            // 检查限制要素约束条件 eg. Good NOT_IN ProhibitedItems = [Firearms, Drugs, StolenGoods, HumanOrgans]
            List<AndExpression> andExpressions = bindClause.getFactorBinds().getAndExpression();
            for (AndExpression andExpression : andExpressions) {
                BindClauseFactorBind bindClauseFactorBind = andExpression.getBindClauseFactorBind();
                Boolean ifNotIn = bindClauseFactorBind.getIfNotIn();
                List<String> itemLimitations = bindClauseFactorBind.getItemLimitations();
                String factorName = bindClauseFactorBind.getPartyName();
                String itemLimitationName = bindClauseFactorBind.getItemLimitationName();
                String mappingText = null;
                HashSet<String> itemLimitationsSet = new HashSet<>(itemLimitations);
                //获取公私约映射表中私约对应的要素
                mappingText = MappingProcessor.getMappingText(factorName);
                //如果私约中存在对应的被约束要素
                if (mappingText != null && mappingText != "") {
                    //约束关键字为 NOT_IN,也就是 私约要素 不能是限制列表中的内容
                    if (!ifNotIn) {
                        boolean isContains = itemLimitationsSet.contains(mappingText);
                        if (isContains) {
                            throw new BindException(mappingText + " should not be on the " + itemLimitationName + " list.");
                        }
                    } else { // 约束关键字为 IN ,私约要素 需要是限制列表中的内容
                        boolean isContains = itemLimitationsSet.contains(mappingText);
                        if (!isContains) {
                            throw new BindException(mappingText + " should be on the " + itemLimitationName + " list.");
                        }
                    }
                }
            }

            // 检查表达式是否符合规范  eg. downPayment <= price * 20
            List<OrExpression> childExpressions = bindClause.getChildExpression();
            for (OrExpression orExpression : childExpressions) {
                for (AndExpression andExpression : orExpression.getAndExpression()) {
                    BindClauseChildExpression bindClauseChildExpression = andExpression.getBindClauseChildExpression();
                    //获取公约约束变量名称
                    String p0 = bindClauseChildExpression.getP0();
                    String equalSeparator = bindClauseChildExpression.getEqualSeparator();
                    //TODO 根据变量名称到私约中取出实际的值进行判断的步骤，不一定是Double类型
                    double p1 = Double.parseDouble((String) bindClauseChildExpression.getP1());
                    //获取公私约映射表中约束变量对应的私约变量
                    String ctMappingText = MappingProcessor.getMappingText(p0);
                    //获取私约中对应的属性值
                    Map<String, List<Pair<String, String>>> additions = ContractData.getAdditions();
                    additions.forEach((key, value) -> {
                        for (Pair<String, String> pair : value) {
                            if (pair.a.equals(ctMappingText)) {
                                double p0_double = Double.parseDouble(pair.b);
                                boolean compare = ParserUtil.compare(p0_double, p1, equalSeparator);
                                if (!compare) {
                                    // TODO 修改私约属性为满足要求的值，并生效于新合约
                                    String p1_str = String.valueOf(p1);
                                    replaceAdditionValues(newContract, ctMappingText, p1_str);
//                                    System.out.println("已将私约属性"+ctMappingText+"修改为要求值："+p1_str);
                                    /*try {
                                        String p1_str=String.valueOf(p1);
                                        replaceAdditionValues(newContract,ctMappingText,p1_str);
                                        System.out.println("已将私约属性"+ctMappingText+"修改为要求值："+p1_str);
                                        throw new BindException("私约属性不满足公约属性约束！");
                                    } catch (BindException e) {
                                        throw new RuntimeException(e);
                                    }*/
                                }
                                System.out.println("私约属性满足公约属性约束！");
                            }
                        }
                    });
                }
            }

        }
    }

    /**
     * 替换不符合公约约束的变量值
     *
     * @param contract
     * @param ctProName
     * @param replaceValue
     */
    public static void replaceAdditionValues(Contract contract, String ctProName, String replaceValue) {
        if (contract == null) {
            return; // 如果 Contract 对象或 additions 为空，直接返回
        }
        Map<String, List<Pair<String, String>>> additions = contract.getAdditions();
        Set<Map.Entry<String, List<Pair<String, String>>>> entries = additions.entrySet();
        for (Map.Entry<String, List<Pair<String, String>>> entry : entries) {
            List<Pair<String, String>> pairs = entry.getValue();
            if (pairs != null) {
                for (int i = 0; i < pairs.size(); i++) {
                    if (pairs.get(i).a.equals(ctProName)) {
                        Pair<String, String> pair = pairs.get(i);
                        pairs.set(i, new Pair<>(pair.a, replaceValue));
                    }
                }
            }
        }
    }

    private static void setMappingInfos(String mapping_file_path) {
        // get mapping file
        Mapping config = loadYaml(mapping_file_path, Mapping.class);

        // struct mapping & set ContractData
        List<Map<String, String>> party = config.getParty();
        Map<String, String> partyMap = new HashMap<>();
        for (Map<String, String> stringStringMap : party) {
            stringStringMap.forEach((key, value) -> {
                partyMap.put(key, value);
            });
        }
        ContractData.setPartyMap(partyMap);

        List<Map<String, String>> action = config.getAction();
        Map<String, String> actionMap = new HashMap<>();
        for (Map<String, String> stringStringMap : action) {
            stringStringMap.forEach((key, value) -> {
                actionMap.put(key, value);
            });
        }
        ContractData.setActionMap(actionMap);

        List<Map<String, String>> asset = config.getAsset();
        Map<String, String> assetMap = new HashMap<>();
        for (Map<String, String> stringStringMap : asset) {
            stringStringMap.forEach((key, value) -> {
                assetMap.put(key, value);
            });
        }
        ContractData.setAssetMap(assetMap);

        List<Map<String, String>> attribute = config.getAttribute();
        Map<String, String> attributeMap = new HashMap<>();
        for (Map<String, String> stringStringMap : attribute) {
            stringStringMap.forEach((key, value) -> {
                attributeMap.put(key, value);
            });
        }
        ContractData.setAttributeMap(attributeMap);
    }

    /**
     * 加载合约到内存运行的逻辑
     *
     * @param res
     */
    public static void setRuntimeContractData(Contract res) {
        List<GeneralTerm> generalTerms = res.getGeneralTerms();
        String contractName = res.getContractName();
        Map<String, List<Pair<String, String>>> additions = res.getAdditions();
        Map<String, List<Pair<String, String>>> partys = res.getPartys();
        Map<String, List<Pair<String, String>>> assetExtraProps = res.getAssetExtraProps();
        String constrainttedContractName = res.getConstrainttedContractName();
        Map<String, List<Pair<String, String>>> assets = res.getAssets();

        ContractData.contractName = res.getContractName();
        ContractData.setPartys(partys);
        ContractData.setAssets(assets);
        ContractData.setAssetExtraProps(assetExtraProps);
        ContractData.setAdditions(additions);
    }
}
