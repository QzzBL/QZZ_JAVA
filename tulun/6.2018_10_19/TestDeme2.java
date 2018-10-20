package com.tulun.src;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-19
 * Time: 21:14
 */
public class TestDeno3 {

    public static int IndexOfOne(int number) {
        //每次让number右移和1进行与
        int count = 0;
        while((number & 1) == 0 && count < 32) {
            number = number>>1;
            count++;
        }
        return count;//2
    }

    public static boolean isOne(int number,int index) {
        number = number >> index;
        if((number & 1) == 0) {
            return false;
        }
        return true;
    }

    public static int[] findNumApperOnce(int[]  array) {
        //1、将一维数组里面所有的值进行异或
        int result = 0;
        for(int i = 0;i < array.length;i++) {
            result ^= array[i];
        }
        //从右往左数第index位为2进制1
        int index = IndexOfOne(result);
        //2
        //1 2 3 3 2 5
        int num1 = 0;
        int num2 = 0;
        for(int i = 0;i < array.length;i++) {
           if(isOne(array[i],index)) {//1    2
               num1 ^= array[i];
           } else {
               num2 ^= array[i];
           }
        }
        int[] resultArr = {0,0};
        resultArr[0] = num1;
        resultArr[1] = num2;
        return resultArr;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,3,2,5};
        int[] result = findNumApperOnce(array);
        System.out.println(Arrays.toString(result));
    }
}
