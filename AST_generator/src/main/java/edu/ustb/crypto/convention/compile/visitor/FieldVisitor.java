package edu.ustb.crypto.convention.compile.visitor;


import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

/**
 * @program: CBAC
 * @title: FieldVisitor
 * @description:
 * @date: 2023-06-07 20:07
 */
public class FieldVisitor extends SpescBaseVisitor<AttributeTreeNode> {
    @Override
    public AttributeTreeNode visitField(SpescParser.FieldContext fieldContext) {
        String fieldNameStr = fieldContext.name().getText();

        SpescParser.TypeContext typeContext = fieldContext.type();
        SpescParser.ValueContext valueContext = fieldContext.value();
        SpescParser.ArrayContext arrayContext = fieldContext.array();
        SpescParser.JsonObjectContext jsonObjectContext = fieldContext.jsonObject();

        if (valueContext != null ) {
            AttributeTreeNode node = new AttributeTreeNode(AttributeTypeEnum.Leaf, valueContext.getText());
            AttributeTreeNode attributeTreeNode = new AttributeTreeNode(AttributeTypeEnum.Value, fieldNameStr);
            attributeTreeNode.addChild(node);
            return attributeTreeNode;
        } else if (jsonObjectContext != null) {
            AttributeTreeNode node = new AttributeTreeNode(AttributeTypeEnum.Object, fieldNameStr);
            for (SpescParser.FieldContext context : jsonObjectContext.field()) {
                node.addChild(visitField(context));
            }
            return node;
        } else if (arrayContext!=null){
            AttributeTreeNode node = new AttributeTreeNode(AttributeTypeEnum.Object, fieldNameStr);
            for (SpescParser.JsonObjectContext objectContext : arrayContext.jsonObject()) {
                for (SpescParser.FieldContext context : objectContext.field()) {
                    node.addChild(visitField(context));
                }
            }
            return node;
        } else {
            AttributeTreeNode node = new AttributeTreeNode(AttributeTypeEnum.Leaf, typeContext.getText());
            AttributeTreeNode attributeTreeNode = new AttributeTreeNode(AttributeTypeEnum.Value, fieldNameStr);
            attributeTreeNode.addChild(node);
            return attributeTreeNode;
        }

    }

}
