/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-14
 * Time: 19:39
 */

public class TestDemo2 {
    public static void sum(int n) {
        int sum = 0;
        int sumOdd = 0;
        int i = 1;
        do {
            sum = sum+i;
            i++;
        }while(i <= n);//100
        i = 1;
        do {
            sumOdd += i;
            i += 2;
        }while(i <= n);
    }

    //break :结束全部循环     continue;结束本次循环
    //1+2+3.......+m > 1000   m
    public static int fun1() {
        int tmp = 0;
        int i = 1;
        for(; tmp <= 1000;i++) {
            tmp += i;
        }
        return i-1;
    }

    public static int fun2() {
        int tmp = 0;
        int i = 1;
        for( ; ;i++) {
            tmp += i;
            if(tmp > 1000) {
                break;
            }
        }
        return i;
    }
    //continue:
    //求既能被3整除也能被5整除的数字  1....n之间
    public static void fun3(int n) {
        for(int i = 1; i<= n;i++) {
            if(i % 15 != 0) {
                continue;
            }
            System.out.println("i :" + i);
        }
    }

    /**
     * 打断点，单步  进入语句   暂停
     *
     * * @param args
     */
    public static void main(String[] args) {
        fun3(20);
    }
}
