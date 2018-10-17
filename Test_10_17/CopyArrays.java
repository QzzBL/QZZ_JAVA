/**
 * @ClassName CopyArrays
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/17 14:10
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class CopyArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr,0,arr1,0,5);//拷贝数组
        System.out.println(Arrays.toString(arr1));//打印数组
        //System.out.println(Arrays(arr1));
    }
}
