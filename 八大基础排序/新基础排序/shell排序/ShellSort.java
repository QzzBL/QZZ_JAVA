import java.util.Arrays;

/**
 * @ClassName ShellSort
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/12 19:59
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class ShellSort {
    public static int[] shellSort(int[] array) {
        for (int step = array.length/2; step > 0; step/=2) {
            for (int i = step; i < array.length; i++) {
                int j = i;
                int tmp = array[j];

                // j - step是代表与它相同的组旁边的元素
                while (j - step >= 0 && array[j - step] > tmp) {
                    array[j] = array[j - step];
                    j = j - step;
                }
                array[j] = tmp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {8, 9, 1, 7, 2, 3, 5 ,4, 6, 0};
        System.out.println(Arrays.toString(shellSort(array)));
    }
}
