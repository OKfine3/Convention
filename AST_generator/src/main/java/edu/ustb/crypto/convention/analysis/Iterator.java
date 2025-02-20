package edu.ustb.crypto.convention.analysis;

import edu.ustb.crypto.convention.spescParser.SpescParser;
import edu.ustb.crypto.convention.utils.ParserUtil;
import edu.ustb.crypto.convention.utils.ResourceReader;

public class Iterator {

    /**
     * 获取语法解析对象
     * @param filename
     * @return
     */
    public static SpescParser getParser(String filename){
        String s = ResourceReader.readFileToString(filename);
        SpescParser parser = ParserUtil.getParser(s);
        return parser;
    }
}
