/**
 * @ClassName Override
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/3 16:59
 * @Title 愿上苍有好生之德
 **/
class Animal3{
    public void move() {
       System.out.println("动物可以移动");
    }
}
class Dog3 extends Animal3{
    public void move() {
        System.out.println("狗可以跑和走");
    }
}
public class Override {
    public static void main(String[] args) {
        Animal3 a3 = new Animal3();
        Animal3 b3 = new Dog3();

        a3.move();// 执行 Animal 类的方法
        b3.move();//执行 Dog 类的方法
    }
}
