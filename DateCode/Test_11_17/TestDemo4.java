import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @ClassName TestDemo4
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/15 14:59
 * @Title 愿上苍有好生之德
 **/
public class TestDemo4 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = devide(num1, num2);
        System.out.println("result: " + result);
        scanner.close();
    }

    public static int devide(int num1, int num2) {
        return num1 / num2;
    }


    /*    public static void fun1() throws FileNotFoundException {
            try (FileInputStream file = new FileInputStream("E:\\1.TXT") {
                int word;

            }) {
            }
        }*/
    public static void main(String[] args) {
        //start();
        fun2();

        //1.手动抛出异常
        /*String str = null;
        if(str == null) {
            throw new NullPointerException();
        }*/

        //2.程序自己抛出异常，然后捕获
        try {
            int a = 10;
            int b = a / 0;
            System.out.println(b);//这个值无法打印
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 异常");
            e.printStackTrace();
        }

        try {
            int[] array = {1, 2, 3, 4};
            System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
            e.printStackTrace();
        }


    }

    //3.try......catch......finally 捕捉多个异常
    public static void fun2(){
        //这里已经处理了异常，不需要再声明异常了。如果加了声明，
        // 当前函数就不处理了，调用该函数的一方进行处理。

        Scanner scan = new Scanner(System.in);
        try {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int result = devide(num1, num2);
            System.out.println("result:" + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 异常");
            e.printStackTrace();
        } catch (InputMismatchException e) {//输入有误的时候
            System.out.println("InputMismatchException 异常");
            e.printStackTrace();
        } finally {
            scan.close();
        }
    }
}
