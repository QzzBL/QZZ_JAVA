## Java基础数据结构--线性表

---

[TOC]

### 线性表

> 线性表是最基本、最简单、也是最常用的一种数据结构。
>
> 线性表中[数据元素](https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=54652569&ss_c=ssc.citiao.link)之间的关系是一对一的关系，即除了第一个和最后一个数据元素之外，其它数据元素都是首尾相接的（注意，这句话只适用大部分线性表，而不是全部。比如，[循环链表](https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=111800&ss_c=ssc.citiao.link)逻辑层次上也是一种线性表（存储层次上属于链式存储），但是把最后一个数据元素的尾指针指向了首位结点）。
>
> 我们说“线性”和“非线性”，只在逻辑层次上讨论，而不考虑存储层次，所以[双向链表](https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=111788&ss_c=ssc.citiao.link)和循环链表依旧是线性表。
>
> 在数据结构逻辑层次上细分，线性表可分为**一般线性表**和**受限线性表**。一般线性表也就是我们通常所说的“线性表”，可以自由的删除或添加结点。受限线性表主要包括栈和队列，受限表示对结点的操作受限制。
>
> 线性表的逻辑结构简单，便于实现和操作。因此，线性表这种数据结构在实际应用中是广泛采用的一种数据结构。



### 1、定义

* 线性表 *（linear list）*是数据结构的一种，一个线性表是n个具有相同特性的[数据元素](https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=54652569&ss_c=ssc.citiao.link)的有限序列。数据元素是一个抽象的符号，其具体含义在不同的情况下一般不同。 

  

* 注：线性表的相邻元素之间存在着序偶关系。如用（a 1，…，a i-1，a i，a i+1，…，a n）表示一个[顺序表](https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=7855080&ss_c=ssc.citiao.link)，则表中a i-1领先于a i ，a i领先于a i+1，称a i-1是a i的直接前驱元素，a i+1是a i的直接后继元素。当i=1,2，…，n-1时，a i有且仅有一个直接后继，当i=2，3，…，n时，a i有且仅有一个直接前驱 。 

---



### 2、存储结构

线性表主要由顺序表示或链式表示。在实际应用中，常以 栈、 队列、 字符串等特殊形式使用。

顺序表示指的是用一组地址连续的存储单元依次存储线性表的[数据元素](https://baike.sogou.com/lemma/ShowInnerLink.htm?lemmaId=54652569&ss_c=ssc.citiao.link)，称为线性表的顺序存储结构或顺序映像 *（sequential mapping）*。它以“物理位置相邻”来表示线性表中数据元素间的逻辑关系，可随机存取表中任一元素。

链式表示指的是用一组任意的存储单元存储线性表中的数据元素，称为线性表的链式存储结构。它的存储单元可以是连续的，也可以是不连续的。在表示数据元素之间的逻辑关系时，除了存储其本身的信息之外，还需存储一个指示其直接后继的信息 *（即直接后继的存储位置）*，这两部分信息组成数据元素的存储映像，称为结点*（node）*。它包括两个域；存储数据元素信息的域称为数据域；存储直接后继存储位置的域称为指针域。指针域中存储的信息称为指针或链 。

![img](https://images2015.cnblogs.com/blog/941605/201605/941605-20160511073803359-1877224674.png) 

##### 1、顺序存储

* 顺序表的定义：线性表的顺序存储结构是一组连续的内存单元依次存放的线性表的数据元素，* 元素的物理地址和逻辑地址次序是相同的。我们叫做这种存储方式为顺序表
* 顺序表，使用数组实现，一组地址连续的存储单元，数组大小有两种方式指定，一是静态分配，二是动态扩展。
* 注：线性表从1开始，而数组从0开始。
  * 优点：随机访问特性，查找O(1)时间，存储密度高；逻辑上相邻的元素，物理上也相邻；
  * 缺点：插入删除需移动大量元素。
  * 顺序表相关的操作跟数组有关，一般都是移动数组元素。



##### 2、链式存储

* 链表的定义是递归的，它或者为空null，或者指向另一个节点node的引用，这个节点含有下一个节点或链表的引用。
* 与顺序存储相比，允许存储空间不连续，插入删除时不需要移动大量的元素，只需修改指针即可，但查找某个元素，只能从头遍历整个链表。
* Java中使用嵌套类来定义节点的抽象数据类型：

```java
public class TestLink {
    class Node {
        int data;
        Node next;

        public Node() {
            this.data = data;
            this.next = null;
        }

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    private Node head;

    public TestLink() {
        this.head = new Node();
    }

```



##### 3、栈、队列也是一种线性表

```java
栈（Stack）是限定只能在表的一端进行插入和删除操作的线性表。 

队列（Queue）是限定只能在表的一端进行插入和在另一端进行删除操作的线性表。 

从"数据结构"的角度看，它们都是线性结构，即数据元素之间的关系相同。但它们是完全不同的数据类型。除了它们各自的基本操作集不同外，主要区别是对插入和删除操作的"限定"。 


栈和队列是在程序设计中被广泛使用的两种线性数据结构，它们的特点在于基本操作的特殊性，栈必须按"后进先出"的
规则进行操作，而队列必须按"先进先出"的规则进行操作。和线性表相比，它们的插入和删除操作受更多的约束和限定，故又称为限定性的线性表结构。可将线性表和栈及队列的插入和删除操作对比如下： 

线性表 
Insert(L,i,x) 
(1≤i≤n+1) 
Delete(L,i) 
(1≤i≤n) 
如线性表允许在表内任一位置进行插入和删除 

栈 
Insert(L,n+1,x) 
Delete(L,n) 
而栈只允许在表尾一端进行插入和删除 

队列 
Insert(L,n+1,x) 
Delete(L,1) 
队列只允许在表尾一端进行插入，在表头一端进行删除
```

---



### 3、顺序表代码实现

```java
//顺序表的实现
class TestSqlist {
    private int[] elem;//存放数据的数组
    private int usedsize;//有效数据个数

    public TestSqlist() {
        this(10);
    }//给初始值

    public TestSqlist(int size) {
        this.elem = new int[size];
    }
    //开始一系列 增删，查改操作

    /**
     * 思想
     * 1.判断如果满了怎么办 this.usedsize == this.elem.length
     * 2.如果为空怎么办
     * 3.增：因为一开始没有数据，所以先增加
     */

    //1.判断如果满了怎么办
    public boolean isFull() {
        if (this.usedsize == this.elem.length) {
            return true;
        }
        return false;
    }
    //2.如果为空怎么办
    public boolean isEmpty() {
        if (this.usedsize == 0) {
            return true;
        }
        return false;
    }
    //3.插入元素
    public boolean insear(int pos, int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }
        //不为空: pos 可能 < 0 , 可能 pos > this.usedsize
        if(pos < 0 || pos > this.usedsize){
            return false;
        }else{
            for(int i = usedsize - 1; i >= pos ; i--){
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = val;
            this.usedsize++;
        }
        return true;
    }
    //4.查找关键字key下标
    public int search(int key) {
        if(isEmpty()){
            return -1;
        }else{
            for (int i = 0; i < this.usedsize; i++) {
                if(this.elem[i] == key){
                    return i;
                }
            }
        }
        throw new UnsupportedOperationException("不合法数据");
    }
    //5..删除
    public boolean delete(int key) {
        //查找是否有关键字key  index 下标--》  找下标的方法 search（）
        int index = search(key);
        //如果有:开始删除 从找到的数组下标开始
        if(index < 0){
            return false;
        }
        for(int i = index; i < this.usedsize - 1; i++){
            this.elem[i] = this.elem[i + 1];
        }
        usedsize--;
        return true;
    }
    //6.得到pos位置的值 牵扯到 下标 在数组中，就要判断是否小于最小下标或者，大于最大
    public int getPos(int pos) {
        if(pos < 0 || pos > this.usedsize || isEmpty()){
            //return - 1; 可能数组中有- 1
            throw new UnsupportedOperationException("pos的位置不合法异常");
        }
        return this.elem[pos];
    }
    //7.打印
    public void show() {
        for (int i = 0; i < this.usedsize; i++){
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
}
public class SequenceListDemo {
    public static void main(String[] args) {
            TestSqlist testSqlist = new TestSqlist();
            for (int i = 0; i < 10; i++){
                testSqlist.insear(i, i);
            }
            testSqlist.show();
            testSqlist.insear(10,2);
            testSqlist.insear(3,5);
            testSqlist.show();
            System.out.println("---------------------");
            System.out.println(testSqlist.search(6));
            System.out.println("---------------------");
            testSqlist.delete(4);
            testSqlist.show();
            System.out.println("---------------------");
            System.out.println(testSqlist.getPos(6));
            System.out.println("---------------------");
            System.out.println(testSqlist.getPos(-1));
            System.out.println("---------------------");
            System.out.println(testSqlist.search(-3));
    }
}
```



**相关链接：**

https://baike.sogou.com/v105830.htm?fromTitle=线性表

http://www.cnblogs.com/wincai/p/5893475.html

https://wenwen.sogou.com/z/q658164040.htm



                             2018.12.08/周六
                             by 922