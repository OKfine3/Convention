package edu.ustb.crypto.convention.Attribute;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class AttributeTreeNode {
    /**
     * 该节点的子节点的类型
     */
    AttributeTypeEnum type;

    /**
     * 该节点
     */
    String nodeName;


    /**
     * 节点内容
     */
    Object object;

    /**
     * 该节点的子节点
     */
    List<AttributeTreeNode> children;

    /**
     * 括号后面的额外项
     * isFirearms=false,isIllegalDrugs=false,isHumanOrgans=false
     */
    List<AttributeTreeNode> extraChildren;

    public AttributeTreeNode() {
    }

    public AttributeTreeNode(AttributeTypeEnum type, String nodeName) {
        this.type = type;
        this.nodeName = nodeName;
    }

    public AttributeTreeNode(AttributeTypeEnum type, String nodeName, List<AttributeTreeNode> children) {
        this.type = type;
        this.nodeName = nodeName;
        this.children = children;
    }

    public AttributeTreeNode(AttributeTypeEnum type, String nodeName, List<AttributeTreeNode> children, List<AttributeTreeNode> extraChildren) {
        this.type = type;
        this.nodeName = nodeName;
        this.children = children;
        this.extraChildren = extraChildren;
    }

    public String getNodeName() {
        return nodeName;
    }

    public AttributeTypeEnum getType() {
        return type;
    }

    public List<AttributeTreeNode> getChildren() {
        return children;
    }

    public List<AttributeTreeNode> getExtraChildren() {
        return extraChildren;
    }

    public AttributeTreeNode getChildByName(String childNodeName) {
        for (AttributeTreeNode child : children) {
            if (child.getNodeName().equals(childNodeName))
                return child;
        }
        for (AttributeTreeNode child : extraChildren) {
            if (child.getNodeName().equals(childNodeName))
                return child;
        }
        return null;
    }

    /**
     * 添加子节点
     * @param child
     * @return
     */
    public boolean addChild(AttributeTreeNode child) {
        if (children == null)
            children = new ArrayList<>();
        return children.add(child);
    }

    public boolean addExtraChild(AttributeTreeNode child) {
        if (extraChildren == null)
            extraChildren = new ArrayList<>();
        return extraChildren.add(child);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttributeTreeNode that = (AttributeTreeNode) o;
        return type == that.type && Objects.equals(nodeName, that.nodeName) && Objects.equals(children, that.children) && Objects.equals(extraChildren,that.extraChildren);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, nodeName, children,extraChildren);
    }


}
