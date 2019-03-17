import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/12 16:26
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class InsertSort {
    public static int[] insertSort(int[] array) {
        int tmp = 0;
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            for (j = i - 1; j >= 0 ; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = tmp;//
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 5, 5,};
        System.out.println(Arrays.toString(insertSort(array)));
    }
}
