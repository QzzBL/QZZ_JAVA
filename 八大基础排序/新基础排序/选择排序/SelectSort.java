import java.util.Arrays;

/**
 * @ClassName SelectSort
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/12 17:21
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class SelectSort {
    public static int[] selectSort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {//每一趟找到最小值放在第i位
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    /*public static int[] selectSort(int[] array) {
        int tmp = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {//每一趟找到最大值放在第i位
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }*/
    public static void main(String[] args) {
        int[] array = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(selectSort(array)));
    }
}
