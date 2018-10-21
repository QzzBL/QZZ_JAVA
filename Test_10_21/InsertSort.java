/**
 * @ClassName InsertSort
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/21 19:31
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class InsertSort {
    public static void insertSort(int[] array){
        int temp;
        int j;
        for(int i = 1; i < array.length; i ++){
            temp = array[i];
            for(j = i - 1; j >= 0; j--){
                if(array[j] > temp){//在这里执行话，temp == array[i]
                    array[j + 1] = array[j];
                }else {
                    break;
                }
                array[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9, 5, 7, 3, 2};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
