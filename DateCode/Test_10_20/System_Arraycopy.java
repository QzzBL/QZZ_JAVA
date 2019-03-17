/**
 * @ClassName System_Arraycopy
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 17:29
 * @Title 愿上苍有好生之德
 **/

/**
 * System.arraycopy 对基本类型的拷贝  深拷贝
 */
import java.util.*;
public class System_Arraycopy {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = new int[array.length];
        System.arraycopy(array,0,brray,0,array
                .length);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }
}
