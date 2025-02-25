package edu.ustb.crypto.convention.contractUtils;

import edu.ustb.crypto.convention.analysis.Iterator;
import edu.ustb.crypto.convention.compile.entity.*;
import edu.ustb.crypto.convention.compile.visitor.ContractVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.junit.Test;

import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/24 14:44
 */
public class TermClauseHandlerTest {

    @Test
    public void getCondInClauseTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        List<GeneralClause> generalClauses = convention.getGeneralClauses();
        GeneralClause deliverGoods = new TermClauseHandler().getClauseByAction(generalClauses, "deliverGoods");
        Condition condInClause = new TermClauseHandler().getCondInClause(deliverGoods);
        System.out.println(condInClause);
    }


    @Test
    public void getCondInTermTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerContract.spesc");
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        List<GeneralTerm> generalTerms = contract.getGeneralTerms();
        GeneralTerm generalTerm = new TermClauseHandler().getTermByAction(generalTerms, "payDownplayed");
        Condition condInTerm = new TermClauseHandler().getCondInTerm(generalTerm);
        System.out.println(condInTerm);

    }

    @Test
    public void getClauseByActionTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        List<GeneralClause> generalClauses = convention.getGeneralClauses();
        GeneralClause deliverGoods = new TermClauseHandler().getClauseByAction(generalClauses, "deliverGoods");
        System.out.println(deliverGoods);

    }

    @Test
    public void getTermByActionTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerContract.spesc");
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        List<GeneralTerm> generalTerms = contract.getGeneralTerms();
        GeneralTerm generalTerm = new TermClauseHandler().getTermByAction(generalTerms, "payDownplayed");
//        GeneralTerm generalTerm = new TermClauseHandler().getTermByAction(generalTerms, "zhang");
        System.out.println(generalTerm);

    }
}
