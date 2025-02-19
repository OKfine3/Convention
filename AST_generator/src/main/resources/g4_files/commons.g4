/* 定义通用语法 */
grammar commons;

// 定义 SPESC 使用的结构体
struct :
RULE_STRING | NUMBER | type | structObj | structArr
;

RULE_STRING :
'"'  (ESC | .)*?  '"'
;
NUMBER : [0-9]+;

//type : IDENTIFIER ('[' ']')?;
type : 'Double' | 'int' | 'String'| 'Long' | 'Integer' | 'Date';

structObj :
'{' keyPair (',' keyPair)* '}' |
'{' '}'
;

structArr :
'[' structObj (',' structObj)* ']' |
'[' ']'
;

keyPair :
(IDENTIFIER ':' | RULE_STRING ':') struct
;
// 标识符
IDENTIFIER : [a-zA-Z0-9_]+ ;
// 中英文字符
NOTE : [\u4e00-\u9fa5_a-zA-Z0-9]+;
//标点
PUNCTUATION : [\u3002\uff1b\uff0c\uff1a\u201c\u201d\uff08\uff09\u3001\uff1f\u300a\u300b];

//STRING : ['"].*?['"] ;
ESC :
'\\"' | '\\\\'
; // 匹配字符 \" 和 \\，由于Antlr中\ 表示转义，所以用两个\\表示\

// special TOKEN for skipping whitespaces
WS: [ \t\n\r]+ -> skip ;