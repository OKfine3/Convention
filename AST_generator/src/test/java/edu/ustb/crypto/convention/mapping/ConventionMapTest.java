package edu.ustb.crypto.convention.mapping;

import edu.ustb.crypto.convention.analysis.Iterator;
import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.compile.entity.Convention;
import edu.ustb.crypto.convention.compile.visitor.ContractVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.antlr.v4.runtime.misc.Pair;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @auther lwj
 * @date 2025/2/26 10:27
 */
public class ConventionMapTest {
    @Test
    public void leaseContractMappingTest() {
        SpescParser parser = Iterator.getParser("spesc_files/LeaseContract.spsec");
        String str = "src/main/resources/mapping_files/leaseContractMapping.yaml";
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        new ContractMap().buildContractMap(contract, str);
    }

    @Test
    public void leaseConventionMappingTest() {
        SpescParser parser = Iterator.getParser("spesc_files/LeaseConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        Map<String, List<Pair<String, String>>> conventionKey = new ConventionMap().getConventionKey(convention);
        String filePath = "src/main/resources/mapping_files/leaseConventionMapping.yaml";
        new ConventionMap().convertToYaml(conventionKey, filePath);
    }

    @Test
    public void contractMappingTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyContract.spesc");
        String str = "src/main/resources/mapping_files/contractMapping.yaml";
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        new ContractMap().buildContractMap(contract, str);
    }


    @Test
    public void conventionMappingTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        Map<String, List<Pair<String, String>>> conventionKey = new ConventionMap().getConventionKey(convention);
        String filePath = "src/main/resources/mapping_files/conventionMapping.yaml";
        new ConventionMap().convertToYaml(conventionKey, filePath);
    }

    @Test
    public void keyTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        Map<String, List<Pair<String, String>>> conventionKey = new ConventionMap().getConventionKey(convention);
        System.out.println(conventionKey);
    }

}
