/**
 * @ClassName ArrayFill
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 12:46
 * @Title 愿上苍有好生之德
 **/

/**
 * 7.如何填充数组（一次填充，部分填充）
 * 牵扯到Array.fill的用法
 */
import java.util.*;
public class ArrayFill {
    public static void main(String[] args) {
        String[] arr1 = new String[6];
        System.out.println("未填充: " + Arrays.toString(arr1));

        Arrays.fill(arr1, "tulun");
        System.out.println("完全填充: " + Arrays.toString(arr1));

        Arrays.fill(arr1, 3, 5,"qzz");
        System.out.println("部分填充: " + Arrays.toString(arr1));
    }
}
