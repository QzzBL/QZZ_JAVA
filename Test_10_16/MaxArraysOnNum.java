/**
 * @ClassName MaxArraysOnNum
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/16 10:53
 * @Title 愿上苍有好生之德
 **/

/**
 * 2、求连续子数组的最大和？？？{1, -3, 5, 9, -2, 9}最小值：不能超过0x80000000
 */
public class MaxArraysOnNum {
    public static int maxArraysOnNum(int[] arr){
        //定义maxSum表示连续子数组的最大和，numArr表示 连续子数组的和
        int maxSum = 0;
        int numArr = 0;
        for(int i = 0; i < arr.length; i++){
            numArr = numArr + arr[i];
            //如果子数组的和小于下一个数，则丢弃前面的的数，以下一个数为新起点开始求和
            if(numArr < arr[i]){
                numArr = arr[i];
                maxSum = numArr;
                //如果每次运算的和大于前一次的和，则赋给maxSum最新的子数组和
            }else if(numArr > maxSum){
                maxSum = numArr;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, -3, 5, 9, -2, 9};
        System.out.println(maxArraysOnNum(arr));
    }
}
