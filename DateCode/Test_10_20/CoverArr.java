/**
 * @ClassName CoverArr
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 21:05
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class CoverArr {
    public static int[] cover(int[] arr, int index){
        while(index <= arr.length/2){
            for(int i = 0; i < index; i++){
                arr[i + 1] = arr[i];
            }
            return arr;
        }
        while(index > arr.length/2){
            for(int i = index; i > index; i--){
                arr[i] = arr[i + 1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int key = 3;
        System.out.println(Arrays.toString(cover(arr, key)));
    }
}
