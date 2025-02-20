package edu.ustb.crypto.convention.compile.entity;

import edu.ustb.crypto.convention.spescParser.SpescParser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WhereGeneralExpression {
    String type = "where";

    final String separator = " ";
    String p0;
    String equalSeparator = "=";
    SpescParser.Arithmetic_expressionContext p1;

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");

        res.append(p0);
        res.append(separator);
        res.append(equalSeparator);
        res.append(separator);
        res.append(p1.getText());

        return res.toString();
    }

}
