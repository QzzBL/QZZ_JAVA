package com.tulun.src;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-19
 * Time: 19:00
 */

import java.util.Arrays;

/**
 * 作业：
 * 1、{1,2,3,4,5,6}
 * 将奇数放在偶数前面     大小顺序不要求
 * 2、一个数组是有序的，给定一个key:数字   有两个数字的和加起来等于key
 * 找到这两个数字的下标   时间复杂度O(n)
 * {1,2,3,4,5,6}       7
 * 3、题目：=一个整形数组，除了两个数字只出现一次外，
 *  其他数字都是两次。{1,3,1,2,3,4}    找到这两个数字
 *
 * 4、熟悉Arrays这个类里面的方法：
 * 2.2：如何排序数组并插入某个元素？
 * 2.5：如何搜索数组中的最小值和最大元素？
 * 如何合并两个数组（合并到一个新的数组）？
 * 如何填充数组（一次填充，部分填充）？
 * 2.10：如何删除数组指定元素？
 * 2.11： 如何从数组中查找常见的元素？
 */
public class TestDemo2 {

    public static void fun(int[] array) {
        int i = 0;
        int j = array.length-1;
        while(i < j) {
            while(i < j && array[i] % 2 != 0) {
                i++;
            }
            while(i < j && array[j] % 2 == 0) {
                j--;
            }
            if(i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }

        }
    }

    public static int[] fun2(int[] array,int key) {
        int low = 0;
        int high = array.length-1;
        int sum = 0;
        int[] result = new int[2];
        while(low < high) {
            sum = array[low] +array[high];
            if(sum > key) {
                high--;
            } else if(sum < key) {
                low++;
            } else {
                result[0] = low;
                result[1] = high;
                break;
            }
        }
        return result;
    }
    public static int[] insertVal(int[] array,int key,int index) throws
            ArrayIndexOutOfBoundsException{//声明异常
        //assert  断言
        /*if(index < 0 || index >= array.length) {
            return brray;ArrayIndexOutOfBoundsException
        }*/
        int[] brray = new int[array.length+1];
        System.arraycopy(array,0,brray,0,index);//1
        brray[index] = key;//1
        System.arraycopy(array,index,brray,index+1,array.length-index);
        /*try {
            System.arraycopy(array,0,brray,0,index);//1
            brray[index] = key;//1
            System.arraycopy(array,index,brray,index+1,array.length-index);
        }catch (ArrayIndexOutOfBoundsException e) {//捕获异常
            System.out.println("数组越界异常");
            e.printStackTrace();
        }*/
        return brray;
    }

    public static int[] maxAndMin(int[] array) {
        int min = array[0];
        int max = array[0];
        int[] result = {0,0};
        for(int i = 0;i < array.length;i++) {
            if(array[i] > max) {
                max = array[i];
            } else if(array[i] < min) {
                min = array[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static int[] delteKey(int[] array,int index) {
        try {
            for(int i = index; i < array.length-1;i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = -1;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界拉");
            e.printStackTrace();
        }
        return array;
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        delteKey(array,-3);
        System.out.println(Arrays.toString(array));
       /* int[] array = new int[4];//1    100
        Arrays.fill(array,99);
        Arrays.fill(array,1,3,999);
*/
       // Arrays.sort(array);
        /*try {
            int[] brray = insertVal(array,100,-5);
            System.out.println(Arrays.toString(brray));
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
            e.printStackTrace();
        }*/

       /* int[] brray =  fun2(array,10);
        System.out.println(Arrays.toString(brray));*/
    }
}
