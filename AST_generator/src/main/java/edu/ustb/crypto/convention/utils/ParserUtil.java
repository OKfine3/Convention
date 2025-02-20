package edu.ustb.crypto.convention.utils;


import edu.ustb.crypto.convention.spescParser.SpescLexer;
import edu.ustb.crypto.convention.spescParser.SpescParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class ParserUtil {

    /**
     * 获取语法解析器
     * @param statement
     * @return
     */
    static public SpescParser getParser(String statement){
        CharStream charStream = CharStreams.fromString(statement);
        SpescLexer lexer = new SpescLexer(charStream);    // create lexer (pass spesc into it)
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpescParser parser = new SpescParser(tokenStream);
        return parser;
    }
}
