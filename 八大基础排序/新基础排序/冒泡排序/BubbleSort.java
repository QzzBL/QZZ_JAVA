import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/12 17:57
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        int tmp = 0;
        boolean isChange = false;//用来判断一趟排序是否都是有序的标志
        for (int i = 0; i < array.length - 1; i++) {//array.length - 1表示n - 1趟排序
            for (int j = 0; j < array.length - 1 - i; j++) {//array.length - 1 - i（为啥还要-1，因为array[j] > array[j + 1] 已经有j + 1的缘故）
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    isChange = true;//表示第一趟不是有序
                }
            }
            if (!isChange) {//当isChange依然为false时，表示第一趟就发现数组有序，直接跳出循环
                break;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 5, 6};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
