/**
 * @ClassName MergeArr
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 11:43
 * @Title 愿上苍有好生之德
 **/
/**
 * 6.如何合并两个数组（合并到一个新的数组）
 */

import java.util.*;
public class MergeArr {
    public static void mergeArr(int[] arr, int[] arr1, int[] arr2){
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr1,0,arr2,arr.length,arr1.length);
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {6,7,8,9};
        int[] arr2 = new int[arr.length + arr1.length];
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("arr1: " + Arrays.toString(arr1));
        mergeArr(arr, arr1, arr2);
    }
}
