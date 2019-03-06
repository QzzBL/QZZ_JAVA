
import java.util.Arrays;
import java.util.Random;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-01-08
 * Time: 14:14
 */

/**
 * 选择排序：
 * 直接插入排序：越有序越快  O(n)
 * 冒泡排序：
 * shell排序： 分组的思想 组内进行直接插入排序
 * 快速排序：均匀的分割待排序序列
 *  递归   非递归解法
 *  归并排序
 *  堆排序
 */
public class TestQuickSort {
    //一趟快速排序函数
    public static int partion(int[] array,int low,int high) {
        int tmp = array[low];
        while(low < high) {
            while(low < high && array[high] >= tmp) {
                high--;
            }
            if(low >= high) {
                break;
            } else {
                array[low] = array[high];
            }
            while(low < high && array[low] <= tmp) {
                low++;
            }
            if(low >= high) {
                break;
            } else {
                array[high] = array[low];
            }
        }
        array[low] = tmp;
        return low;
    }

    /**
     * 时间复杂度：O(nlog2n)
     * 空间复杂度：O(log2n)
     * 稳定性：不稳定
     * @param array
     * @param low
     * @param rand
     */
    public static void swap(int[] array,int low,int rand) {
        int tmp = array[low];
        array[low] = array[rand];
        array[rand] = tmp;
    }

    public static void midThree(int[] array,int low,int high) {
        //array[mid] <= array[low] <= array[high];
        int mid = (low + high)>>1;
        if(array[low] < array[mid]) {
            swap(array,low,mid);
        }
        if(array[low] > array[high]) {
            swap(array,low,high);
        }
        if(array[mid] > array[high]) {
            swap(array,mid,high);
        }
    }
    public static void insertSort(int[] array,int low,int high) {
        int tmp = 0;
        int j = 0;
        for (int i = low+1; i <= high; i++) {
            tmp = array[i];
            for ( j = i-1; j >= low ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    /**
     * 优化方式2：聚集相同基准元素
     * @param array
     * @param low
     * @param par
     * @param high
     * @param left
     * @param right
     * @return
     */

    public static int[] focusParNum(int[] array,int low,int par,int high,
                                   int left,int right) {
        int pl = par-1;
        for (int i = par-1; i >= low ; i--) {
            if(array[i] == array[par]) {
                if(i != pl) {
                    swap(array,i,pl);
                    pl--;
                }else{
                    pl--;
                }
            }
        }
        left = pl;
        int pr = par+1;
        for (int i = par+1; i <= high ; i++) {
            if(array[i] == array[par]) {
                if(i != pr) {
                    swap(array,i,pr);
                    pr++;
                }else{
                    pr++;
                }
            }
        }
        right = par+1;
        int[] brr = new int[2];
        brr[0] = left;
        brr[1] = right;
        return brr;
    }

    public static void quick(int[] array,int low,int high) {
        /**
         * 优化方式1：直接插入排序
         */
        if(high-low+1 < 100) {
            insertSort(array,low,high);
            return;
        }
        /**
         * 排序方式2 : 随机选取基准法
         */
       /* Random random = new Random();
        int randnum = random.nextInt(high-low)+1+low;//4-8  [0-5)+4
        swap(array,low,randnum);*/

        /**
         * 排序方式3：三分取中法
         */
        midThree(array,low,high);
        int par = partion(array,low,high);
        int left = par-1;
        int right = par+1;
        int[] brr = focusParNum(array,low,par,high,left,right);
        left = brr[0];
        right = brr[1];
        if(left > low+1) {
            quick(array,low,left);
        }
        if(right < high-1) {
            quick(array,right,high);
        }
       /* if(par > low+1) {
            quick(array,low,par-1);
        }
        if(par < high-1) {
            quick(array,par+1,high);
        }*/
    }

    /**
     * 递归版本
     * @param array
     */
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = new int[10000];//n   log2n
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000)+1;
        }
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
