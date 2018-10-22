/**
 * @ClassName Sort
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/22 13:05
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class Sort {
    public static int[] bubbleSort(int[] arr){
        int temp;
        boolean ischange = false;//
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    ischange = true;
                }
            }
            if(ischange = false){//判断是否一开始就是排好的
                break;
            }
        }
        return arr;
    }
    public static int[] insertSort(int[] arr){
        int temp;
        for(int i = 1;i < arr.length; i++){
            temp = arr[i];
            for(int j = i - 1; j < i; j--){
                if(arr[j] > temp){
                    arr[j + 1] = arr[j];
                }else{
                    break;
                }
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    //选择排序  不稳定
    public static int[] selectSort(int[] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //int[] arr = {6, 3, 2, 8, 1};
        int[] arr = {6, 3, 4, 2, 8};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(insertSort(arr)));
        System.out.println(Arrays.toString(selectSort(arr)));
    }
}
