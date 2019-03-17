### 用命令行中编写第一个HelloWorld

---

[TOC]


##### 步骤1：先看运行效果

---

![1](D:\存储工具\Typora 图片\命令行写HelloWorld\1.png)



##### 步骤2：准备项目目录

---

* 通常我们会在某个磁盘中创建一个project目录

+ 此例子中我们用D：/project目录作为项目目录

+ 并在protect中创建一个目录src用于存放java源代码**（.java）**文件

+ D:/project/src

  

##### 步骤3：创建一个java源文件

---

在src目录中用记事本编写

![3](D:\存储工具\Typora 图片\命令行写HelloWorld\3.png)

```java
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("hello world");
    }
}
```

- 注释：因为java是**面向对象**的编程语言，所以我们实际上是在创建一个个类

- class HelloWorld表示这个类的名字是HelloWorld

- public static void main(String[] args)这是主方法，所有代码的入口，相当于c语言中的main程序入口

- System.out.println("hello world");表示在控制台输出一个字符串 hello world

  


##### 步骤4：显示扩展名

---

系统有时会默认把扩展名隐藏，为了把 .txt 修改为 .java ；打开我的电脑 -> F10显示菜单栏 ->工具->文件夹选项->查看->去掉隐藏已知文件类型的扩展名上的勾选


![6](D:\存储工具\Typora 图片\命令行写HelloWorld\6.png)



##### 步骤5：编译

---

* .java文件是java的源文件，但是不能直接运行，必须先编译成为 .class文件才能够执行

- java使用 javac 进行编译

  ```java
  javac filename.java   //javac HelloWorld.java
  ```

  - 注释：要跟上 .java 后缀名

  - 运行 win + r，输入 cmd 进入控制台界面

  - D：切换盘符为D

  - cd D：\project\src 切换目录到源文件目录

  - javac HelloWorld.java 编译命令 与文件名一致（文件名 HelloWorld）

  - 如果javac HelloWorld.java 后得到空白，表示成功，并且得到一个class文件：HelloWorld.class

​           ![4](D:\存储工具\Typora 图片\命令行写HelloWorld\4.png)




##### 步骤6：运行

---

```java
java classname   // java HelloWorld
```

* 大小写一致，没有后缀名 .class

* 运行成功后看到字符串 hello world

![5](D:\存储工具\Typora 图片\命令行写HelloWorld\5.png)


                                                                 2018-10.1/周一
                                                                 by 922
