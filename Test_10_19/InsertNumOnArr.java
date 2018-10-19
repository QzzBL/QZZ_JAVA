/**
 * @ClassName InsertNumOnArr
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 10:19
 * @Title 愿上苍有好生之德
 **/
/**
 * 4.如何排序数组并插入某个元素
 */

import java.util.*;
public class InsertNumOnArr {
    public static void insertNumOnArr(int[] arr,int[] arr1, int key){
        System.arraycopy(arr,0,arr1,0,arr.length);
        arr1[arr1.length - 1] = key;
        Arrays.sort(arr1);
        System.out.println("插入后的数组 arr1: " + Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("指定数组长度: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n + 1];
        int[] arr = new int[n];
        System.out.println("输入数组中的数: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("要插入的数字: ");
        int key = scanner.nextInt();
        System.out.println("一开始输入的数组 arr: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("未插入时排好的数组 arr: " + Arrays.toString(arr));

        insertNumOnArr(arr, arr1, key);
    }
}

