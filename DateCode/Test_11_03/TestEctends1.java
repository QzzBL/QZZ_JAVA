/**
 * @ClassName TestEctends1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/3 15:44
 * @Title 愿上苍有好生之德
 **/
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
        d.eat();
        d.eatTest();
    }
}
