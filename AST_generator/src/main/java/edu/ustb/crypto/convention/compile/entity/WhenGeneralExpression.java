package edu.ustb.crypto.convention.compile.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WhenGeneralExpression {
    String type = "when";
    // 标识是否为否定
    Boolean ifNot = Boolean.FALSE;

    final String separator = " ";
    // 是否存在within
    Boolean ifWithIn = Boolean.FALSE;
    String ruleINTEGER;

    String timeConstant;

    String timeConstantUnit;
    // 是否是标识已执行某动作，否：则表示这个表达式为判断时间
    Boolean ifAction = Boolean.FALSE;
    String partyName;
    String duty;
    String actionName;
    //
    String timeOperator;

    String queryOperator;


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        if(ifNot){
            res.append("not");
            res.append(this.separator);
        }
        if(ifWithIn){
            res.append("within");
            res.append(this.separator);
            res.append(timeConstant);
            res.append(this.separator);
            res.append(timeConstantUnit);
            res.append(this.separator);
        }
        res.append(timeOperator + separator);

        //TODO 可能有after和before判断时间节点的内容

        if(ifAction){
            res.append(partyName + separator + duty + separator + actionName);
        }else{
            res.append(queryOperator);
        }
        return res.toString();
    }
}
