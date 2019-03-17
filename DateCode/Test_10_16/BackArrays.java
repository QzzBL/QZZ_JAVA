/**
 * @ClassName BackArrays
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/16 0:13
 * @Title 愿上苍有好生之德
 **/

/**
 * 4.逆置数组？{1,2,3,4}===》{4,3,2,1}
 */
/**
 * 4.逆置数组：{1,2,3,4}===》{4,3,2,1}
 */

import java.util.Scanner;
public class BackArrays {
    public static void backArraysNum(int[] arr, int n){
        for(n = arr.length - 1; n >= 0; n--){
            System.out.printf("%d ",arr[n]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入想要的数组长度
        System.out.println("输入想要的数组长度:");
        int n = scanner.nextInt();
        int []arr = new int[n];
        System.out.println("输入自己想输入的数(与长度相匹配):");
        for(int i = 0; i < n; i++){
            //输入自己想输入的数存入数组
            arr[i] = scanner.nextInt();
        }
        System.out.println("逆序打印：");
        backArraysNum(arr, n);
    }
}
/*
输入想要的数组长度:
5
输入自己想输入的数(与长度相匹配):
1 2 3 4 5
逆序打印：
5 4 3 2 1
Process finished with exit code 0
 */