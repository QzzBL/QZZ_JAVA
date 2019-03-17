### JAVA中基本数据类型转换

```java 
/**
 * 强制类型转换（显示转换）
 * 具体规则为：double→float→long→int→short(char)→byte
 */
        //float f1 = 12.5;        //编译错误: 12.5默认为double类型，不存在double
                                  //到float的自动转换
        float f2 = (float)12.5;   //编译通过: double到float的强制转换
        float f3 = 12.5f;         //编译通过：后缀f，常量12.5f为float类型
        int i1 = (int)12.5;       //编译通过: double到int类型的强制转换
        long l = 12L;             //编译通过: int到long类型的强制转换(数字后L)

        /*显示转换可能会导致精度损失，也可能由于溢出而导致转换结果不正确*/

        byte b1 = (byte)12.5;     //最终结果: 12，精度损失（字节长度有关）
        byte b2 = (byte)128;      //最终结果: -128，结果溢出




/**
 * 自动类型转换（隐式转换）
 * 具体规则为：byte→short(char)→int→long→float→double
 * （小范围的类型到大范围类型的转换，转换后数值不会发生影响）
 * 注意:隐式转换可能会降低精度，例如，long到float转换
 * 注意:不存在char类型的隐式转换
 */
        byte b1 = 123;      //编译通过:整形常量123从int到byte的自动转换
        byte b2 = 992;      //编译错误，byte取值范围在-128~127之间
        short s1 = 922;     //编译通过:整形常量922从int到short的自动转换
        long long1 = 922;   //编译通过:整形常量922从int到long的自动转换
        float f1 = 922;     //编译通过:整形常量922从int到float的自动转换
        double d1 = 922;    //编译通过:int到double的隐式转换


//由于基本数据类型中 boolean 类型不是数字型，所以基本数据类型转换不包括 boolean 类型
```



### JAVA命名规范

```java
/**
 * Java命名规则
 * （目前程序设计一般遵循两种命名约定，PascalCase和camelCase吗、，例如:MyClass,TestData遵循   
 * PascalCase；
 * 而myValue，firstName等遵循camelCase规则。PascalCase一般用于自定义类型，camelCase一般用于变量名）
 *
 * 为了增强程序的可读性，java语言的命名规则一般遵循如下定义:
 * (1)包:通常使用名词，全部小写，单词之间用英文句点(.)分割
 * (2)类、接口:通常使用名词，且每个单词的首字母要大写（PascalCase命名约定）
 * (3)方法:通常使用动词，首字母小写，其后用大写字母分隔每个单词（camelCase命名约定）
 * (4)常量:通常使用名词，全部大写，单词之间用下划线（_）分隔
 * (5)变量:通常使用名词，首字母小写，其后用大写字母分隔每个单词，避免使用$符号（camelCase命名约定）
 */
```







