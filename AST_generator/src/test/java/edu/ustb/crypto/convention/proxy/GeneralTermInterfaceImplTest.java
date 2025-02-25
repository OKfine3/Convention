package edu.ustb.crypto.convention.proxy;

import edu.ustb.crypto.convention.analysis.Iterator;
import edu.ustb.crypto.convention.compile.entity.Contract;
import edu.ustb.crypto.convention.compile.entity.Convention;
import edu.ustb.crypto.convention.compile.entity.GeneralClause;
import edu.ustb.crypto.convention.compile.entity.GeneralTerm;
import edu.ustb.crypto.convention.compile.visitor.ContractVisitor;
import edu.ustb.crypto.convention.contractUtils.TermClauseHandler;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.junit.Test;

import java.util.List;

/**
 * @auther lwj
 * @date 2025/2/24 10:23
 */
public class GeneralTermInterfaceImplTest {

    @Test
    public void preHandleTest() {
        SpescParser parser = Iterator.getParser("spesc_files/SaleAndBuyerContract.spesc");
        Contract contract = new ContractVisitor().visitContractDefinition(parser.contractDefinition());
        SpescParser parser1 = Iterator.getParser("spesc_files/SaleAndBuyerConvention.spesc");
        Convention convention = (Convention) new ContractVisitor().visitContractDefinition(parser1.contractDefinition());
        List<GeneralClause> generalClauses = convention.getGeneralClauses();
        List<GeneralTerm> generalTerms = contract.getGeneralTerms();

        /*//私约条款存在when\while\where条件
        GeneralTerm generalTerm = new TermClauseHandler().getTermByAction(generalTerms, "payDownplayed");
        //公约条款存在when\while
        GeneralClause generalClause = new TermClauseHandler().getClauseByAction(generalClauses, "payAdvance");
        */

        //私约条款存在 while 条件
        GeneralTerm generalTerm = new TermClauseHandler().getTermByAction(generalTerms, "deliverMeat");
        //公约条款存在 when\while
        GeneralClause generalClause = new TermClauseHandler().getClauseByAction(generalClauses, "deliverGoods");

        GeneralTerm newGeneralTerm = new GeneralClauseInterfaceImpl().checkGeneral(generalTerm, generalClause);
        System.out.println(newGeneralTerm);

    }

}
