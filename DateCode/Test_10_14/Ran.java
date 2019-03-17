/**
 * @ClassName Ran
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/14 23:53
 * @Title 愿上苍有好生之德
 **/
/**
 *         2、用for循环产生20个随机数（10-20）;
 */
import java.util.*;
public class Ran {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i <= 20; i++) {
            int r = random.nextInt(10) + 10;
            System.out.println(r);
        }
    }
}
