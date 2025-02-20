grammar Spesc;
import commons;

/* Rules */
// root rule
compilationUnit : packageDir? contractDefinition EOF ;

packageDir : PACKAGE dir;

dir : (IDENTIFIER SPOT)* IDENTIFIER;

contractDefinition : comment* contractType IDENTIFIER (CONSTRAINT_BY conventionName (',' conventionName)*)? (COLON'serial''number' '0x' IDENTIFIER)? '{' contractBody '}';
contractType : (CONTRACT | CONVENTION);
conventionName : IDENTIFIER;

contractBody :
    party*
    asset*
    field*
    addition* //YAQIN:ADD
    legalRight*
    term*
    clause*
    impldeclaration?
    signature* //YAQIN:ADD
;

/***************************common content of spesc and convention definition************************************/
// party definition
party : comment* (PARTY partyName '{' field* '}' | PARTY GROUP partyName '{' field* '}');

//asset definition
asset : comment* ASSET assetName '{' info? right? field*'}' ; // property*  property : (',')? propertyName '=' (BoolValue); //性质

field :comment* name COLON (type | value | array | jsonObject) ;
addition: ADDITION additionName '{' field* '}';


partyName : IDENTIFIER;
assetName : IDENTIFIER;
name : IDENTIFIER;
additionName : IDENTIFIER;
info : INFO'{'  field (',' field)*'}';
right : RIGHT'{' field (',' field)* '}';
/***************************common content of spesc and convention definition************************************/


/***************************contract definition************************************/
term : comment*  ( generalTerm | breachTerm | arbiTerm ) ;
generalTerm :  generalTermDeclaration whenStatement? whileStatement? whereStatement?;
breachTerm :  breachTermDeclaration whenStatement? whileStatement? whereStatement?;
arbiTerm : controversy institution;

generalTermDeclaration : TERM index COLON partyName duty action ;
duty : op=CAN | op=CANNOT | op=MUST ;

breachTermDeclaration : BREACH TERM index againstDeclaration? COLON partyName duty action;
againstDeclaration : 'against' (TERM | CLAUSE) index ('and' CLAUSE index)*; //('and' CLAUSE index)* 是否一定需要

controversy : 'arbitration term :' ( options {greedy=false;} : . )*?'administered by'; //greedy
institution : 'institution'':' IDENTIFIER ;
signature : SIGNATURE 'of'(PARTY | GROUP) IDENTIFIER COLON
	'{'
	    'printedName' COLON ( (type | value ) ',' )?
	    'signature' COLON ( (type | value ) ',')?
	    'date' COLON (type | RULE_DATE)?
	'}'
;
RULE_DATE : NUMBER '/' NUMBER '/' NUMBER;
/***************************contract definition************************************/

/***************************rule of action************************************/
action : actionName ('(' parametersList? ')')? ;
actionName : IDENTIFIER ;
parametersList : parameter (',' parameter)* ;
parameter : IDENTIFIER (: type)? ;
/***************************rule of action************************************/

/***************************when/while/where************************************/
whenStatement : WHEN predicate ;
whileStatement : WHILE transferOperation ('and' transferOperation)*;
whereStatement : WHERE  ((logicalOrExpression? ('join' relationalExpression)?) | (relationalExpression? ('join' logicalOrExpression)? )) ;
//whereStatement : WHERE  ((assignmentExpression? ('join' relationalExpression)?) | (relationalExpression? ('join' assignmentExpression)? )) ;


predicate : relationalExpression (logicalOperator relationalExpression )?;

//relationalExpression : ( timeUnit | belongsToRelationExpression | comparativeRelationExpression) ;
relationalExpression : ( timeUnit | comparativeRelationExpression) ;

logicalOperator : ( op=AND | op=OR );
/***************************when/while/where************************************/

/***************************** time logical ************************************/
timeUnit : orExpression ;
orExpression : andExpression ((op = 'or' | op = '||') andExpression)*;
andExpression : andChildExpression ((op = 'and' | op = '&&') andChildExpression)*;
andChildExpression : notExpression | timeExpression;
notExpression : ('not' | 'isn\'t') timeExpression;
timeExpression :  timePeriodExpression;

//时间段表达式
timePeriodExpression : boundedTimePredicate | timePredicate;
timePredicate : timePointExpression  (isOrNot  timePredicateOperator timePointExpression)?;//可能还需要扩展，
boundedTimePredicate : (WITHIN timeConstant)? timePredicateOperator timePointExpression;

//时间常量
timeConstant : rule_INTEGER timeConstantUnit;
//rule_INTEGER :  '-'? NUMBER;


timeConstantUnit : 'year' | 'month' | 'day' | 'hour' | 'min' | 'sec'| 'th';

//时间点表达式
// 可能需要加 3 day + partyA did vote
timePointExpression : (actionEnforcedTimeQuery  | timeQueryOperator | date | timeConstant ) addTimeConstant?;

// 动作完成时间 when buyer did pay 支付完成的时刻
// 要用触发器实现 在完成action时候 发布一个事件 在时间检查时候监听这个事件
actionEnforcedTimeQuery : actionMultiplicity? partyName termDuty action;
termDuty : DID;
actionMultiplicity:( ALL | ANY | SOME | THIS | THE);

// 全局查询 查询和智能合约运行相关的时间数值
 timeQueryOperator : ( (op='start'  | op='end' ) 'of' IDENTIFIER) | IDENTIFIER;
// timeQueryOperator :  ( (op='start'  | op='end' ) 'of' IDENTIFIER) | IDENTIFIER;

addTimeConstant : (additiveOperator timeConstant);
additiveOperator : ( 	op='+'   | 	op='-'   );

//时间谓词操作符
timePredicateOperator : ( BEFORE | AFTER );
isOrNot : ('is' | 'isn\'t');
/***************************** time logical ************************************/

/***************************expression definition************************************/
/*// 赋值表达式（最低优先级）
assignmentExpression
    : logicalOrExpression   # Expr
//    | IDENTIFIER ('+=' | '-=' | '*=' | '/=') logicalOrExpression  # CompoundAssign
    | IDENTIFIER '=' logicalOrExpression        # Assign  // 直接使用逻辑或表达式（无赋值）
    ;
//assignmentExpression
//    : IDENTIFIER '=' logicalOrExpression        # Assign
////    | IDENTIFIER ('+=' | '-=' | '*=' | '/=') logicalOrExpression  # CompoundAssign
//    | logicalOrExpression   # Expr  // 直接使用逻辑或表达式（无赋值）
//    ;


// 逻辑或表达式
logicalOrExpression
    : logicalAndExpression (('or' | '||') logicalAndExpression)*  # LogicalOr
    ;

// 逻辑与表达式
logicalAndExpression
    : equalityExpression (('and' | '&&') equalityExpression)*  # LogicalAnd
    ;

// 关系表达式（相等、不等）
equalityExpression
    : relationExpression (('==' | '!=') relationExpression)*  # Equality
    ;

// 关系表达式（比较大小）
relationExpression
    : additiveExpression (('<' | '<=' | '>' | '>=') additiveExpression)*  # Relational
    ;

// 加法 / 减法
additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*  # Additive
    ;

// 乘法 / 除法 / 取模
multiplicativeExpression
    : unaryExpression (('*' | '/' | '%') unaryExpression)*   # Multiplicative
    ;

// 一元运算（负号、逻辑非）
unaryExpression
    : ('-' | '!') unaryExpression  # UnaryOp
    | primaryExpression            # UnaryExpr
    ;

// 基础表达式（括号、变量、常量）
primaryExpression
    : '(' assignmentExpression ')'   # ParenExpr
    | value                          # VarExpr
    ;*/
/***************************expression definition************************************/


/***************************expression definition************************************/
// 逻辑或表达式
logicalOrExpression
    : logicalAndExpression (('or' | '||') logicalAndExpression)*
    ;

// 逻辑与表达式
logicalAndExpression
    : childExpression (('and' | '&&') childExpression)*
    ;

childExpression :
    assignment_expression
    | relational_expression
    | arithmetic_expression
;

//赋值表达式
assignment_expression : IDENTIFIER '=' childExpression;

relational_expression : arithmetic_expression (relationOperator arithmetic_expression)?;

// 算数表达式定义，优先级高低
arithmetic_expression : addSubExpression ;

addSubExpression : mulDivExpression (('+' | '-') mulDivExpression)* ;

mulDivExpression : primaryExpression (('*' | '/') primaryExpression)* ;

primaryExpression : value | '(' arithmetic_expression ')' ;
/***************************expression definition************************************/


/***************************** comparative relation ************************************/
comparativeRelationExpression : (
	atomExpression (relationOperator atomExpression )?
);

atomExpression : ( constantExpression | variableReference |  expressions );
constantExpression:	( rule_INTEGER   |  rule_STRING    | 	rule_BOOLEAN   | rule_FLOAT | rule_DOUBLE );

rule_STRING :
  ('"'  ('\\' .|~('\\'|'"'))*  '"'    // 匹配双引号字符串
  | '\'' ('\\' .|~('\\'|'\''))* '\'')    // 匹配单引号字符串
;
rule_BOOLEAN : ( TRUE | FALSE );
rule_INTEGER : NUMBER;
rule_FLOAT :  ('+' | '-')?   (  rule_INTEGER '.'  rule_INTEGER?  |  '.'  rule_INTEGER );
rule_DOUBLE :  ('+' | '-')?   (  rule_INTEGER '.'  rule_INTEGER?  |  '.'  rule_INTEGER );
variableReference : IDENTIFIER (ofOperator variableReference )?;

expressions : variableReference #VarReference
			| value #ValueExpr
			| '(' expressions '*' expressions ')' #MULTIPLY
			| expressions '*' expressions #MULTIPLY
			| '(' expressions '/' expressions ')' #DIVIDE
			| expressions '/' expressions #DIVIDE
			| '(' expressions '+' expressions ')' #ADD
			| expressions '+' expressions #ADD
			| '(' expressions '-' expressions ')' #SUBSTRACT
			| expressions '-' expressions #SUBSTRACT
			;

relationOperator : ( op='='  |  op='is'  |  op='<'  |   op='<='
                     |   op='>'   |	op='>='   |    op='!='  |   op='isn\'t' );
ofOperator : ( op='::' );
/***************************** comparative relation ************************************/

/***************************** transfer operation ************************************/
transferOperation :
        'grant' variableReference 'to' IDENTIFIER |
        DEPOSIT (moneyExpression | assetExpression ) |
        WITHDRAW (moneyExpression | assetExpression) |
        'transfer' (moneyExpression | assetExpression)'to' name
        ;

moneyExpression: ('$'?
                    'value'? IDENTIFIER? (relationOperator IDENTIFIER)?
                    (logicalOperator moneyExpression)?
                 )
                 |expressions
;
assetExpression : '$' (PERCENTAGE | rule_FLOAT | rule_DOUBLE ) 'of' IDENTIFIER;
PERCENTAGE : ([0-9.]+)[ ]* '%';

/***************************** transfer operation ************************************/


/*************************************convention definition**********************************************/
clause : comment* ( bindClause | generalClause | breachClause );
//bind clause

//bindClause : BIND CLAUSE index COLON assignmentExpression* factorBind*;
bindClause : BIND CLAUSE index COLON childExpression* factorBind*;

factorBind : factor lo_type itemLimitation;
lo_type : ( 'IN' | 'NOT_IN');
factor : partyName | assetName;
itemLimitation : itemLimitationName '=' '[' IDENTIFIER (',' IDENTIFIER)* ']';
itemLimitationName : IDENTIFIER;

//general clause
generalClause : clauseDeclaration  whenStatement? whileStatement? whereStatement?;
clauseDeclaration : CLAUSE index COLON partyName cvDuty action;
cvDuty :(canExerciseRight | mustFulfilObligation | CANNOT);
mustFulfilObligation : 'must' 'fulfil' 'obligation';
canExerciseRight : 'can' 'exercise' 'right';

//breach clause
breachClause : breachClauseDeclaration againstDeclaration? whenStatement? whileStatement? whereStatement?;
breachClauseDeclaration :BREACH CLAUSE index COLON partyName cvDuty action;

//legal right
legalRight :legalRightDeclaration rightContent;
legalRightDeclaration : rightOf rightName UNDER IDENTIFIER+ COLON;
rightContent : rightSubject rightObject lawSource;
rightSubject : partyName possessTheRight (INCLUDING '['rightName (',' rightName)*']')?;
possessTheRight : 'possess' 'the' 'right';

rightObject : onTheObject INCLUDING '[' assetName (',' assetName)* ']' ;
onTheObject : 'on' 'the' 'object';

lawSource : accordTo '[' lawName (',' lawName)* ']' ;
accordTo : 'according' 'to';
rightOf : 'legalRight' 'of';
rightName : IDENTIFIER;
lawName : IDENTIFIER;


impldeclaration : IMPLEMENT DECLARATION
	'{'
	    'Enacting Agency' COLON ( (type | value ) ',' )?
	    'Enactment Date' COLON ( (type | value |RULE_DATE ) ',')?
	    'Implementation Date' COLON (type | value |RULE_DATE)?
	'}'
;
/*************************************convention definition**********************************************/



value : NUMBER | decimal | IDENTIFIER | RULE_STRING | date | CHINESE | TRUE | FALSE;
index : op=NUMBER | op=INDEX ;
decimal : NUMBER '.' NUMBER // 整数部分 + 小数点 + 小数部分
        | '.' NUMBER          // 只有小数部分，没有整数部分
        | NUMBER '.'        // 只有整数部分，没有小数部分
        ;
array : '[' jsonObject (',' jsonObject)* ']';
jsonObject : '{' field (',' field)* '}' ;



// 解析自定义注释的规则
comment: COMMENT_TEXT;
COMMENT_TEXT: '@@' ~[\r\n]* ; // 匹配非换行符的所有字符 // 匹配非换行符的所有字符

// 时间变量
date :  NUMBER '-' NUMBER '-' NUMBER NUMBER ':' NUMBER ':' NUMBER;

/*Contract Keyword Tokens */
PACKAGE : 'package';
CONTRACT : 'contract' ;
CONVENTION : 'convention';
PARTY : 'party' ;
GROUP : 'group';
ASSET : 'asset';
INFO : 'info';
RIGHTINFO : 'rightInfo';
ADDITION : 'addition';
OBLIGATION : 'obligation';
RIGHT : 'right';
SIGNATURE : 'signature';
TERM : 'term' ;
BIND : 'bind';
CLAUSE : 'clause' ;
BREACH : 'breach' ;
PRINT : 'print' ;
COLON : ':' ;
SPOT : '.';
CAN : 'can' ;
CANNOT : 'cannot' ;
MUST : 'must' ;
WHEN : 'when' ;
WHILE : 'while' ;
WHERE : 'where' ;
ALL : 'all' ;
SOME : 'some' ;
THIS : 'this' ;
DID : 'did' ;
DEPOSIT : 'deposit' ;
WITHDRAW : 'withdraw' ;
TRANSFER : 'transfer' ;
NOT : 'not';
OR : ( 'or'  | '||' );
AND : ( 'and' | '&&' );
FALSE : 'false';
TRUE : 'true';
FOR : 'for';
AFTER: 'after' ;
BEFORE: 'before' ;
BELONG: 'belongsTo' ;
WITHIN : 'within' ;
OF : 'of';
IMPLEMENT : 'implement';
DECLARATION : 'declaration';
DETAILS : 'Contract conclusion' ( options {greedy=false;} : . )*?'{';
CONSTRAINT_BY : 'constraint_by';
INCLUDING : 'including';
UNDER : 'under';

/* Type Value Tokens */
INDEX : 'no'NUMBER ;

CHINESE:  [\u4e00-\u9fa5\u3002\uff1b\uff0c\uff1a\u201c\u201d\uff08\uff09\u3001\uff1f\u300a]*;

//RULE_DATE : NUMBER '/' NUMBER '/' NUMBER;
//HEX : [a-fA-F0-9]+;

WS: [ \t\r\n]+ -> skip ;