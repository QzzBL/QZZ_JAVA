## Java的四种拷贝（和“浅拷贝、深拷贝”）

---

[TOC]



#### 一、“浅拷贝” 与 “深拷贝”区别：

> 浅拷贝：
>
> 是将原始对象中的数据型字段拷贝到新对象中去，将引用型字段的“**引用”复制到新对象中去**，**不把“引用的对象”复制进去**，所以原始对象和新对象**引用同一对象**，新对象中的引用型字段发生变化会导致原始对象中的对应字段也发生变化。

> 深拷贝：
>
> 是在引用方面不同，深拷贝就是创建一个新的和原始字段的内容相同的字段，是两个一样大的数据段，所以两者的引用是不同的，之后的新对象中的引用型字段发生改变，不会引起原始对象中的字段发生改变。



#### 二、四种拷贝：

- for（）循环拷贝
- clone（）拷贝
- System.arraycopy（） 拷贝
- Arrays.copyOf （）拷贝



#### 三、两种类型的运用：

- 基本类型 （深拷贝）：以下例子中，改变拷贝数组元素，源数组不变，则**深拷贝**
- 引用类型 （浅拷贝）：以下例子中，改变拷贝数组元素，源数组不变，则**浅拷贝**



#### 四、几种拷贝的介绍：

##### 1.for（）循环拷贝

通过循环赋值来将元数组里面的元素拷贝到目标数组



##### 2.clone（） 拷贝

函数原型是： 

> clone 

```java
protected Object clone()
                throws CloneNotSupportedException
```

> `clone的方法Object执行特定的克隆操作。 首先，如果此对象的类不实现接口Cloneable ，则抛出CloneNotSupportedException 。 请注意，所有数组都被认为是实现接口Cloneable ，并且数组类型T[]的clone方法的返回类型是T[] ，其中T是任何引用或原始类型。 否则，该方法将创建该对象的类的新实例，并将其所有字段初始化为完全符合该对象的相应字段的内容，就像通过赋值一样。 这些字段的内容本身不被克隆。 因此，该方法执行该对象的“浅拷贝”，而不是“深度拷贝”操作。`



##### 3.System.arraycopy 拷贝

System中提供了一个native静态方法arraycopy(),可以使用这个方法来实现数组之间的复制。

函数原型是：

> arraycopy

```java
public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)
```

**参数**

`src` - 源数组。

`srcPos` - 源数组中的起始位置。

`dest` - 目标数组。

`destPos` - 目的地数据中的起始位置。

`length` - 要复制的数组元素的数量

`length` - 要复制的数组元素的数量



##### 4.Arrays.copyOf 拷贝

函数原型是：

> Arrays.copyOf

```java
public static <T> T[] copyOf(T[] original,
                             int newLength)
```

**参数类型**

`T` - 数组中对象的类

参数

`original` - 要复制的数组

`newLength` - 要返回的副本的长度



#### 五、当对象是“基本类型”（代码）

（四种拷贝对应方式为“深拷贝”）

for（）循环拷贝

```java
//for（）循环拷贝
import java.util.*;
public class SimpleCharcter {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = new int[array.length];
        for(int i = 0;i < array.length;i++) {
            brray[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }
}
/*输出结果：
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1, 2, 3, 4, 5, 6, 7, 8, 9]
=================
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1000, 2, 3, 4, 5, 6, 7, 8, 9]         （深拷贝）
*/
```



---

clone（）拷贝 

```java
//clone（）拷贝 
import java.util.*;
public class Clone {
    public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] brray = array.clone();

            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(brray));
            brray[0] = 1000;
            System.out.println("=================");
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(brray));

        }
    }
    
    /*输出结果：
    [1, 2, 3, 4, 5, 6, 7, 8, 9]
    [1, 2, 3, 4, 5, 6, 7, 8, 9]
=================
    [1, 2, 3, 4, 5, 6, 7, 8, 9]
    [1000, 2, 3, 4, 5, 6, 7, 8, 9]         (深拷贝)
    */
```



---

System.arraycopy （）

```java
//System.arraycopy()
import java.util.*;
public class System_Arraycopy {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = new int[array.length];
        System.arraycopy(array,0,brray,0,array.length);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }
}

/*输出结果：
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1, 2, 3, 4, 5, 6, 7, 8, 9]
=================
[1, 2, 3, 4, 5, 6, 7, 8, 9]
[1000, 2, 3, 4, 5, 6, 7, 8, 9]         （深拷贝）
*/
```



---

Arrays.copyOf （）

```java
//Arrays.copyOf 
import java.util.*;
public class TestArray1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = Arrays.copyOf(array,array.length);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }
 }
 
 /*输出结果：
 [1, 2, 3, 4, 5, 6, 7, 8, 9]
 [1, 2, 3, 4, 5, 6, 7, 8, 9]
 =================
 [1, 2, 3, 4, 5, 6, 7, 8, 9]
 [1000, 2, 3, 4, 5, 6, 7, 8, 9]         （深拷贝）
 */
```



---

#### 六、当对象是“引用类型”（代码）

（四种拷贝对应方式为“深拷贝”）

代码的实现思路：

- 定义源数组t1，目标数组（拷贝数组）t2，长度为4

- 定义一个 私有属性 val 用来当做数组的值

- 定义一个 print方法来打印数组

- main作为入口实现拷贝，和调用 print 方法

- 两次打印，中间改变 t2[0] 的值来看

  

  print(t1, t2); //拷贝后直接打印

  t2[0].setVal(100000); //中间改变 t2[0]

  print(t1, t2); //打印改变拷贝数组值，看t1、t2 的 第一个元素是否都改变

  ​ （浅拷贝：都变 / 深拷贝：只是t2 变）

```java
import java.util.*;
public class TestArray {
    private int val = 10;

    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return this.val;
    }
    public static void print(TestArray[] t1, TestArray[] t2){
        for(int i = 0;i < t1.length;i++) {
            t2[i] = t1[i];//赋值的是引用，最后t1[i] t2[i] 都指向的是引用的地址，一个变都变，浅拷贝
        }
        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }
        System.out.println();
        System.out.println();
    }
```

for（）循环拷贝及打印结果代码 

```java
//for（）
public static void main(String[] args) {
        TestArray[] t1 = new TestArray[4];//TestArray 已经是引用类型
        t1[0] = new TestArray();// t1[0] 链接的是对象的引用
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = new TestArray[4];//t2[0]
        print(t1, t2);
        t2[0].setVal(100000);
        print(t1, t2);
        }
        
        /*输出结果：
        10 10 10 10
        10 10 10 10
       
        100000 10 10 10
        100000 10 10 10         （浅拷贝）
        */
```

clone（） 

```java
//clone()
public static void main(String[] args) {
    TestArray[] t1 = new TestArray[4];
    t1[0] = new TestArray();
    t1[1] = new TestArray();
    t1[2] = new TestArray();
    t1[3] = new TestArray();
    TestArray[] t2 = t1.clone();//t2[0]
    print(t1, t2);
    t2[0].setVal(99999);
    print(t1, t2);
    }
    
    /*输出结果：
    10 10 10 10 
    10 10 10 10 

    99999 10 10 10 
    99999 10 10 10          (浅拷贝)
    */
```

System.arraycopy 

```java
//System.arraycopy() 
public static void main(String[] args) {
   TestArray[] t1 = new TestArray[4];
   t1[0] = new TestArray();
   t1[1] = new TestArray();
   t1[2] = new TestArray();
   t1[3] = new TestArray();
   TestArray[] t2 = new TestArray[4];//t2[0]
   System.arraycopy(t1,0,t2,0,t1.length);
   print(t1, t2);
   t2[0].setVal(88888);
   print(t1, t2);
   }
   
   /*输出结果：
   10 10 10 10 
   10 10 10 10 

   88888 10 10 10 
   88888 10 10 10         (浅拷贝)         
   */
```

Arrays.copyOf 

```java
//Arrays.copyOf ()
public static void main(String[] args) {
    TestArray[] t1 = new TestArray[4];
    t1[0] = new TestArray();
    t1[1] = new TestArray();
    t1[2] = new TestArray();
    t1[3] = new TestArray();
    TestArray[] t2 = Arrays.copyOf(t1,t1.length);
    print(t1, t2);
    t2[0].setVal(666666);
    print(t1, t2);
    
    /*输出结果：
    10 10 10 10 
    10 10 10 10 

    666666 10 10 10 
    666666 10 10 10         (浅拷贝) 
    */
```







                                                         2018.10.19/周五
                                                         by 922




​                                                  

