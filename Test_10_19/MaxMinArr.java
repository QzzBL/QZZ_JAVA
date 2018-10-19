/**
 * @ClassName MaxMinArr
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 11:34
 * @Title 愿上苍有好生之德
 **/

/**
 * 5.搜索数组中的最小值和最大元素
 */
public class MaxMinArr {
    public static void maxArr(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值: " + max);
    }
    public static void minArr(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("最小值: " + min);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        maxArr(arr);
        minArr(arr);
    }
}

/*
最大值: 6
最小值: 1

Process finished with exit code 0
 */