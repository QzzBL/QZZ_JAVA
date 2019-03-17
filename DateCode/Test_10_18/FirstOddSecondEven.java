/**
 * @ClassName FirstOddSecondEven
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/18 22:58
 * @Title 愿上苍有好生之德
 **/
import java.util.*;

/**1、{1,2,3,4,5,6}
 将一维数组奇数放在偶数前面，大小顺序不要求，例如{1,2,3,4,5,6} ==> {1,3,5,2,4,6}

 * 思想：从数组的第下标所以1开始也就是第二个数开始，和前面的比较，如果是偶数，交换位置
 * ，下标移动进行往后走当走到后面都是偶数是，不交换，内部i++走到一串偶数的后面奇数位置，
 * 不断地和前面交换直到，交换的面前为奇数停止，while循环出去，for中i从当前位置往后走，
 * 直到最后i == 数组长度，排好序，break；
 */
public class FirstOddSecondEven {
    public static void firstOddSecondEven(int[] arr){
        int temp = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] % 2 == 0 && arr[i] % 2 == 1){
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            while(arr[i - 1] % 2 == 0 && arr[i] % 2 == 0){
                i++;
                if(i == arr.length){
                    break;
                }
                while(arr[i - 1] % 2 ==0 && arr[i] % 2 == 1){
                    temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        firstOddSecondEven(arr);
    }
}
