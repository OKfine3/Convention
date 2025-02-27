package edu.ustb.crypto.convention;

import edu.ustb.crypto.convention.analysis.Analyzer;
import edu.ustb.crypto.convention.analysis.Iterator;
import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.compile.entity.Convention;
import edu.ustb.crypto.convention.compile.visitor.ContractVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.junit.Test;

/**
 * @auther lwj
 * @date 2025/2/26 21:09
 */
public class ContractApplicationTest {
    @Test
    public void finalTest() throws Exception {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyContract.spesc");
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        // 检查是否解析公约
        String constrainttedContractName = contract.getConstrainttedContractName();
        Convention convention = null;
        Contract res = contract;
        if (constrainttedContractName != null) {
            String conventionfilenameaddr = constrainttedContractName + ".spesc";
            parser = Iterator.getParser("spesc_files/" + conventionfilenameaddr);
            // 遍历抽象语法树最后返回公约对象
            convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
            // 加载公约规则映射
            String mappingFile = "mapping_files/mapping.yaml";
            String contractMappingFile = "mapping_files/contractMapping.yaml";
            Contract newContract = Analyzer.start(contract, convention, mappingFile, contractMappingFile);
            //条款覆盖，变量检查等，获得最终的执行合约 TODO 论文中的内容实现（用前两步生成的合约进行规则逻辑的整合，生成新合约）
        }
        //建立映射关系
    }
}
