## Java数组题

---

##### 1.将一维数组奇数放在偶数前面，大小顺序不要求

```java
import java.util.*;

/**1、{1,2,3,4,5,6}
 将一维数组奇数放在偶数前面，大小顺序不要求，例如{1,2,3,4,5,6} ==> {1,3,5,2,4,6} 

 * 思想：
        从数组的第下标所以1开始也就是第二个数开始，和前面的比较，如果是偶数，交换位置,
 *      下标移动进行往后走当走到后面都是偶数是，不交换，内部i++走到一串偶数的后面奇数位置，
 *      不断地和前面交换直到，交换的面前为奇数停止，while循环出去，for中i从当前位置往后走，
 *      直到最后i == 数组长度，排好序，break；
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
//运算结果：
/*
 [1, 3, 5, 2, 4, 6]

 Process finished with exit code 0
 */

```



---

##### 2.一个数组是有序的，给定一个key:数字  ，有两个数字的和加起来等于key找到这两个数字的下标

```java

/**常规解法：
 * 2、一个数组是有序的，给定一个key:数字   有两个数字的和加起来等于key
 *    找到这两个数字的下标
 *    {1,2,3,4,5,6}
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
//运算结果：
/*
下标和其对应的值: 0: 1      5: 6
下标和其对应的值: 1: 2      4: 5
下标和其对应的值: 2: 3      3: 4
下标和其对应的值: 3: 4      2: 3
下标和其对应的值: 4: 5      1: 2

Process finished with exit code 0
 */
```



---

##### 3.一个整形数组，除了两个数字只出现一次外，*其他数字都是两次。例如：{1,3,1,2,3,4}    找到这两个数字

```java
（1）常规方法一:先找相同，再判断与相同的不否的则为不同的那两个数字
 * （2）方法二:(如下代码)思想:
 *                          先对数组排序，由于两个相同，只需从0下标开始和后面的比，元素相同
 *                          则i加上2，比如{1,1,2,3,3,4}中，从0下标调到2号下标，再和后面比较
 *                          不同则已经确定一个元素，i加1再次判断加1后的元素与它后面是否相等，
 *                          相等则找到，此为一种情况，代码最下方的四中情况就概括了两个数字可能
 *                          放置的不同位置，最后打印，一次for循环即可
 */

import java.util.*;
public class SingleNum {
    public static void singleNum(int[] arr){
        int i;
        int j;
        for( i = 0 ; i < arr.length; i = i + 2){
            if(i == arr.length - 1){//判断 i 和 最后一个下标是否相等，例如case1:{1,1,2,3,3,4}，找到最后不同的元素
                System.out.println(arr[i]);
                break;
            }
            if(arr[i] != arr[i + 1] ){
                i++;
                if( i == arr.length - 1 || arr[i] != arr[i + 1]){// i == arr.length - 1 用于判断ase3:{1,1,2,2,3,4}情况,//!= 判断不能放在前面，应为最后一个数的后面没有数了，会数组下标越界
                    System.out.println(arr[i - 1] + " " + arr[i]);
                    break;
                }else {
                    System.out.println(arr[i - 1]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,4}; //sort后: case1:{1,1,2,3,3,4} 2  4；两个只出现一次的数，一个在中间，一个在最后
       //int[] arr = {1,3,5,2,5,1};//sort后: case2:{1,1,2,3,5,5}  2  3；两个只出现一次的数，都在中间
        //int[] arr = {1,1,2,3,4,2};//sort后: case3:{1,1,2,2,3,4}  3  4；两个只出现一次的数，都在末尾
        //int[] arr = {1,2,1,4,5,3,3,5};//sort后: case:{1,1,2,3,3,4,5,5} 2  4；两个只出现一次的数，在数组中间，并且夹着数
        Arrays.sort(arr);
        singleNum(arr);
    }
}
//运算结果：
/*
3 4

Process finished with exit code 0
 */
```



---

##### 4.如何排序数组并插入某个元素

```java
import java.util.*;
public class InsertNumOnArr {
    public static void insertNumOnArr(int[] arr,int[] arr1, int key){
        System.arraycopy(arr,0,arr1,0,arr.length);
        arr1[arr1.length - 1] = key;
        Arrays.sort(arr1);
        System.out.println("插入后的数组 arr1: " + Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("指定数组长度: ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n + 1];//创建此数字比arr多一个空间，存放插入元素
        int[] arr = new int[n];
        System.out.println("输入数组中的数: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("要插入的数字: ");
        int key = scanner.nextInt();
        System.out.println("一开始输入的数组 arr: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("未插入时排好的数组 arr: " + Arrays.toString(arr));

        insertNumOnArr(arr, arr1, key);
    }
}
//运算结果：
/*
指定数组长度: 
5
输入数组中的数: 
1 9 6 8 5
要插入的数字: 
2
一开始输入的数组 arr: [1, 9, 6, 8, 5]
未插入时排好的数组 arr: [1, 5, 6, 8, 9]
插入后的数组 arr1: [1, 2, 5, 6, 8, 9]

Process finished with exit code 0
 */
```



---

##### 5.搜索数组中的最小值和最大元素

```java
public class MaxMinArr {
    public static void maxArr(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值: " + max);
    }
    public static void minArr(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("最小值: " + min);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        maxArr(arr);
        minArr(arr);
    }
}
//运算结果
/*
最大值: 6
最小值: 1

Process finished with exit code 0
 */
```



---

##### 6.合并两个数组（合并到一个新的数组）

```java
import java.util.*;
public class MergeArr {
    public static void mergeArr(int[] arr, int[] arr1, int[] arr2){
        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr1,0,arr2,arr.length,arr1.length);
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {6,7,8,9};
        int[] arr2 = new int[arr.length + arr1.length];
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("arr1: " + Arrays.toString(arr1));
        mergeArr(arr, arr1, arr2);
    }
}
//运算结果：
/*
arr: [1, 2, 3, 4, 5]
arr1: [6, 7, 8, 9]
arr2: [1, 2, 3, 4, 5, 6, 7, 8, 9]

Process finished with exit code 0
 */
```



---

##### 7.填充数组（一次填充，部分填充）

```java
//牵扯到Array.fill的用法
import java.util.*;
public class ArrayFill {
    public static void main(String[] args) {
        String[] arr1 = new String[6];
        System.out.println("未填充: " + Arrays.toString(arr1));

        Arrays.fill(arr1, "tulun");
        System.out.println("完全填充: " + Arrays.toString(arr1));

        Arrays.fill(arr1, 3, 5,"qzz");
        System.out.println("部分填充: " + Arrays.toString(arr1));
    }
}
//运算结果：
/*
未填充: [null, null, null, null, null, null]
完全填充: [tulun, tulun, tulun, tulun, tulun, tulun]
部分填充: [tulun, tulun, tulun, qzz, qzz, tulun]

Process finished with exit code 0
 */
```



---

##### 8.删除数组指定元素

```java
//ArrayList集合的运用
import java.util.ArrayList;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList List = new ArrayList();
        for( int i=0;i<10;i++ ) { //给数组增加10个Int元素
            List.add(i);
        }
        System.out.println("增加的元素: " + List);

        System.out.println("输入想删除的下标号key: ");
        int key = scanner.nextInt();
        List.remove(key);
        System.out.println("删除下表为: " + key + "的元素后的数组: "+ List);
    }
}
```



---

##### 9.从数组中查找常见的元素

```java
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
//运算结果：
/*
输入要查找的元素： 
55
-1

Process finished with exit code 0
 */


//运算结果：
/*
输入要查找的元素： 
6
5   //下标为5
-1

Process finished with exit code 0
 */

```









                                                     2018.10.19/周五
                                                     by 922