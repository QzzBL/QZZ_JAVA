/**
 * @ClassName fibonacio
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/28 11:43
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class fibonacio {
 /*   public static int fibonacio(int n){
        long begin = System.currentTimeMillis();
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        int sum = 0;
        for(int i = 3; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            sum = sum + f3;
        }
        //System.out.println(sum + 1 + 1);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        return f3;
    }*/


    public static int fib(int n){

        int num = 0;
        int sum = 0;
        if(n <= 0){
            num = 0;

            return num;
        }else if(n >= 1 && n <= 2){
            num = 1;

            return num;
        }else{
            sum =sum + num;
            num = fib(n - 1) + fib(n - 2);
            return num;

        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //fibonacio(n);
        //fib(n);
      System.out.println(fib(n));

    }

}

