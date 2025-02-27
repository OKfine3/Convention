package edu.ustb.crypto.convention.analysis;

import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.junit.Test;

public class IteratorTest {
    @Test
    public void testIterator(){
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyContract.spesc");
        SpescParser.ContractDefinitionContext contractDefinitionContext = parser.contractDefinition();
        System.out.println(contractDefinitionContext);
    }

}
