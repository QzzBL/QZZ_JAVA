/**
 * @ClassName TwoNumSumKey
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 0:09
 * @Title 愿上苍有好生之德
 **/
/**
 * - 个数组是有序的，给定一个key:数字   有两个数字的和加起来等于key
 * - 找到这两个数字的下标
 */

/**常规解法：
 * 2、一个数组是有序的，给定一个key:数字   有两个数字的和加起来等于key
 *  * - 找到这两个数字的下标
 *  * - {1,2,3,4,5,6}
 *
 */
public class TwoNumSumKey {
    public static void twoNumSumKey(int[] arr,int key){
        for(int i = 0; i < arr.length ; i++){
            for(int j = 1; j < arr.length; j++){
                int sum = 0;
                sum = arr[i] + arr[j];
                if(sum == key){
                    System.out.println("下标和其对应的值: " + i + ": " + arr[i]+ "      " + j + ": " + arr[j] );
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int key = 7;
       twoNumSumKey(arr, key);

    }
}
