/**
 * @ClassName SimpleCharcter
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 17:18
 * @Title 愿上苍有好生之德
 **/
/**
 * for循环方式   对简单类型的拷贝   深拷贝
 */

import java.util.*;
public class SimpleCharcter {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = new int[array.length];
        for(int i = 0;i < array.length;i++) {
            brray[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }
}
