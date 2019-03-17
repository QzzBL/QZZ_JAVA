/**
 * @ClassName TestExtends2
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/3 16:20
 * @Title 愿上苍有好生之德
 **/
class Animal2{
    private int n;
    Animal2(){
        System.out.println("Animal2无参构造器");
    }
    Animal2(int n){
        System.out.println("Animal2有参数构造器");
        this.n = n;
    }
/*
    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }*/
}
class Dog2 extends Animal2{
    private int n;

    Dog2(){
        super(600000);
        /*super.setN(600000);*/
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
/*
        Animal2 a2 = new Animal2();
        System.out.println(a2.getN());*/
    }
}
