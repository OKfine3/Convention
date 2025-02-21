package edu.ustb.crypto.convention.compile.entity;

import edu.ustb.crypto.convention.spescParser.SpescParser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WhileGeneralExpression {
    String type = "while";

    final String separator = " ";
    Boolean isTransfer = false;
    String transferSeparator = "to ";
    String toTarget;
    Boolean isDeposit = false;

    Boolean isWithdraw = false;

    SpescParser.MoneyExpressionContext moneyExpressionContext;

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");

        if(isTransfer){
            res.append("transfer");
            res.append(separator);
            res.append(moneyExpressionContext.getText());
            res.append(separator);
            res.append(transferSeparator);
            res.append(toTarget);
        }else if(isDeposit){
            // TODO
        }

        return res.toString();
    }

}
