## Java实现二分查找算法等题

---

##### 1.实现二分查找算法：有序的数组

```java
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
        
        System.out.println("输入你想查询的数字key：");
        int key = scanner.nextInt();//输入要查询的数
        int indexNum = binarySearch(arr, key);
        System.out.println("与key相等的元素下表为：" + indexNum);
    }

    static int binarySearch(int[] arr, int a) {
        
        int low = 0；//代表索引
        int high = arr.length - 1;
        int count = 1;//计数
        
        while (low <= high) {
            System.out.println("第" + count + "次二分查找范围" + low + "---------------" + high);
            int mid = (low + high) / 2;
            if (arr[mid] == a) {
                return mid;
            } else if (arr[mid] > a) {
                high = mid - 1 ;//如果单纯为 high = mid，low = mid，查找最后一个数会陷入无限循环
            } else {
                low = mid + 1;
            }
            count++;
        }
        return -1;
    }
}

//运算结果：
/*
输入你想安排的元素个数：
5
输入有序的元素+空格不断输入：
1 2 3 4 5
输入你想查询的数字key：
2
第1次二分查找范围0---------------4
第2次二分查找范围0---------------1
第3次二分查找范围1---------------1
与key相等的元素下表为：1

Process finished with exit code 0
 */

```



---

##### 2.求连续子数组的最大和？例如：{10，2，-1，9，-10，-99}最小值：不能超过0x80000000

```java
public class MaxArraysOnNum {
    public static int maxArraysOnNum(int[] arr){
        //定义maxSum表示连续子数组的最大和，numArr表示 连续子数组的和
        int maxSum = 0;//可以写成 ： int maxSum = 0x80000000//0x80000000 为 -(2^31)
        int numArr = 0;
        for(int i = 0; i < arr.length; i++){
            numArr = numArr + arr[i];
            //如果子数组的和小于下一个数，则丢弃前面的的数，以下一个数为新起点开始求和
            if(numArr < arr[i]){
                numArr = arr[i];
                maxSum = numArr;
                //如果每次运算的和大于前一次的和，则赋给maxSum最新的子数组和
            }else if(numArr > maxSum){
                maxSum = numArr;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, -3, 5, 9, -2, 9};
        System.out.println(maxArraysOnNum(arr));
    }
}

//运算结果
/*
21

Process finished with exit code 0
*/
```



---

##### 3.交换两个数的几种方法

```java
public class SwapNumber {
    //方法一：引入一个变量交换
    public static void swap1(int a1, int b1){
        int temp;
        temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("a1" + " = " + a1 + "; " + "b1" + " = " + b1 + '\n');
    }
    //方法二：简单的加减运算，可能会溢出
    public static void swap2(int a2, int b2){
        a2 = a2 + b2;//30
        b2 = a2 - b2;//10
        a2 = a2 - b2;//20
        System.out.println("a2" + " = " + a2 + "; " + "b2" + " = " + b2 + '\n');
    }
    
    //方法三：异或
    
    //异或，相同为0，不同为1，二进制的运算
    /*
             10的二进制: 01010 //a3
             20的二进制: 10100 //b3
      异或得：30       ：11110 //  a3 = a3 ^ b3//30
                         此时相当于30分别与20异或得到：10//b3 = a3 ^ b3
                                   30   与10异或得到：20//a3 = a3 ^ b3
     */
    public static void swap3(int a3, int b3){
        a3 = a3^b3;//30
        b3 = a3^b3;//10
        a3 = a3^b3;//20
        System.out.println("a3" + " = " + a3 + "; " + "b3" + " = " + b3);
    }
    public static void main(String[] args) {
        swap1(10, 20);
        swap2(10, 20);
        swap3(10, 20);
    }
}

//运算结果：
/*
a1 = 20; b1 = 10

a2 = 20; b2 = 10

a3 = 20; b3 = 10

Process finished with exit code 0
 */
```



---

##### 4.逆置数组：{1,2,3,4}===》{4,3,2,1}

```java
import java.util.Scanner;
public class BackArrays {
    public static void backArraysNum(int[] arr, int n){
        for(n = arr.length - 1; n >= 0; n--){
            System.out.print(arr[n] + "  ");
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
        backArraysNum(arr, n);
    }
}

//运算结果：
/*
输入想要的数组长度:
5
输入自己想输入的数(与长度相匹配):
1 2 3 4 5
逆序打印:
5 4 3 2 1 
Process finished with exit code 0
 */
```









                                                             2018-10.16/周二
                                                             by 922