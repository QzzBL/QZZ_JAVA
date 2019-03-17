/**
 * @ClassName Test4
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/14 23:27
 * @Title 愿上苍有好生之德
 **/

/**
 * 4、求一个数字的二进制数有几个1
 */
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        while((input & 1) != 0){
            input >>>= 1;
            count++;
        }
        System.out.println(count);
    }
}
