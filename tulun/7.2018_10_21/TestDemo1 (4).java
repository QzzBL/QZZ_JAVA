import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:排序
 * User: GAOBO
 * Date: 2018-10-21
 * Time: 18:18
 *
 */
public class TestDemo1 {

    public static void bubbleSort(int[] array) {
        int tmp = 0;
        boolean swap = false;
        for(int i = 0;i < array.length-1;i++) {
            for(int j = 0;j < array.length-1-i;j++) {
                if(array[j] > array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    swap = true;
                }
            }
            if(!swap) {
                break;
            }
        }
    }

    public static void insertSort(int[] array) {
        int tmp = 0;
        int j = 0;
        for(int i = 1;i < array.length;i++) {
            tmp = array[i];
            for(j = i-1;j >= 0;j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void selectSort(int[] array) {
        int tmp = 0;
        for(int i = 0;i < array.length;i++) {
            for(int j = i+1;j < array.length;j++) {
                if(array[j] < array[i]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12,1,3,5,2,8,78,7};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
