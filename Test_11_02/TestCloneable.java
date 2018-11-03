/**
 * @ClassName TestCloneable
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/2 16:37
 * @Title 愿上苍有好生之德
 **/

//cloneable
class Money implements Cloneable{
    double money = 10.0;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person2 implements Cloneable{
    private String name;
    Money m;
    public Person2() {
        this.m = new Money();
    }

    //重写Object的克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person2 person2 = (Person2)super.clone();
        person2.m = (Money)this.m.clone();
        return person2;
    }
}

public class TestCloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person2 person2 = new Person2();
        Person2 person21 = (Person2)person2.clone();

        System.out.println(person2.m.money);
        System.out.println(person21.m.money);

        person2.m.money = 1000.0;

        System.out.println(person2.m.money);
        System.out.println(person21.m.money);


    }
}
