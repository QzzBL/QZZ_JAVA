public class Test {
    public static void main(String[] args){
        byte b =5;
        int i1 = 10;
        int i2 = 300;
        double d = 100.1;
        b = (byte)i2;
        System.out.println(b);
        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(i2));

        short a = 1;
        short t = 2;
        //任何精度小于int的类型变量相加都会自动转换为int后计算，则值默认输出的是int型
        int s = a + t;
        short s1 =(short)(a + b);
        System.out.println(s);




    }
}
