/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-14
 * Time: 18:17
 */

/**
 * Math.random() *(b-a)+a
 *  1、求斐波那契数列的前40项的和？？？
 *  1 1 2 3 5 8 13   。。。。
 *  2、用for循环产生20个随机数（10-20）;
 *   a-b;  Math.random() *(b-a)+a      Math.random():[0,1)  double
 *  3、输入一个数字，求他是几位数，并且顺序输出，逆序输出
 *  123         3     1 2 3       3 2 1
 *  4、求一个数字的二进制数有几个1；   2:0000 0010   1
 */
public class TestDemo1 {

    public static int fibonacio(int n) {//40
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i = 3;i <= n;i++) {
            f3 = f1+f2;//2
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void randNum(int a,int b) {
        for(int i = 1;i <= 20;i++) {
            int rand = (int)(Math.random() *(b-a)+a);
            System.out.println(rand);
        }
    }

    /**
     * 123  ===>  3   123/10 12/10  1/10   n
     * @param n
     * @return
     */
    public static int getFigures(int n) {
        int count = 0;
        if(n == 0) {//防御性检查
            return 0;
        }
        if(n <= 0) {
            //System.out.print("-");
            n = -n;
        }
        while(n != 0) { //123
            count++;//1  2  3
            n = n /10;//12   12/10 1  1/10 == 0
        }
        return count;
    }

    public static void printOrder (int n) {//123   123/100  1  23/10= 2   3/1 = 3
    //123===>23   123%100 = 23   23%10==3
        if(n == 0) {//防御性检查
            return;
        }
        if(n <= 0) {
            System.out.print("-");
            n = -n;
        }
        int figures = getFigures(n);//123  ==>3
        int pow = (int)(Math.pow((double)10,(double)(figures-1)));
        //pow == 100;
        int tmp = 0;  //198
        while(pow != 0) {
            tmp = n/pow;//1  2  3
            System.out.print(tmp + " ");
            n %= pow;//n = n%pow   123%100   23   3  0
            pow /= 10;//10  1   0
        }
        System.out.println();
    }
    //逆序打印
    public static void reverse(int n) {//123  123 % 10  3  12 % 10=2
        //123 % 10 = 3
        //12 %10 =2       123===>12  123/10 = 12
        if(n == 0) {//防御性检查
            return;
        }
        if(n <= 0) {
            System.out.print("-");
            n = -n;
        }
        int tmp = 0;
        while(n != 0) {
            tmp = n % 10;//123 % 10 = 3
            System.out.print(tmp + " ");
            n /= 10;
        }
    }

    //二进制1的个数
    public static int numof1(int n) {//2:  0000 0010
        int count = 0;
        while(n != 0) {
            if((n &1) != 0) {
                count++;
            }
            n = n >>> 1;
        }
        return count;
    }
    public static int numofOne(int n) {
        int count = 0;
        while(n != 0) {
            count++;
            n = n & (n-1);//
        }
        return count;
    }

    public static void main(String[] args) {
       // System.out.println(fibonacio(40));
        //randNum(10,20);
        /*System.out.println(getFigures(-123));//3
        printOrder(-123);//1 2 3
        reverse(-123);//3 2 1*/
        System.out.println(numofOne(-1));//int  32
    }
}
