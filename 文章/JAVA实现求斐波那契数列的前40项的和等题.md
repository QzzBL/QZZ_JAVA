## JAVA实现求斐波那契数列的前40项的和等题

---

##### 1.求斐波那契数列的前40项的和

```java
/**
 * 求斐波那契数列的前40项的和
 *
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）
 * 以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
 * 在数学上，斐波纳契数列以如下被以递归的方法定义：F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
 */


// 方法一：

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int i = 1; //第一项数字
        int firstNum = 1;
        int secondNum = 1;
        int preNum = 1;
        int lastNum = 1;
        int lastLastNum = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想求和到第多少项： ");
        int input = scanner.nextInt();
        while(i <= input){
            lastLastNum = preNum + lastNum;//3
            preNum = lastNum;//1
            lastNum = lastLastNum;//2
            System.out.print(lastLastNum + " ");       
            i++;
        }
    }
}



//方法二：

public class Fibonacci {
    public static void main(String[] args) {
        int []arr = new int[40];
        arr[0] = 1;
        arr[1] = 1;
        int sum = 0;
        for(int i =2; i < arr.length; i++){
            arr[i] = arr[i -2] + arr[i - 1];
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
```



---

##### 2.用for循环产生20个随机数（10-20）

```java
import java.util.*;
public class Ran {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i <= 20; i++) {
            int r = random.nextInt(10) + 10;
            System.out.println(r);
        }
    }
}
```



---

##### 3.输入一个数字，求他是几位数，并且顺序输出，逆序输出

```java
import java.util.Scanner;
public class InputNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;//代表位数
        int temp = input;//重赋值而已
        int temp1 = temp;//重赋值而已，用于下面
        //计算输入数的位数
        while(input!=0){
            input = input/10;
            count++;  //计数加一
        }
        System.out.println("是" + count + "位数");

        //顺序打出
        while(count >= 1){
            count--;
            System.out.print(temp/(int)(Math.pow(10,count) ) + " ");
            //Math  参数类型是double，必须强转这里
            temp = (int)(temp % (Math.pow(10,count)));
        }
        
        System.out.println();
        
        //逆序打出
        while(temp1!=0){
            System.out.print(temp1 % 10+ " ");
            temp1 = temp1/10;
        }
    }
}
```



---

##### 4.求一个数字的二进制数有几个1

```java
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        while((input & 1) != 0){
            input >>>= 1;//无符号移动
            count++;
        }
        System.out.println(count);
    }
}
```









                                                         2018.10.14/周天
                                                         by 922