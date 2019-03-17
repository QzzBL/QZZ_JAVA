/**
 * @ClassName Abstract
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/1 18:03
 * @Title 愿上苍有好生之德
 **/
abstract class Animal{
    public abstract void bark();//抽象方法没有方法体，子类中需要覆盖实现具体功能
    public void fun(){
        System.out.println("abstract Animal fun()");
    }
}
/*1.
class Dog extends Animal{//没有用abstract时，必须覆盖掉抽象父类中的方法
    public Dog() {
        System.out.println("Dog() init");
    }
        public void bark(){
            System.out.println("wang wang ");
    }
}*/
abstract class Dog extends Animal {//没有用abstract时，必须覆盖掉抽象父类中的方法

    public Dog() {
        System.out.println("Dog() init");
    }
}

interface A{
    public static final int AGE = 10;
    public abstract void fun();
}
interface B{
    int AGE = 100;
    void fun2();
}
interface D extends A,B{
    void fun3();
}
abstract class PerSon{

}
class C extends PerSon implements D{

    @Override
    public void fun() {
        System.out.println("A.FUN");
    }

    @Override
    public void fun2() {
        System.out.println("B.FUN");
    }

    @Override
    public void fun3() {

    }
}



abstract class Door{
    public abstract void open();
    public abstract void close();
}
interface Alarm{
    void alarm();
}
class AlarmDoor extends Door implements Alarm{

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void alarm() {

    }
}
public class Abstract {
    public static void main(String[] args) {
        C c = new C();
     //   c.fun();
     //   c.fun2();
        A a = c;
        a.fun();
        B b = c;
        b.fun2();
    }
}
