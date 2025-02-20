package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.analysis.Iterator;
import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.junit.Test;

public class ContractVisitorTest {
    @Test
    public void ctxTest(){
        SpescParser parser= Iterator.getParser("spesc_files/SaleAndBuyerContract.spesc");
        SpescParser.ContractDefinitionContext contractDefinitionContext = parser.contractDefinition();
        Contract contract=new ContractVisitor().visitContractDefinition(contractDefinitionContext);
        System.out.println(contract);
    }
}
