/*如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算
        比如
        int a = 5;
        long b = 6;
        a+b -> 结果类型是long

        public class HelloWorld {
    public static void main(String[] args) {

        int a = 5;
        long b = 6;
        int c = (int) (a+b); //a+b的运算结果是long型，所以要进行强制转换
        long d = a+b;

    }
}

 /*如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算
 byte a = 1;
 byte b= 2;
 a+b -> int 类型

public class HelloWorld {
    public static void main(String[] args) {
        byte a = 1;
        byte b= 2;
        byte c = (byte) (a+b); //虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
        int d = a+b;
    }
}
*/