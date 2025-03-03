package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import edu.ustb.crypto.convention.utils.ParserUtil;
import org.junit.Test;

/**
 * @auther lwj
 * @date 2025/3/3 16:22
 */
public class SignatureVisitorTest {
    @Test
    public void signature() {
        SpescParser parser = ParserUtil.getParser(
                "signature of party Buyer:\n" +
                        "\t\t{\t\tprintedName: li,\n" +
                        "\t\t\t\tsignature: 2343214,\n" +
                        "\t\t\t\tdate: 2024/01/02\n" +
                        "\t\t}" +
                        "signature of party Seller:\n" +
                        "\t\t{\t\tprintedName: li,\n" +
                        "\t\t\t\tsignature: 2343214,\n" +
                        "\t\t\t\tdate: 2024/01/02\n" +
                        "\t\t}");

        AttributeTreeNode attributeTreeNode = new SignatureVisitor().visitSignature(parser.signature());
        System.out.println(attributeTreeNode);
    }
}
