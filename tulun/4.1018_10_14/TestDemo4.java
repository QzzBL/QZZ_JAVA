import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-14
 * Time: 21:07
 */

/**
 * 1、实现二分查找算法：有序的数组
 * pubclic static int binary(int[] array,int key) {} 找到返回下标，没有找到-1；
 * 2、求连续子数组的最大和？？？{10,2，-1,9，-10，-99}最小值：不能超过0x80000000
 * 3、交换两个数？
 * 4、逆置数组？{1,2,3,4}===》{4,3,2,1}
 */
public class TestDemo4 {

    public static void swap(int a,int b) {
        int tmp = 0;
        tmp = a;
        a = b;
        b = tmp;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

        int[] array = {1,2,3,4,5};
        int[] array2 = array;//数组引用之间的赋值

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        array[0] = 1000;
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(array2));
    }
}
