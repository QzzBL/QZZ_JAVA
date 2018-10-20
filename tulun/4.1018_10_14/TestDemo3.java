import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:数组简单讲解
 *
 * 数组的拷贝方式：
 * for     clone()    System.arraycopy();   Arrays.copyOf()
 * 简单类型数组   引用类型数组   用以上4中拷贝方式的区别？？？
 * 深拷贝   浅拷贝
 * 考试真题
 *
 * 冒泡排序：
 * 选择排序：
 * 插入排序：
 * shell排序：
 * 快速排序：
 * 堆排序：
 * 基数排序：、、、
 *
 * User: GAOBO
 * Date: 2018-10-14
 * Time: 20:22
 */

/**
 * 数组：一块相同数据类型的集合
 */
public class TestDemo3 {

    //用数组打印出斐波那契数列的20项 1 1 2 3 5 8 ......
    public static void fabonacio(int[] array) {

        array[0] = 1;
        array[1] = 1;
        for(int i = 2;i < array.length;i++) {
            array[i] = array[i-1]+array[i-2];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[20];
        fabonacio(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main1(String[] args) {

        int[] array1 = {15,2,30,14,5};//引用类型
        //array1 = {1,2,3,4,5}; error
        array1 = new int[] {1,2,3,4,5};


        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[5];//0
        for(int i = 0;i < array2.length;i++) {
            System.out.print(array2[i] + " " );
        }
        System.out.println();

        for(int i : array2) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(array2));//Arrays:

        int[] array3 = new int[] {1,2,3,4,5};
        int[] array4 = new int[5];
        array4 = new int[6];

    }
}
