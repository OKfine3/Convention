### 代码说明

#### SPESC语法解析

1. src/main/resources/g4_files路径下存放SPESC语法文件，语法文件定义使用的是‌扩展巴科斯范式（EBNF）语法（类似正则表达式）
2. Spesc.g4中共同定义了公约和私约的语法
3. 右键 src/main/resources/g4_file/Spesc.g4 ， 选择Configure Antlr， 设置Output directory where all output is generated 为
   ： D:\laboratory\Convention_lwj\AST_generator\src\main\java （PS：这里的D:\202bin\要修改为项目绝对目录），
   设置Package/namespace for the generated code为： edu.ustb.crypto.convention.spescParser
4. 右键 src/main/resources/g4_file/Spesc.g4 ， 点击 Generate ANTLR Recognizer，生成解析代码，包含语法词法解析器和Visitor，Listener

#### 程序执行

1. src/test/java/edu/ustb/crypto/convention/ContractApplicationTest.java
   执行finalTest()方法，可以运行该合约检查代码
2. 代码整体思想和流程（以租赁合约为例）：
   2.1 使用公约LeaseConvention.spesc约束或补全私约LeaseContract.spesc（src/main/resources/spesc_files中存放合约文件）
   2.2 使用src/main/java/edu/ustb/crypto/convention/mapping/ConventionMap.java中的方法，提取到公约需要映射的内容，作为映射表的键，按照该表对比私约中的内容，建立映射表leaseMapping.yaml
   2.3 执行执行leaseTest()方法，利用公约对私约进行三种关系检查（约束关系，覆盖关系，补全关系）
   2.4 将检查后内容重新生成新合约，写入到src/main/resources/spesc_files文件中，名为newLeaseContract.spesc
