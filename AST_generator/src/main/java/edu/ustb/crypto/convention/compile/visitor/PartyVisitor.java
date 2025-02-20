package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther lwj
 * @date 2025/2/20 20:13
 */
public class PartyVisitor extends SpescBaseVisitor<AttributeTreeNode> {
    @Override
    public AttributeTreeNode visitParty(SpescParser.PartyContext ctx) {
        if (ctx == null) {
            return null;
        }
        //获取party中的field的内容
        AttributeTreeNode partyNode = new AttributeTreeNode(AttributeTypeEnum.Object, ctx.partyName().getText());
        List<AttributeTreeNode> partyFields = ctx.field()
                .stream()
                .map(fieldContext -> new FieldVisitor().visitField(fieldContext))
                .collect(Collectors.toList());
        for (AttributeTreeNode partyField : partyFields) {
            partyNode.addChild(partyField);
        }
        return partyNode;
    }
}
