### 集合---List

---

#### 一、简介

##### 1.Java集合框架的由来:

> 其实在Java2(jdk1.2)之前，Java是没有完整的集合框架的。它只有一些简单的可以自扩展的容器类，比如Vector，Stack，Hashtable等。    为什么存在容器类: 容器类(集合类)可以存储多个数据,既然数组可以存储多个数据,为什么需要定义容器类.

##### 2.数组的弊端:

> 1): 长度是不可变的,一旦数组初始化之后,长度是固定的.                                        
>
> 2): 在N个地方需要存储多个数据,都得专门去编写数组的操作方法,如此以来,没有体现DRY原则.                                              代码和功能重复-------->封装思想.                                       
>
> 3): 即使每一个人都要使用到数组类,但是不同的人定义的类名和方法名是不同的,实现细节也是参差不齐的.  SUN公司就自己定义好了容器类,每一个开发者只管调用即可.    
>
>  在集合框架这个章节: 拿来主义.

##### 3.什么是集合框架:

> 尽管这些容器类非常好用,但是却不能集中和统一管理。集合框架是为表示和操作集合而规定的一种统一的标准的体系结构。任何集合框架都包含三大块内容：对外的接口、接口的实现和对集合运算的算法(底层都对应着某一种数据结构的算法)。

##### 4.为什么需要集合框架

> (把集合框架的类和接口都存放在java.util包中):    
>
> 1):提供功能的复用(java.util包).    
>
> 2):让程序工作者专注于业务开发,而不是数据结构和算法.

##### 5.常用的框架接口规范:  

> 集合中存储的对象,称之为集合元素.

##### 6.常用的集合类:   

> Set(集):集合中的对象不按特定方式排序,不允许元素重复.	   
>
> List(列表):集合中的对象按照索引位置排序,允许元素重复.   
>
> Map(映射):集合中每一个元素都包含一对key和value对象.不允许key对象重复,值对象可以重复.



![2 (1)](C:\Users\GBZ\Desktop\2 (1).png)

---

#### 二、List实现类性能和特点分析

![2 (2)](C:\Users\GBZ\Desktop\2 (2).png)

##### 1.List接口： 

1. ​     重复性：数据可以重复
2. ​     null值：可以有null存在
3. ​     有序性：保证数据的插入有序

##### 2.面向接口编程:

> 接口类型  变量 =   new  实现类();List      list = new ArrayList();

---

##### 3.ArrayList与LinkedList的特点（及源码探究）：

**ArrayList** 

特点： 

> 重复性：数据可以重复
>
> 有序性：能保证数据的插入有序
>
> null值：可以有 null值存在
> 

**LinkedList：**

特点：

> 重复性：可以重复存储数据
>
> 有序性：数据按照插入有序
>
> null值：可以存储null值

---

**ArrayList源码探究：**

```java
1.继承关系
2.底层数据结构
3.基本属性(包括“默认值”)
4.构造函数
5.增长方式

//1.继承关系
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
ArrayList继承AbstractList，父类中对部分接口进行实现
实现了List接口提供的方法，Serializable说明该类能够被序列化 ，能够被克隆、序列化

//2.底层数据结构
ArrayList底层数据结构是"数组"

//3.基本属性
private static final int DEFAULT_CAPACITY = 10;
默认容量大小
private static final Object[] EMPTY_ELEMENTDATA = {};
默认数组大小
private transient Object[] elementData;
存储元素的数组
private int size;
集合存储元素的个数

//4.构造函数
    public ArrayList(int initialCapacity) {
        super();
        //指定大小不合法，则直接抛出异常
        初始化数组大小
        
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        this.elementData = new Object[initialCapacity];
    }
    //有参构造，指定集合初始化大小
    

    public ArrayList() {
        super();
        this.elementData = EMPTY_ELEMENTDATA;
    }
    //无参构造

    public ArrayList(Collection<? extends E> c) {
        elementData = c.toArray();
        size = elementData.length;
        // c.toArray might (incorrectly) not return Object[] (see 6260652)
        if (elementData.getClass() != Object[].class)
            elementData = Arrays.copyOf(elementData, size, Object[].class);
    }
    
    //有参构造，通过集合来创建新的集合
    
//5.增长方式
按照原数组的1.5倍进行扩容
```

**LinkedList源码探究:**

```java
1.继承关系
2.底层数据结构
3.基本属性(包括“默认值”)
4.构造函数
5.增长方式

//1.继承关系
public class LinkedList<E>
    extends AbstractSequentialList<E>
    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
extends AbstractSequentialList<E>对List接口的实现
implements Deque<E>  具有队列的特征：先进先出 
提供了特殊的方法，从头、从尾进行添加、删除、获取

//2.底层数据结构
底层数据结构是“双向链表”

//3.基本属性(包括“默认值”,无默认值)
属性：
    transient int size = 0;  集合中元素个数
    transient Node<E> first; 头结点
    transient Node<E> last; 尾结点

    private static class Node<E> {
        E item;  存储元素
        Node<E> next;  后继节点
        Node<E> prev;  前驱节点

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

//4.构造函数
构造函数
    public LinkedList() {
    }

    public LinkedList(Collection<? extends E> c) {
        this();
        addAll(c);
    }
    
//5.增长方式
LinkedList提供头插，尾插方式插入节点、默认采用的是尾插
```

---

##### 4.ArrayList与LinkedList的相同点和不同点：

> ArrayList、LinkedList的异同点，各自优势（应用场景）

**相同点：**

1. 继承关系：List接口下的实现类，具有list提供的所有方法
2. 有序性：数据都是按照插入有序
3. 重复性：集合中元素是可以重复的
4. null值：都可以存储 null值
5. 安全性：都是非线程安全的集合

**不同点：**

1. 数据结构：ArrayList底层是数组、LinkedList底层是链表（双向链表）
2. 特有方法：LinkedList具有特有的方法，列如：addFirst、addLast。（实现Deque接口）
3. 效率：ArrayList查询效率高O（1）、LinkedList添加o(1)、删除效率高->ArrayList添加元素趋近于O（1）\在不扩容情况下就是O(1)

**使用的选择:**

1. 如果删除和插入操作频繁,应该选择LinkedList类. 
2. 如果查询操作频繁,应该使用ArrayList类.

**ArrayList和数组有什么区别？**

1. 初始化大小：ArrayList可以不指定大小，数组必须制定大小
2. 存储数据类型：ArrayList只能存储引用类型，数组可以存储引用类型和基本类型