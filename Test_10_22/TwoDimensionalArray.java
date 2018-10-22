/**
 * @ClassName TwoDimensionalArray
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/22 10:19
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        Integer[][] array = {{1,2,3}, {4,5}, {6,7,8}};

        //交换第一行和第二行
        Integer[] temp = array[0];
        array[0] = array[1];
        array[1] = temp;

        System.out.println(Arrays.deepToString(array));
        for(int i = 0; i < array.length; i++){
            System.out.println();
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
        }

        //不规则数组
        Integer[][] array1 = new Integer[6][];
       // array1[0][1] = {1};
    }
}
