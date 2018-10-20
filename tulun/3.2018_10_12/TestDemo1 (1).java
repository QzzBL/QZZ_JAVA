import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-12
 * Time: 11:39
 */

/**
 * 1、求斐波那契数列的前40项的和？？？
 * 1 1 2 3 5 8 13   。。。。
 * 2、用for循环产生20个随机数（10-20）;
 * a-b;  Math.random() *(b-a)+a      Math.random():[0,1)  double
 * 3、输入一个数字，求他是几位数，并且顺序输出，逆序输出
 * 123         3     1 2 3       3 2 1
 * 4、求一个数字的二进制数有几个1；   2:0000 0010   1
 */
public class TestDemo1 {

    public static boolean fun1(int val) {
        System.out.println("fun1():"+ (val < 1));
        return val < 1;
    }
    public static boolean fun2(int val) {
        System.out.println("fun2():"+ (val < 2));
        return val < 2;
    }
    public static boolean fun3(int val) {
        System.out.println("fun3():"+ (val < 3));
        return val < 3;
    }

    public static int maxTwo(int a,int b) {
        /*if(a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a>b");
        }*/
        return a > b ? a:b;
    }

    public static int maxThree(int a,int b,int c) {
        return maxTwo(maxTwo(a,b),c);
    }
    //1、求输入的数字是否为素数？ 2  3  7
    public static boolean isPrime(int n) {
        for(int i = 2;i < n;i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //2、判断当前年，是否为闰年？

    /**
     * 1、能被4整除并且不能被100整除
     * 2、或者能被400整除
     * @param year
     */
    public static boolean loopYear(int year) {

        if(year % 4 == 0 && year % 100 != 0 ||
                year % 400 == 0) {
            return true;
        }
        return false;
    }

    //60   D     60-70  C   70-80  B   80-100 A
    public static void fun(char ch) {
        switch (ch) {
            case 'A':
                System.out.println("80-100");
                break;
            case 'B':
                System.out.println("70-80");
                break;
            case 'C':
                System.out.println("60-70");
                break;
            case 'D':
                System.out.println("60一下");
                break;
                default:
                    System.out.println("没救了！");
                    break;
        }

    }
    //求1+2+3+4...n
    public static int sumN(int n) {
        int sum = 0;
        for(int i = 1;i <= n;i++) {
            sum = sum+i;//sun += i;
        }
        return sum;
    }
    //2、求5的阶乘：1*2*3*4*5 == 120
    //fac
    public static int fac(int n) {
        int rtv = 1;
        for(int i = 1; i <= n;i++) {
            rtv = rtv * i;
        }
        return rtv;
    }
    //3、求1-100之内的和，1-100之内奇数的和，
    // 1-100偶数的和
    public static void fun(int n) {
        int sum = 0;//1-n
        int sumOdd = 0;//奇数
        int sumEve = 0;//偶数
        for(int i = 1;i <= n;i++) {
            sum += i;
        }
        for(int i = 1;i <= n;i += 2) {
            sumOdd = sumOdd + i;
        }
        for(int i = 2;i <= n;i += 2) {
            sumEve += i;
        }
        System.out.println(sum);
        System.out.println(sumOdd);
        System.out.println(sumEve);
    }

    public static void main(String[] args) {



        //第二个参数若没有，默认为真
        //int sum = sumN(10);
      //  System.out.println(sum);
        //foreach
        //java 有没有goto语句？？？？？

       /* int[] array = {1,2,3,4,5};
        for(int i = 0;i < array.length;i++) {
            System.out.println(array[i]);
        }

        for(int a : array) {
            System.out.println(a);
        }*/

    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输出整数：
        //int n = scanner.nextInt();//遇到空格就结束
        //String ch = scanner.next();
        fun('B');
        //不能做switch参数的类型有哪些？
        //byte n = 1;
        //short n = 1;
        //char n = 'a';   枚举
        //long n = 10000L;//不可以
        //float n = 12.5f;// 不可以
        //double n = 12.5;//不可以
        //String n = "gaobo";//JDK1.7以后特性
       //Integer n = 10;
        //Float n = 12.5f;
        /*switch (n) {
            case 2:
                System.out.println("2");
                //break;
            case 1://Float ?????
                System.out.println("1");
                break;
            case 3:
                System.out.println("3");
                break;
                default:
                    System.out.println("请输入正确的数字");
                    break;
        }*/


       // System.out.println(loopYear(n));




        /*if(isPrime(n)) {
            System.out.println("is prime");
        }
        System.out.println(isPrime(n));*/
        //i = 10;

//        int a  =10;
//        int b = 20;
//        int c = 100;
//        int d = 200;
//        //扫描类  引用
//        Scanner scanner = new Scanner(System.in);
//        //输出整数：
//       // int f = scanner.nextInt();//遇到空格就结束
//       // System.out.println(f);
//        //输入字符串：
//        //String str = scanner.next();//遇到空格结束
//        //System.out.println(str);
//        //String str2 = scanner.nextLine();//识别空格
//       // System.out.println(str2);
//        int e = scanner.nextInt();
//        int f = scanner.nextInt();
//        int g = scanner.nextInt();
//        //maxTwo(e,f);
//        System.out.println(maxThree(e,f,g));
    }






    public static void main1(String[] args) {
        boolean flg = fun1(0) || fun2(2) || fun3(3);
        System.out.println(flg);
        /*int a = 10;
        int b = 20;
        a = b;

        final int A = 100;
        final int B = 200;*/
        //B = A;error

    }
}
