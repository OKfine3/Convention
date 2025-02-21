package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.compile.entity.OrExpression;
import edu.ustb.crypto.convention.compile.entity.WhereStatement;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import edu.ustb.crypto.convention.utils.ParserUtil;
import org.junit.Test;

/**
 * @auther lwj
 * @date 2025/2/21 14:48
 */
public class WhStatementVisitorTest {

    @Test
    public void whenOrExpressionVisitor(){
        SpescParser parser = ParserUtil.getParser("when after Buyer did buyMeat and before payDate");
        OrExpression orExpression = new WhenOrExpressionVisitor().visitOrExpression(parser.orExpression());
        System.out.println(orExpression.toString());
    }

    @Test
    public void whereStatementVisitorTest(){
        SpescParser parser = ParserUtil.getParser("where startTime = now or payDate = now + payDuration");
        SpescParser.WhereStatementContext whereStatementContext = parser.whereStatement();
        WhereStatement whereStatement = new WhereStatementVisitor().visitWhereStatement(whereStatementContext);
        System.out.println(whereStatement.toString());
    }

    @Test
    public void termVisitorTest(){
        SpescParser parser = ParserUtil.getParser(
                "@@买方应当于支付日期前向卖方支付定金（downPayment=price * payRate）\n" +
                        "\t\tterm no2:Buyer must payDownplayed\n" +
                        "\t\t\twhen after Buyer did buyMeat and before payDate\n" +
                        "\t\t\twhile transfer price * payRate to Seller\n" +
                        "\t\t\twhere deliverDate = now + deliverDuration");
        SpescParser.TermContext term = parser.term();
        AttributeTreeNode attributeTreeNode = new TermVisitor().visitTerm(term);
        System.out.println(attributeTreeNode.toString());
    }
}
