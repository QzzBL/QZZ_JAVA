/**
 * @ClassName TestExtends
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/3 12:08
 * @Title 愿上苍有好生之德
 **/
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
