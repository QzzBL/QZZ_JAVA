/**
 * Created with IntelliJ IDEA.
 * Description:作业：
 * User: GAOBO
 * Date: 2018-10-17
 * Time: 19:05
 */

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

/**
 * 1、实现二分查找算法：有序的数组
 * pubclic static int binary(int[] array,int key) {} 找到返回下标，没有找到-1；
 * 2、求连续子数组的最大和？？？{10,2，-1,9，-10，-99}最小值：不能超过0x80000000
 * 3、交换两个数？
 * 类：
 * 4、逆置数组？{1,2,3,4}===》{4,3,2,1}
 */

class MyVlue {
  int data;
}

public class TestDemo1 {

    public static void swap(MyVlue myVlue,MyVlue myVlue2) {
        int tmp = myVlue.data;
        myVlue.data = myVlue2.data;
        myVlue2.data = tmp;
    }
    public static void swap1(int a,int b) {
        int tmp =a;
        a = b;
        b = tmp;
    }
    public static void swap2(int[] array,int[] brray) {
        int tmp = array[0];
        array[0] = brray[0];
        brray[0] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] brray = array;
    }

    public static void main2(String[] args) {
        MyVlue myVlue = new MyVlue();
        myVlue.data = 10;
        MyVlue myVlue2 = new MyVlue();
        myVlue2.data = 20;
        swap(myVlue,myVlue2);
        System.out.println(myVlue.data);//20
        System.out.println(myVlue2.data);//10


        /*int a = 10;
      /*  int[] array = {10};
        int[] brray = {20};
        swap2(array,brray);
        System.out.println(array[0]);
        System.out.println(brray[0]);*/
        /*int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);*/
    }

    public static int binarySearch(int[] array,int val) {
        int low = 0;
        int high = array.length-1;
        while(low <= high) {
            int mid = (low+high)>>>1;//(low+(high-low))/2;
            if(array[mid] > val) {
                high = mid - 1;
            } else if(array[mid] < val) {
                low = mid+1;
            } else {
                return mid;
            }
        }
        return -(low+1);
    }
//时间复杂度：O(n^2)
   public static int maxVal(int[] array) {

        int max = Integer.MIN_VALUE;//0X80000000
       if(array == null) {
           return max;
       }

        int sum = 0;
        for(int i = 0;i < array.length;i++) {
            sum = 0;
            for(int j = i;j < array.length;j++) {
                sum += array[j];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
   }
    public static int maxVal2(int[] array) {
        int max = Integer.MIN_VALUE;//0X80000000
        int sum = 0;
        //10 -1 9 -100
        for(int i = 0;i < array.length;i++) {
            if(sum <= 0) {
                sum = array[i];//10
            } else {
                sum += array[i];//9   18  -
            }
            if(sum > max) {
                max = sum;//18
            }
        }
        return max;
    }


    public static void main1(String[] args) {
        int[] array = {1,12,3,4,5,6};
        Arrays.sort(array);//优化后的快速排序
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,-7));

        System.out.println(binarySearch(array,5));
        System.out.println(binarySearch(array,-5));
        System.out.println(binarySearch(array,15));
    }
}
