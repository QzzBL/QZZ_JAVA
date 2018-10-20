package com.tulun.src;

/**
 * Created with IntelliJ IDEA.
 * Description:1、变量，常量
 * User: GAOBO
 * Date: 2018-10-10
 * Time: 19:23
 */

/**
 * 装包 :将简单类型包装成对应的包装类
 * 调用那个方法：valueOf():
 * 如果是在-128===127之间   会放到缓存当中[]
 *
 * 不在：重新生成一个对象
 *
 * 拆包:包装类==》简单类型  intvalue
 *
 *
 * JDK  JRE  JVM:关系
 *
 *
 */
class Demo {
    int a;//实例变量
    static int b;//静态变量：不属于对象  只属于类本身
    void fun() {
        int c = 10;//局部变量   static？？？？？
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);//局部变量使用必须初始化
    }
}

public class TestDemo1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = a/b;
        System.out.println("===========");
       /* System.out.println(-10%3);//-1
        System.out.println(-10%-3);//-1,1
        System.out.println(10%-3);//1
        System.out.println(10%3);//1*/

        float f1 = 5/2;//2.0
        float f2 = (float)(5.0/2);
        float f3 = (float)5/2;
        float f4 = 5/(float)2;
        System.out.println(f4);
       /* ++a;
        System.out.println(a);
        int b = ++a;
        System.out.println(a);*/
        /*a++;
        System.out.println(a);//11*/
     /*  int b = a++;
       System.out.println(b);*/
       /*a = a++;
       System.out.println(a);*/

    /*    int[] array = {1,2,3,4,5};
        int a = array[0];
        int len = array.length;
        System.out.println(a);
        boolean swap = false;
        boolean flg = !swap;
        System.out.println(flg);
        byte b1 = 0;//0000 0000   1111 1111
        System.out.println(~b1);
        byte b2 = 11;
        byte b3 = 13;
        System.out.println(b2^b3);*/

    }


    public static void main2(String[] args) {
        int a = 10;//数字，字母，下划线，美元符号
        int $a = 1000;//不能用$字开头
        int a3 = 10;//不能用数字开头
        int a_b = 100000;
        a = 20;
        a = 100;
        final int B;
        B = 10;
        System.out.println(B);
        final int A = 10;//A:叫做常量:第一次赋值之后，不能改变他的值
        //A = 100;
        System.out.println(A);
        final int MONEY = 100000;
        //常量：在编译的时候统一进行处理
        //变量：在运行的时候才能知道他的值
    }

    public static void main1(String[] args) {

       /* Integer i3 = 200;
        Integer i5 = new Integer(200);

        Integer i4 = 200;
        Integer i6 = new Integer(200);


        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        Demo demo = new Demo();
        demo.fun();

        Integer a = 10;//装包
        //int i = a;//拆包
        double d = a.doubleValue();//interger*/

       /* Integer i = 100;//装包   拆包
        Integer i2 = 100;
        System.out.println(i == i2);
        System.out.println(i.equals(i2));
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));*/
    }
}
