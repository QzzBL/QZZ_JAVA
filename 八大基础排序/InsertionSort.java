/*
插入排序：
         插入排序的基本操作就是将一个数据插入到已经排好序的有序数据中，
         从而得到一个新的、个数加一的有序数据，算法适用于少量数据的排序，
         时间复杂度为O(n^2)。是稳定的排序方法。
1.常规思路
2.优化算法
 */
public class InsertionSort {
    public static void main(String[] args){
        int arrays[] = {9, 8, 7, 6, 5};
        int temp;
        //第一趟排序
        /*if(arrays[1] > arrays[0]){
            //如果第二个数比第一个数大，不变
        }else{
            //如果第二个数比第一个数小，将第一个数退后一个位置（将第二个插进去）
            temp = arrays[1];
            arrays[1] = arrays[0];;
            arrays[0] = temp;
        }

        //第二趟排序
        if(arrays[2] > arrays[1]){
            //如果第三个数比第二个数大，不变
        }else{
            //如果第三个数比第二个数小，将第二个数往后退一个位置，让第三个数跟第一个数比
            temp = arrays[2];
            arrays[2] = arrays[1];

            //如果第三个数比第一个大，就插入到第二个数中
            if(temp > arrays[0]){
                arrays[1] = temp;
            }else{

                //如果第三个数比第一个小，就将第三个数插入到第一个数前面
                arrays[1] = arrays[0];
                arrays[0] = temp;

            }
        }
        */

        //2.优化算法
        //外层循环控制需要排序的趟数（从1开始是因为将第0位看成有序数据）
        for(int i = 1; i < arrays.length; i++){

                temp = arrays[i];//相当于从一排中提出来进行比较，合适的时候再插入相应的位置

                //如果前一位（已经排序的数据）比当先的数据（temp的数）大，那么就进入循环比较【与1.中第二趟排序一样】
                int j = i;//不重复使用 i 防止递减过程 i-- 影响外层的 i ,故赋值 j ， j--
                while(j >= 1 && arrays[j - 1] > temp){

                    //往后退一个位置，让当前的数据与之前的进行比较
                    arrays[j] = arrays[j - 1];

                    //不断向前，返回比较大小，知道循环退出
                    j--;
            }

            //循环退出意味着找到了合适的位置，将当前数据（temp中的数）插入合适的位置中
            arrays[j] = temp;
        }
        for(int num = 0; num < arrays.length; num++){
            System.out.print(arrays[num] + " ");
        }

    }
}
