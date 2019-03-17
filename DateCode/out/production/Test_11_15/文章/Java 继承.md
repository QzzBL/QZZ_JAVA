## Java继承

**1、为什么使用继承**

从已有的类派生出新的类，称为继承。

在不同的类中也可能会有共同的特征和动作，可以把这些共同的特征和动作放在一个类中，让其它类共享。

因此可以定义一个通用类，然后将其扩展为其它多个特定类，这些特定类继承通用类中的特征和动作。

继承是 Java 中实现软件重用的重要手段，避免重复，易于维护，易于理解。

**2、父类和子类**

如果类 B 从类 A 派生，或者说类 B 扩展自类 A，或者说类 B 继承类 A，

则称类 A 为"父类"，也称为超类、基类；

称类 B 为"子类"，也称为次类、扩展类、派生类。

子类从它的父类中继承可访问的数据域和方法，也可以添加新的数据域和新的方法。

定义继承的语法：

```
修饰符 class 子类名 extends 父类名
```

```java
class Animal{
    private String name;
    private int id;
    public Animal(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void eat(){
        System.out.println(name + "正在吃");
    }
    public void sleep(){
        System.out.println(name + "正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是" + id + "号" + name + ".");
    }
}

//企鹅类
class Penguin extends Animal{
    public Penguin(String name, int id){
        super(name, id);
    }
}
class Mouse extends Animal {
    public Mouse(String name, int id){
        super(name, id);
    }
}
public class TestExtends {
    public static void main(String[] args) {
        Animal a = new Animal("动物",123456);
        Animal b = new Penguin("企鹅",01);
        a.eat();
        b.eat();
    }
}
//输出：
/*
动物正在吃
企鹅正在吃

Process finished with exit code 0

*/
```

这个Animal类就可以作为一个父类，然后企鹅类和老鼠类继承这个类之后，就具有父类当中的属性和方法，子类就不会存在重复的代码，维护性也提高，代码也更加简洁，提高代码的复用性（复用性主要是可以多次使用，不用再多次写同样的代码） 继承之后的代码： 

### super 与 this 关键字

super 表示使用它的类的父类。super 可用于：

- 调用父类的构造方法；
- 调用父类的方法（子类覆盖了父类的方法时）；
- 访问父类的数据域（可以这样用但没有必要这样用）

this 关键字表示当前对象。可用于：

- 调用当前类的构造方法。如：this(); 调用默认构造方法。this(参数); 调用带参构造方法。
- 限定当前对象的数据域变量。一般用于方法内的局部变量与对象的数据域变量同名的情况。如 this.num = num。this.num 表示当前对象的数据域变量 num，而 num 表示方法中的局部变量。

```java
class Animal1{
    void eat(){
        System.out.println("animal : eat");
    }
}
class Dog extends Animal1{

    void eat(){
        System.out.println("dog : eat");
    }
    void eatTest(){
        this.eat();   //this 调用自己的方法
        super.eat(); //super 调用父类的方法
    }
}
public class TestEctends1 {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}

//输出结果：
/*
animal : eat
dog : eat
animal : eat

Process finished with exit code 0
*/
```

### implements关键字

使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口（接口跟接口之间采用逗号分隔）。

```java
public interface A {
    public void eat();
    public void sleep();
}
 
public interface B {
    public void show();
}
 
public class C implements A,B {
}
```



## final关键字

final 关键字声明类可以把类定义为不能继承的，即最终类；或者用于修饰方法，该方法不能被子类重写：

- 声明类：

  ```
  final class 类名 {//类体}
  ```

- 声明方法：

  ```
  修饰符(public/private/default/protected) final 返回值类型 方法名(){//方法体}
  ```

**注**:实例变量也可以被定义为 final，被定义为 final 的变量不能被修改。被声明为 final 类的方法自动地声明为 final，但是实例变量并不是 final

## 构造器

子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。

如果父类构造器没有参数，则在子类的构造器中不需要使用 super 关键字调用父类构造器，系统会自动调用父类的无参构造器。

```java
class Animal2{
    private int n;
    Animal2(){
        System.out.println("Animal2无参构造器");
    }
    Animal2(int n){
        System.out.println("Animal2有参数构造器");
        this.n = n;
    }
}
class Dog2 extends Animal2{
    private int n;

    Dog2(){
        super(600000);
        System.out.println("Dog无参构造器");
    }
    Dog2(int n){//调用的Animal2的无参构造器
        System.out.println("Dog的有参数构造器" + n);
        this.n = n;
    }
}
public class TestExtends2 {
    public static void main(String[] args) {
        Dog2 d2 = new Dog2();
        Dog2 d3 = new Dog2(900000);
    }
}
//输出结果：
/*
Animal2有参数构造器
Dog无参构造器
Animal2无参构造器
Dog的有参数构造器900000

Process finished with exit code 0

*/
```

                                                 2018.11.03/周六
                                                 by 922