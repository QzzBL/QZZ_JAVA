package com.tulun.src;

/**
 * Created with IntelliJ IDEA.
 * Description:1������������
 * User: GAOBO
 * Date: 2018-10-10
 * Time: 19:23
 */

/**
 * װ�� :�������Ͱ�װ�ɶ�Ӧ�İ�װ��
 * �����Ǹ�������valueOf():
 * �������-128===127֮��   ��ŵ����浱��[]
 *
 * ���ڣ���������һ������
 *
 * ���:��װ��==��������  intvalue
 *
 *
 * JDK  JRE  JVM:��ϵ
 *
 *
 */
class Demo {
    int a;//ʵ������
    static int b;//��̬�����������ڶ���  ֻ�����౾��
    void fun() {
        int c = 10;//�ֲ�����   static����������
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);//�ֲ�����ʹ�ñ����ʼ��
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
        int a = 10;//���֣���ĸ���»��ߣ���Ԫ����
        int $a = 1000;//������$�ֿ�ͷ
        int a3 = 10;//���������ֿ�ͷ
        int a_b = 100000;
        a = 20;
        a = 100;
        final int B;
        B = 10;
        System.out.println(B);
        final int A = 10;//A:��������:��һ�θ�ֵ֮�󣬲��ܸı�����ֵ
        //A = 100;
        System.out.println(A);
        final int MONEY = 100000;
        //�������ڱ����ʱ��ͳһ���д���
        //�����������е�ʱ�����֪������ֵ
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

        Integer a = 10;//װ��
        //int i = a;//���
        double d = a.doubleValue();//interger*/

       /* Integer i = 100;//װ��   ���
        Integer i2 = 100;
        System.out.println(i == i2);
        System.out.println(i.equals(i2));
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));*/
    }
}
