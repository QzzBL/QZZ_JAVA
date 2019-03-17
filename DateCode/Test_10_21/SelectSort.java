/**
 * @ClassName SelectSort
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/21 19:53
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class SelectSort {
    public static void selectSort(int[] array){
        int i;
        int j;
        int temp;
        for(i = 0; i < array.length; i++){
            for(j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 6, 7, 2};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
