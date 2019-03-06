import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-01-08
 * Time: 21:05
 */
public class TestMergeSort {
    /**
     * gap:代表每个归并段的数据个数
     * @param array
     * @param gap
     */
    public static void merge(int[] array,int gap) {
        int[] tmpArr = new int[array.length];//空间复杂度O(n)
        int i = 0;
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 > array.length-1 ? array.length-1 :s2+gap-1;
        //肯定有两个归并段
        while(s2 < array.length) {
            //当两个归并段都有数据的时候
            while(s1 <= e1 && s2 <= e2) {
                if(array[s1] < array[s2]) {
                    tmpArr[i++] = array[s1++];
                }else {
                    tmpArr[i++] = array[s2++];
                }
            }
            while(s1 <= e1) {
                tmpArr[i++] = array[s1++];
            }
            while(s2 <= e2) {
                tmpArr[i++] = array[s2++];
            }
            //确定新的下标
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1;
            e2 =  s2+gap-1 > array.length-1 ? array.length-1 :s2+gap-1;
        }
        while(s1 < array.length) {
            tmpArr[i++] = array[s1++];
        }
        System.arraycopy(tmpArr,0,array,0,tmpArr.length);
    }
    public static void mergeSort(int[] array) {
        for (int i = 1; i < array.length; i *= 2) {
            merge(array,i);
        }
    }
    public static void main(String[] args) {
        int[] array = new int[10000];//n   log2n
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000)+1;
        }
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
