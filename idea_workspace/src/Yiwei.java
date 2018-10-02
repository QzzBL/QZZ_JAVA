import java.util.Scanner;
public class Yiwei {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("今天周几呢 ： ");
        int num = scanner.nextInt();
        if(0 < num && num <= 5){
            System.out.println("今天是工作日");
        }else if(5 < num && num <= 7) {
            System.out.println("今天是休息日");
        }else
            System.out.println("输入错误啦");

    }
}
