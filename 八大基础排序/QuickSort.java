/*
快速排序：
         快速排序由C. A. R. Hoare在1962年提出。它的基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
         其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排序，
         整个排序过程可以递归进行，以此达到整个数据变成有序序列。
         更简单的理解是这样的：在数组中找一个支点(任意),经过一趟排序后，支点左边的数都要比支点小，支点右边的数都要比支点大！

         现在我们有一个数组：int arr[]={1,4,5,67,2,7,8,6,9,44};
         经过一趟排序之后，如果我选择数组中间的数作为支点：7(任意的)，
         那么第一趟排序后的结果是这样的：{1,4,5,6,2,7,8,67,9,44}
         那么就实现了支点左边的数比支点小，支点右边的数比支点大
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 8, 10};

        quickSort(arr, 0, 4);

        for(int num = 0; num < arr.length; num++){
            System.out.print(arr[num] + " ");
        }
    }
    public static void quickSort(int[] arr, int L, int R) {
        int i = L;
        int j = R;

        //支点
        int pivot = arr[(L + R) / 2];

        //左右两端进行扫描，只要两端还没有交替，就一直扫描
        while (i <= j) {

            //寻找直到比支点大的数
            while (pivot > arr[i])
                i++;

            //寻找直到比支点小的数
            while (pivot < arr[j])
                j--;

            //此时已经分别找到了比支点小的数(右边)、比支点大的数(左边)，它们进行交换
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        //上面一个while保证了第一趟排序支点的左边比支点小，支点的右边比支点大了。


        //“左边”再做排序，直到左边剩下一个数(递归出口)
        if (L < j)
            quickSort(arr, L, j);

        //“右边”再做排序，直到右边剩下一个数(递归出口)
        if (i < R)
            quickSort(arr, i, R);




    }
}
