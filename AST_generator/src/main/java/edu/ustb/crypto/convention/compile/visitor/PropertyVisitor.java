package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

/**
 * @author lijiru152@qq.com
 * @date 2024/5/30 23:21
 */
public class PropertyVisitor extends SpescBaseVisitor<AttributeTreeNode> {
    @Override
    public AttributeTreeNode visitProperty(SpescParser.PropertyContext ctx) {
        if(ctx == null){
            return null;
        }
        AttributeTreeNode propertyNode = new AttributeTreeNode(AttributeTypeEnum.Value, ctx.propertyName().getText());
        propertyNode.addChild(new AttributeTreeNode(AttributeTypeEnum.Leaf,ctx.BoolValue().getText()));
        return propertyNode;
    }
}
