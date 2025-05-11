package edu.ustb.crypto.convention;

import edu.ustb.crypto.convention.analysis.Analyzer;
import edu.ustb.crypto.convention.analysis.Iterator;
import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.compile.entity.Convention;
import edu.ustb.crypto.convention.compile.visitor.ContractVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import edu.ustb.crypto.convention.utils.FileWriterUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @auther lwj
 * @date 2025/2/26 21:09
 */
public class ContractApplicationTest {
    Logger logger = LoggerFactory.getLogger(ContractApplicationTest.class);

    @Test
    public void finalTest() throws Exception {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyContract.spesc");
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        // 检查是否解析公约
        String constrainttedContractName = contract.getConstrainttedContractName();
        Convention convention = null;
        if (constrainttedContractName != null) {
            String conventionfilenameaddr = constrainttedContractName + ".spesc";
            parser = Iterator.getParser("spesc_files/" + conventionfilenameaddr);
            // 遍历抽象语法树最后返回公约对象
            convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
            // 加载公约规则映射表
            String mappingFile = "mapping_files/mapping.yaml";
            String contractMappingFile = "mapping_files/contractMapping.yaml";
            Contract newContract = Analyzer.start(contract, convention, mappingFile, contractMappingFile);
            System.out.println(newContract);
            String newFilePath = "src/main/resources/spesc_files/newContract.spesc";
//            String newFilePath="D:\\laboratory\\Convention_lwj\\AST_generator\\src\\main\\resources\\spesc_files\\newContract.spesc";
            new FileWriterUtils().generateContract(newContract, newFilePath);

        }
    }

    @Test
    public void leaseTest() throws Exception {
        SpescParser parser = Iterator.getParser("spesc_files/LeaseContract.spsec");
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        // 检查是否解析公约
        String constrainttedContractName = contract.getConstrainttedContractName();
        Convention convention = null;
        if (constrainttedContractName != null) {
            String conventionfilenameaddr = constrainttedContractName + ".spesc";
            parser = Iterator.getParser("spesc_files/" + conventionfilenameaddr);
            // 遍历抽象语法树最后返回公约对象
            convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
            // 加载公约规则映射表
            String mappingFile = "mapping_files/leaseMapping.yaml";
            String contractMappingFile = "mapping_files/leaseContractMapping.yaml";
            Contract newContract = Analyzer.start(contract, convention, mappingFile, contractMappingFile);
//            System.out.println(newContract);
            String newFilePath = "src/main/resources/spesc_files/newLeaseContract.spesc";
//            String newFilePath="D:\\laboratory\\Convention_lwj\\AST_generator\\src\\main\\resources\\spesc_files\\newContract.spesc";
            new FileWriterUtils().generateContract(newContract, newFilePath);
        }
    }
}
