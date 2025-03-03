package edu.ustb.crypto.convention.utils;


import edu.ustb.crypto.convention.spescParser.SpescLexer;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParserUtil {

    /**
     * 获取语法解析器
     *
     * @param statement
     * @return
     */
    public static SpescParser getParser(String statement) {
        CharStream charStream = CharStreams.fromString(statement);
        SpescLexer lexer = new SpescLexer(charStream);    // create lexer (pass spesc into it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpescParser parser = new SpescParser(tokenStream);
        return parser;
    }

    /**
     * 关系表达式 比较
     * @param a
     * @param b
     * @param operator
     * @return
     */
    public static boolean compare(Double a, Double b, String operator) {
        if (operator == null || a == null || b == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }

        switch (operator) {
            case "<":
                return a < b;
            case "<=":
                return a <= b;
            case "=":
                return a.equals(b);
            case "!=":
                return !a.equals(b);
            case ">":
                return a > b;
            case ">=":
                return a >= b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
