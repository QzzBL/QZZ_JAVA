/*
冒泡排序：
         冒泡排序（Bubble Sort，台湾译为：泡沫排序或气泡排序）是一种简单的排序算法。
         ，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复
         地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为
         越大的元素会经由交换慢慢“浮”到数列的顶端，故名。
1.常规算法
2.优化算法
3.最大优化算法
 */
public class BubbleSort {
    public static void main(String[] args){
        int arrays[] = {7 , 8 ,5 ,2 ,3};
        //使用临时变量，让两个数交换
        int temp;

        //1.常规思路



        //第一趟排序
        //第一位和第二位比
        /*if(arrays[0] > arrays[1]) {
            temp = arrays[0];
            arrays[0] = arrays[1];
            arrays[1] = temp;
        }

        //
        if(arrays[1] > arrays[2]){
            temp = arrays[1];
            arrays[1] = arrays[2];
            arrays[2] = temp;
        }

        if(arrays[2] > arrays[3]){
            temp = arrays[2];
            arrays[2] = arrays[3];
            arrays[3] = temp;
        }

        if(arrays[3] > arrays[4]){
            temp = arrays[3];
            arrays[3] = arrays[4];
            arrays[4] = temp;
        }

        // 第二趟
        if(arrays[0] > arrays[1]) {
            temp = arrays[0];
            arrays[0] = arrays[1];
            arrays[1] = temp;
        }

        //
        if(arrays[1] > arrays[2]){
            temp = arrays[1];
            arrays[1] = arrays[2];
            arrays[2] = temp;
        }

        if(arrays[2] > arrays[3]){
            temp = arrays[2];
            arrays[2] = arrays[3];
            arrays[3] = temp;
        }
        */

        //2.代码简化 第二种利用for循环

        //外层循环的是排序的趟数
        /*for(int i = 0 ; i < arrays.length - 1; i++){
            //内层循环的是当前趟数需要比较的次数
            for(int j = 0; j < arrays.length - i - 1; j++){
                //前一位和后一位比较，如果前一位比后一位要大，进行交换
                if(arrays[j] > arrays[j + 1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                }
            }
        }*/

        //3.冒泡排序优化


        /*
        从上面的例子我们可以看出来，如果数据足够乱的情况下是
        需要经过4躺比较才能将数组完整排好序。
        但是我们在第二躺比较后就已经得到排好序的数组了。
        但是，我们的程序在第二趟排序后仍会执行第三趟、第四趟排序。这是没有必要的，
        因此我们可以对其进行优化一下：
        如果在某躺排序中没有发生交换位置，那么我们可以认为该数组已经排好序了。
        这也不难理解，因为我们每趟排序的目的就是将当前趟最大的数置换到对应的位置上，
        没有发生置换说明就已经排好序了。
         */
        //记录是否发生了置换，0表示没有发生置换，1表示发生了置换
        int ischange;
        //记录执行了多少趟
        int n = 0;

        //外层循环是排序的趟数
        for(int i = 0; i < arrays.length - 1; i++){

            //每比较一次就重新初始化0
            ischange = 0;


            //内层循环是当前趟数需要比较的次数
            for(int j = 0; j < arrays.length - i - 1; j++){
                //前一位和后一位比较，如果前一位比后一位要大，进行交换
                if(arrays[j] > arrays[j + 1]){
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;

                    //如果进到这里面，说明发生了置换
                    ischange = 1;
                }
            }
            if(ischange == 0){
                break;
            }
            n++;
        }

        System.out.println(n);
        for(int num = 0; num < arrays.length; num++){
            System.out.print(arrays[num] + " ");
        }
    }
}
