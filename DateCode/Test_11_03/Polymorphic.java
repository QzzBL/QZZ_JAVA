/**
 * @ClassName Polymorphic
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/3 18:18
 * @Title 愿上苍有好生之德
 **//*
1.首先，创造动物类：

        复制代码*/
// 动物类
class Animal4 {
    private int age;
    private String name;


    // 动物类里面有叫和吃两个方法
    public void cry() {
        System.out.println("我不知道叫什么");
    }

    public void eat() {
        System.out.println("我不知道吃什么");
    }
}
/*复制代码
        2.其次，分别创造猫类和狗类（他们继承于动物类）：

        复制代码*/
// 狗类继承于动物类
class Dog4 extends Animal4 {
    // 覆盖（重写）方法
    public void cry() {
        System.out.println("旺旺");
    }

    public void eat() {
        System.out.println("我是狗，我爱吃骨头");
    }
}

// 猫类继承于动物类
class Cat extends Animal4 {
    // 覆盖（重写）方法
    public void cry() {
        System.out.println("喵喵");
    }

    public void eat() {
        System.out.println("我是猫，我爱吃鱼");
    }
}
/*复制代码
        3.再者，创建食物类：

        复制代码*/
// 食物类
class Food {

    String name;

    // 食物类里面让它有一个方法
    public void showName() {

    }
}
/*复制代码
        4.再者，猫和狗都有自己不同的爱吃的食物（他们继承于食物类）：

        复制代码*/
// 鱼（食物的一种）继承于食物
class Fish extends Food {
    public void showName() {
        System.out.println("食物：鱼");
    }
}

// 骨头（食物的一种）继承于食物
class Bone extends Food {
    public void showName() {
        System.out.println("食物：骨头");
    }
}
/*复制代码
        5.主人类（就可以将动物和对应的食物统一起来）：

        复制代码*/
// 主人类 存在一種餵食方法
class Master {
    // 给动物喂食物，如果没有多态，他要写给猫喂食和给狗喂食两个方法
    // 有了多态，以后即使再来好多动物，用这一个函数就可以了
    public void feed(Animal4 an, Food f) {
        an.eat();
        f.showName();

    }
}
/*复制代码
        6.最后，方法的调用（测试）：

        复制代码*/
public class Polymorphic {

    public static void main(String args[]) {

        Master master = new Master();
        Animal4 dog = new Dog4();
        Animal4 cat = new Cat();

        Food bone =  new Bone();
        Food fish =  new Fish();

        master.feed(dog, bone);
        master.feed(cat, fish);

    }
}
