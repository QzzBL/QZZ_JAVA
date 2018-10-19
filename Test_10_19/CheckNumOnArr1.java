/**
 * @ClassName CheckNumOnArr1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 13:16
 * @Title 愿上苍有好生之德
 **/
/**
 * 9.如何从数组中查找常见的元素？
 */

import java.util.*;
public class CheckNumOnArr1{
    public static int kk(int[] arr3, int num1){

        for(int i = 0; i < arr3.length; i++){
            if(arr3[i] == num1){
                System.out.println(i);
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr3 = {1,2,3,4,5,6,7,8,9};
        System.out.println("输入要查找的元素： ");
        int num1 = scanner.nextInt();
        int index = kk(arr3, num1);
        System.out.println(index);
    }
}
