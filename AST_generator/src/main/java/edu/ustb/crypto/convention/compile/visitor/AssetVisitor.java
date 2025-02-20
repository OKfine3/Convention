package edu.ustb.crypto.convention.compile.visitor;

import edu.ustb.crypto.convention.Attribute.AttributeTreeNode;
import edu.ustb.crypto.convention.Attribute.AttributeTypeEnum;
import edu.ustb.crypto.convention.spescParser.SpescBaseVisitor;
import edu.ustb.crypto.convention.spescParser.SpescParser;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @auther lwj
 * @date 2025/2/20 21:04
 */
public class AssetVisitor extends SpescBaseVisitor<AttributeTreeNode> {

    @Override
    public AttributeTreeNode visitAsset(SpescParser.AssetContext ctx) {
        if(ctx == null){
            return null;
        }

        AttributeTreeNode assetNode = new AttributeTreeNode(AttributeTypeEnum.Object, ctx.assetName().getText());
        List<AttributeTreeNode> assetFields = ctx.field()
                .stream()
                .map(fieldContext -> new FieldVisitor().visitField(fieldContext))
                .collect(Collectors.toList());
        for (AttributeTreeNode assetField : assetFields) {
            assetNode.addChild(assetField);
        }
        List<AttributeTreeNode> collect = ctx.property()
                .stream()
                .map(property -> new PropertyVisitor().visitProperty(property))
                .collect(Collectors.toList());
        for (AttributeTreeNode attributeTreeNode : collect) {
            assetNode.addExtraChild(attributeTreeNode);
        }
        return assetNode;
    }
}
