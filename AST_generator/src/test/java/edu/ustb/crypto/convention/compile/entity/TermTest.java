package edu.ustb.crypto.convention.compile.entity;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.compile.visitor.TermVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import edu.ustb.crypto.convention.utils.ParserUtil;
import org.junit.Test;

/**
 * @auther lwj
 * @date 2025/2/25 10:55
 */
public class TermTest {
    @Test
    public void breachTermTest() {
        SpescParser parser = ParserUtil.getParser(
                "@@违约条款9：如果买受人在支付日期确认收货日期前没有支付应付货款也没有退货，则需要缴纳滞纳金\n" +
                        "    breach term no9 against term no4:Buyer must payLatePayment\n" +
                        "        when after confirmDate\n" +
                        "        while transfer latePaid to Seller\n");

        AttributeTreeNode attributeTreeNode = new TermVisitor().visitTerm(parser.term());
        Object breachTerm = attributeTreeNode.getObject();
        System.out.println(breachTerm);
    }
}
