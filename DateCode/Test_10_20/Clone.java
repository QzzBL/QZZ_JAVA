/**
 * @ClassName Clone
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 16:21
 * @Title 愿上苍有好生之德
 **/
/**
 * array.clone()的使用，
 * 深拷贝
 */

import java.util.*;
public class Clone {
    public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] brray = array.clone();

            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(brray));
            brray[0] = 1000;
            System.out.println("=================");
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(brray));

        }
    }
