/**
 * @ClassName TEST
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/4 12:36
 * @Title 愿上苍有好生之德
 **/
interface animal{
    public void eat();
}
abstract class animal1 implements animal{

}
class dog extends animal1{
    public void eat(){
        System.out.println("ss");
    }
}
interface A{

}
interface B{

}
interface C extends A,B{

}
public class TEST {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
    }
}
