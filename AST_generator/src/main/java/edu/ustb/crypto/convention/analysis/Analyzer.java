package edu.ustb.crypto.convention.analysis;

import edu.ustb.crypto.convention.checkProxy.BreachClauseInterfaceImpl;
import edu.ustb.crypto.convention.checkProxy.GeneralClauseInterfaceImpl;
import edu.ustb.crypto.convention.compile.entity.*;
import edu.ustb.crypto.convention.config.Mapping;
import edu.ustb.crypto.convention.contractUtils.TermClauseHandler;
import edu.ustb.crypto.convention.exception.BindException;
import edu.ustb.crypto.convention.utils.MappingProcessor;
import edu.ustb.crypto.convention.utils.ParserUtil;
import org.antlr.v4.runtime.misc.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static edu.ustb.crypto.convention.utils.YamlReader.loadYaml;


/**
 * @auther lwj
 * @date 2025/2/26 21:29
 */
public class Analyzer {

    static Logger logger = LoggerFactory.getLogger(Analyzer.class);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";

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
        Contract newContract = new Contract();
        newContract = contract;

        // load mapping file to memory(ContractData)
        setMappingInfos(mappingFile);

        // load contract infos to memory(ContractData)
        Analyzer.setRuntimeContractData(contract);

        // check bind
        checkBindRule(convention, contract, contractMappingFile, newContract);

        // check clause
        // 覆盖关系检查
        checkCoverRule(convention, contract, newContract);
        //补全关系检查
        checkSupplementalRule(convention, contract, newContract);


//        System.out.println(newContract);
        return newContract;
    }

    /**
     * 补全关系检查
     *
     * @param convention
     * @param contract
     * @param newContract
     */
    private static void checkSupplementalRule(Convention convention, Contract contract, Contract newContract) {
        logger.info("Start the supplement rule check.");
        List<GeneralClause> generalClauses = convention.getGeneralClauses();
        List<BreachClause> breachClauses = convention.getBreachClauses();

        List<GeneralTerm> generalTerms = contract.getGeneralTerms();
        List<BreachTerm> breachTerms = contract.getBreachTerms();
        String termName = null;
        if (breachTerms.size() > 0) {
            BreachTerm breachTerm = breachTerms.get(breachTerms.size() - 1);
            termName = breachTerm.getTermName();
        }
        if (generalTerms.size() > 0) {
            GeneralTerm generalTerm = generalTerms.get(generalTerms.size() - 1);
            termName = generalTerm.getTermName();
        }

        // 1.检查映射表，找到 action 中值为 “REQUIRED” 的公约行为名称
        LinkedHashMap<String, String> actionMap = ContractData.getActionMap();
        String finalTermName = termName;
        String numPart = finalTermName.replaceAll("[^\\d]", "");
        AtomicInteger no = new AtomicInteger(Integer.parseInt(numPart));
        String letterPart = finalTermName.replaceAll("[0-9]", "");

        actionMap.forEach((key, value) -> {
            if (value != null) {
                if (value.equals("REQUIRE") || value == "REQUIRE") {
                    TermClauseHandler termClauseHandler = new TermClauseHandler();
                    GeneralClause generalClause = termClauseHandler.getClauseByAction(generalClauses, key);
                    BreachClause breachClause = termClauseHandler.getClauseByAction(breachClauses, key);

                    // 2.如果该补全条款是一般条款，需要重新将公约条款内容按照私约条款语法进行赋值
                    if (generalClause != null) {
                        GeneralTerm generalTerm = new GeneralTerm();
                        no.incrementAndGet();
                        generalTerm.setTermName(letterPart + no.get());
                        generalTerm.setPartyName(generalClause.getPartyName());
                        if (generalClause.getDutyConditionType().equals("mustfulfil obligation") || generalClause.getDutyConditionType() == "mustfulfil obligation") {
                            generalTerm.setDuty("must");
                        } else if (generalClause.getDutyConditionType().equals("canexercise right") || generalClause.getDutyConditionType() == "canexercise right") {
                            generalTerm.setDuty("can");
                        }
                        generalTerm.setActionName(generalClause.getActionName());
                        generalTerm.setWhenStatement(generalClause.getWhenStatement());
                        generalTerm.setWhileStatement(generalClause.getWhileStatement());
                        generalTerm.setWhereStatement(generalClause.getWhereStatement());
                        // 3.根据 1 中的 actionName 对应的条款，加入新合约
                        addNewTerm(generalTerm, newContract);
//                        logger.info("The general [term {} : {}] has been Supplemented.",generalTerm.getTermName(),generalTerm.getActionName());
                        logger.info("The general [term {} : {}] has been Supplemented.",
                                ANSI_GREEN + generalTerm.getTermName() + ANSI_RESET,
                                ANSI_MAGENTA + generalTerm.getActionName() + ANSI_RESET);

                    }
                    if (breachClause != null) {
                        BreachTerm breachTerm = new BreachTerm();
                        no.incrementAndGet();
                        breachTerm.setTermName(letterPart + no.get());
                        breachTerm.setAgainstTermName(breachClause.getAgainstClauseName());
                        breachTerm.setPartyName(breachClause.getPartyName());
                        if (breachClause.getDutyConditionType().equals("mustfulfil obligation") || breachClause.getDutyConditionType() == "mustfulfil obligation") {
                            breachTerm.setDuty("must");
                        } else if (breachClause.getDutyConditionType().equals("canexercise right") || breachClause.getDutyConditionType() == "canexercise right") {
                            breachTerm.setDuty("can");
                        }
                        breachTerm.setActionName(breachClause.getActionName());
                        breachTerm.setWhenStatement(breachClause.getWhenStatement());
                        breachTerm.setWhileStatement(breachClause.getWhileStatement());
                        breachTerm.setWhereStatement(breachClause.getWhereStatement());
                        // 3.根据 1 中的 actionName 对应的条款，加入新合约
                        addNewTerm(breachTerm, newContract);
                        logger.info("The breach [term {} : {}] has been Supplemented.",
                                ANSI_GREEN + breachTerm.getTermName() + ANSI_RESET,
                                ANSI_MAGENTA + breachTerm.getActionName() + ANSI_RESET);

                    }
                }
            }
        });
        logger.info("End the supplement rule check.");
    }

    /**
     * 补全关系检查规则
     *
     * @param newTerm
     * @param newContract
     */
    public static void addNewTerm(Term newTerm, Contract newContract) {
        List<GeneralTerm> generalTerms = newContract.getGeneralTerms();
        List<BreachTerm> breachTerms = newContract.getBreachTerms();

        if (newTerm instanceof GeneralTerm) {
            generalTerms.add((GeneralTerm) newTerm);
        }
        if (newTerm instanceof BreachTerm) {
            breachTerms.add((BreachTerm) newTerm);
        }
    }

    /**
     * 覆盖关系检查规则
     *
     * @param convention
     * @param contract
     * @param newContract
     */
    private static void checkCoverRule(Convention convention, Contract contract, Contract newContract) {
        logger.info("Start the coverage rule check.");
        List<GeneralTerm> generalTerms = contract.getGeneralTerms();
        List<BreachTerm> breachTerms = contract.getBreachTerms();
        List<GeneralClause> generalClauses = convention.getGeneralClauses();
        List<BreachClause> breachClauses = convention.getBreachClauses();

        // 1.遍历 mapping 文件中的action内容，获取到 value 不为 null 且不为 REQUIRED 的 value ，即私约存在的 actionName
        LinkedHashMap<String, String> actionMap = ContractData.getActionMap();
        actionMap.forEach((key, value) -> {
            if (value != "null" && value != null && value != "REQUIRED") {
                // 2.分别根据 actionName 获取到对应的条款，然后进行条款检查
                // 2.1 检查一般条款
                TermClauseHandler termClauseHandler = new TermClauseHandler();
                if (generalTerms != null) {
                    GeneralTerm generalTerm = termClauseHandler.getTermByAction(generalTerms, value);
//                    System.out.println("Term:"+generalTerm);
                    if (generalTerm != null) {
                        GeneralClause generalClause = termClauseHandler.getClauseByAction(generalClauses, key);
                        String termName = generalTerm.getTermName();
                        GeneralTerm newGeneralTerm = new GeneralClauseInterfaceImpl().checkGeneral(generalTerm, generalClause, termName);
//                        System.out.println("newTerm:"+newGeneralTerm);
                        boolean isReplace = replaceGeneralTerm(newContract, newGeneralTerm, value);
//                        System.out.println("True Or False:"+generalTerm.equals(newGeneralTerm));
                        if (isReplace) {
//                            logger.info("The general term [{}] has been replaced successfully.", termName);
                            logger.info("The general term [{}] has been replaced successfully.",
                                    ANSI_GREEN + termName + ANSI_RESET);
                        }
                    }
                }

                // 2.2 检查违约条款
                if (breachTerms != null) {
                    BreachTerm breachTerm = termClauseHandler.getTermByAction(breachTerms, value);
                    if (breachTerm != null) {
                        BreachClause breachClause = termClauseHandler.getClauseByAction(breachClauses, key);
                        String termName = breachTerm.getTermName();
                        BreachTerm newBreachTerm = new BreachClauseInterfaceImpl().checkBreach(breachTerm, breachClause, termName);
                        boolean isReplace = replaceBreachTerm(newContract, newBreachTerm, value);
                        if (isReplace && !breachTerm.equals(newBreachTerm)) {
//                            logger.info("The breach term [{}] has been replaced successfully.", termName);
                            logger.info("The breach term [{}] has been replaced successfully.",
                                    ANSI_GREEN + termName + ANSI_RESET);
//                            System.out.println("行为名称为" + value + "的普通条款替换成功！");
                        }
                    }
                }
            }
        });
        logger.info("End the coverage rule check.");

    }


    /**
     * 检查约束条款中的内容
     *
     * @param convention
     * @param contract
     * @param contractMappingFile
     * @param newContract
     * @throws BindException
     */
    private static void checkBindRule(Convention convention, Contract contract, String contractMappingFile, Contract newContract) throws BindException {
        List<BindClause> bindClauses = convention.getBindClauses();
        logger.info("Start the bind constraint rule check.");
//        logger.warn("Detected a restriction on the contract attribute [{}renantBail{}] : renantBail <= rental",ANSI_RED, ANSI_RESET);
//        logger.info("The contract attribute [{}renantBail{}] is modified from the initial value of [{}4000RMB{}] to the required value of [{}2000RMB{}]",
//                ANSI_RED, ANSI_RESET,
//                ANSI_RED, ANSI_RESET,
//                ANSI_RED, ANSI_RESET);
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
//                            logger.error("Contract factor [{}] are illegal,Terminate the inspection process!", mappingText);
                            logger.error("Contract factor [{}] are illegal,terminate the inspection process!",
                                    ANSI_RED + mappingText + ANSI_RESET);
                            throw new BindException(mappingText + " should not be on the " + itemLimitationName + " list.");
                        }
                    } else { // 约束关键字为 IN ,私约要素 需要是限制列表中的内容
                        boolean isContains = itemLimitationsSet.contains(mappingText);
                        if (!isContains) {
                            logger.error("Contract factor [{}] are illegal,Terminate the inspection process!", mappingText);
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
                                    System.out.println("已将私约属性" + ctMappingText + "修改为要求值：" + p1_str);
                                    /*try {
                                        String p1_str=String.valueOf(p1);
                                        replaceAdditionValues(newContract,ctMappingText,p1_str);
                                        System.out.println("已将私约属性"+ctMappingText+"修改为要求值："+p1_str);
                                        throw new BindException("私约属性不满足公约属性约束！");
                                    } catch (BindException e) {
                                        throw new RuntimeException(e);
                                    }*/
                                }
//                                System.out.println("私约属性满足公约属性约束！");
                            }
                        }
                    });
                }
            }
        }
        logger.info("End the bind constraint rule check.");
    }

    /**
     * 替换新合约中的一般条款
     *
     * @param newContract
     * @param newGeneralTerm
     * @param actionName
     * @return
     */
    public static boolean replaceGeneralTerm(Contract newContract, GeneralTerm newGeneralTerm, String actionName) {
        List<GeneralTerm> generalTerms = newContract.getGeneralTerms();
        for (int i = 0; i < generalTerms.size(); i++) {
            String action = generalTerms.get(i).getActionName();
            if (action.equals(actionName)) {
                generalTerms.remove(generalTerms.get(i));
                generalTerms.add(i, newGeneralTerm);
                return true;
            }
        }
        return false;
    }

    /**
     * 替换新合约中的违约条款
     *
     * @param newContract
     * @param newBreachTerm
     * @param actionName
     * @return
     */
    public static boolean replaceBreachTerm(Contract newContract, BreachTerm newBreachTerm, String actionName) {
        List<BreachTerm> breachTerms = newContract.getBreachTerms();
        for (int i = 0; i < breachTerms.size(); i++) {
            String action = breachTerms.get(i).getActionName();
            if (action.equals(actionName)) {
                breachTerms.remove(breachTerms.get(i));
                breachTerms.add(i, newBreachTerm);
                return true;
            }
        }
        return false;
    }

    /**
     * 替换不符合公约约束的变量值
     *
     * @param newContract
     * @param ctProName
     * @param replaceValue
     */
    public static void replaceAdditionValues(Contract newContract, String ctProName, String replaceValue) {
        if (newContract == null) {
            return; // 如果 Contract 对象或 additions 为空，直接返回
        }
        Map<String, List<Pair<String, String>>> additions = newContract.getAdditions();
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

    /**
     * @param mapping_file_path
     */
    private static void setMappingInfos(String mapping_file_path) {
        // get mapping file
        Mapping config = loadYaml(mapping_file_path, Mapping.class);

        // struct mapping & set ContractData
        List<Map<String, String>> party = config.getParty();
        LinkedHashMap<String, String> partyMap = new LinkedHashMap<>();
        for (Map<String, String> stringStringMap : party) {
            stringStringMap.forEach((key, value) -> {
                partyMap.put(key, value);
            });
        }
        ContractData.setPartyMap(partyMap);

        List<Map<String, String>> action = config.getAction();
        LinkedHashMap<String, String> actionMap = new LinkedHashMap<>();
        for (Map<String, String> stringStringMap : action) {
            stringStringMap.forEach((key, value) -> {
                actionMap.put(key, value);
            });
        }
        ContractData.setActionMap(actionMap);

        List<Map<String, String>> asset = config.getAsset();
        LinkedHashMap<String, String> assetMap = new LinkedHashMap<>();
        for (Map<String, String> stringStringMap : asset) {
            stringStringMap.forEach((key, value) -> {
                assetMap.put(key, value);
            });
        }
        ContractData.setAssetMap(assetMap);

        List<Map<String, String>> attribute = config.getAttribute();
        LinkedHashMap<String, String> attributeMap = new LinkedHashMap<>();
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
        LinkedHashMap<String, List<Pair<String, String>>> additions = res.getAdditions();
        LinkedHashMap<String, List<Pair<String, String>>> partys = res.getPartys();
        LinkedHashMap<String, List<Pair<String, String>>> assetExtraProps = res.getAssetExtraProps();
        String constrainttedContractName = res.getConstrainttedContractName();
        LinkedHashMap<String, List<Pair<String, String>>> assets = res.getAssets();

        ContractData.contractName = res.getContractName();
        ContractData.setPartys(partys);
        ContractData.setAssets(assets);
        ContractData.setAssetExtraProps(assetExtraProps);
        ContractData.setAdditions(additions);
    }
}
