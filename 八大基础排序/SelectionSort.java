/*
选择排序：
         选择排序(Selection sort)是一种简单直观的排序算法。
         它的工作原理是每一次从待排序的数据元素中选出最小(或最大)的一个元素，
         存放在序列的起始(末尾)位置，直到全部待排序的数据元素排完。
         选择排序是不稳定的排序方法（比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，
         导致第一个5挪动到第二个5后面）。
 */
public class SelectionSort {
    public static void main(String[] args){
        int arrays[] = {6, 3, 5, 6, 3, 9, 19, 8, 32, 66, 22, 25, 65, 55};
        //存放交换的变量
        int temp;

        //记录当前趟数的最大角标
        int pos;

        //外层循环控制需要排序的趟数
        for(int i = 0; i < arrays.length - 1; i++){

            //新的趟数，将角标重新赋值为0
            pos = 0;

            //内层循环控制遍历数组的个数并得到最大数的角标
            for(int j = 0; j < arrays.length - i; j++){
                if(arrays[j] > arrays[pos]){
                    pos = j;
                }
            }
            //交换
            temp = arrays[pos];
            arrays[pos] = arrays[arrays.length - i - 1];
            arrays[arrays.length - i - 1] = temp;
        }
        for(int num = 0; num < arrays.length; num++){
            System.out.println(num + "=" + arrays[num]);
        }
    }
}
