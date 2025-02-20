package edu.ustb.crypto.convention.compile.visitor;


import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: CBAC
 * @title: AdditionVisitor
 * @description:
 * @date: 2023-06-12 16:19
 */
public class AdditionVisitor extends SpescBaseVisitor<AttributeTreeNode> {
    @Override
    public AttributeTreeNode visitAddition(SpescParser.AdditionContext ctx)  {
        if(ctx == null){
            return null;
        }
        AttributeTreeNode additionNode = new AttributeTreeNode(AttributeTypeEnum.Object, ctx.additionName().getText());
        List<AttributeTreeNode> additionFields = ctx.field()
                .stream()
                .map(fieldContext -> new FieldVisitor().visitField(fieldContext))
                .collect(Collectors.toList());
        for (AttributeTreeNode addField : additionFields) {
            additionNode.addChild(addField);
        }
        return additionNode;
    }
}
