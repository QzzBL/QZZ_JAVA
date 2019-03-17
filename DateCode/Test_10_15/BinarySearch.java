/**
 * @ClassName BinarySearch
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/15 20:03
 * @Title 愿上苍有好生之德
 **/
/**
 * 实现二分查找算法：有序的数组
 */

import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你想安排的元素个数：");
        int n = scanner.nextInt();//确定数组里放置几个元素
        int[] arr = new int[n];
        //放置数组里的元素
        System.out.println("输入有序的元素+空格不断输入：");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("输入你想查询的数字：");
        int key = scanner.nextInt();//输入要查询的数
        int indexNum = binarySearch(arr, key);
        System.out.println("与key相等的元素下表为：" + indexNum);
    }

    static int binarySearch(int[] arr, int a) {
        int low = 0;
        int high = arr.length - 1;
        int count = 1;
        while (low <= high) {
            System.out.println("第" + count + "次二分查找范围" + low + "-----------------" + high);
            int mid = (low + high) / 2;
            if (arr[mid] == a) {
                return mid;
            } else if (arr[mid] > a) {
                high = mid;
            } else {
                low = mid;
            }
            count++;
        }
        return -1;
    }
}
