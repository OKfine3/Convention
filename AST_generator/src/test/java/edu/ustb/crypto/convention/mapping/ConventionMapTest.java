package edu.ustb.crypto.convention.mapping;

import edu.ustb.crypto.convention.analysis.Iterator;
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
    public void mappingTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        Map<String, List<Pair<String, String>>> conventionKey = new ConventionMap().getConventionKey(convention);
        String filePath = "src/main/resources/mapping_files/mapping.yaml";
        new ConventionMap().convertToYaml(conventionKey, filePath);
    }

    @Test
    public void keyTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        Map<String, List<Pair<String, String>>> conventionKey = new ConventionMap().getConventionKey(convention);
        System.out.println(conventionKey);
    }

}
