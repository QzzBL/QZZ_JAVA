/**
 * @ClassName InputNumber
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/14 12:55
 * @Title 愿上苍有好生之德
 **/

/**
 * 3、输入一个数字，求他是几位数，并且顺序输出，逆序输出
 */
import java.util.Scanner;
public class InputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        int temp = input;
        int temp1 = temp;
        //计算输入数的位数
        while(input!=0){
            input = input/10;
            count++;  //计数加一
        }
        System.out.println("是" + count + "位数");

        //顺序打出
        while(count >= 1){
            count--;
            System.out.print(temp/(int)(Math.pow(10,count) ) + " ");//Math  参数类型是double，必须强转这里
            temp = (int)(temp % (Math.pow(10,count)));
        }
        System.out.println();

        //逆序打出
        while(temp1!=0){
            System.out.print(temp1 % 10+ " ");
            temp1 = temp1/10;
        }
    }
}
