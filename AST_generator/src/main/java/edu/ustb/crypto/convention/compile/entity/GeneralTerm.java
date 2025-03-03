package edu.ustb.crypto.convention.compile.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralTerm extends Term {
    private String termName;
    private String partyName;
    private String duty;
    private String actionName;
    private List<String> parameterList;
    private WhenStatement whenStatement;
    private WhileStatement whileStatement;
    private WhereStatement whereStatement;

    final String _n = "\n";
    final String separator = " ";

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("term");
        res.append(separator);
        res.append(termName);
        res.append(separator);
        res.append(":");
        res.append(separator);
        res.append(partyName);
        res.append(separator);
        res.append(duty);
        res.append(separator);
        res.append(actionName);

        if (parameterList != null) {
            res.append("(");

            String prams = "";
            for (String s : parameterList) {
                prams += s;
                s += ",";
            }
            if (prams.length() > 0) {
                prams = prams.substring(0, prams.length() - 1);
            }

            res.append(prams);

            res.append(")");
        }
        res.append(_n);
        if (whenStatement != null) {
            res.append("\t\twhen ");
            List<String> whens = whenStatement.getOrExpression().getAndExpression()
                    .stream()
                    .map((item) -> item.getWhenGeneralExpression().toString()).collect(Collectors.toList());

            //TODO 可能会有or连接的时间

            String result = String.join(" and ", whens);
            res.append(result);
            res.append(_n);
        }

        if (whileStatement != null) {
            res.append("\t\twhile ");
            List<String> whiles = whileStatement.getOrExpression().getAndExpression()
                    .stream()
                    .map((item) -> item.getWhileGeneralExpression().toString()).collect(Collectors.toList());
            //TODO 可能会有or连接的时间
            String result = String.join(" and ", whiles);
            res.append(result);
            res.append(_n);
        }

        if (whereStatement != null) {
            res.append("\t\twhere ");
            List<String> wheres = whereStatement.getOrExpression().getAndExpression()
                    .stream()
                    .map((item) -> item.getWhereGeneralExpression().toString()).collect(Collectors.toList());
            //TODO 可能会有or连接的时间
            String result = String.join(" and ", wheres);
            res.append(result);
            res.append(_n);
        }

        return res.toString();
    }

}
