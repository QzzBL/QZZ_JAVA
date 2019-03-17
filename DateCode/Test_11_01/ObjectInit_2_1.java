/**
 * @ClassName ObjectInit_2_1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/29 11:24
 * @Title 愿上苍有好生之德
 **/

//this 在无参数构造函数的用法
class Person5{
    private int age;
    private String name;
    private String sex;


    private static final int COUNT = 10;//方法区

    public Person5() {//不带参数的构造函数  构造函数可以被重载
        this("songjaing","man",999);//调用带有三个参数的构造函数
         //this("songjaing","man");
        System.out.println("Person()");

        //count++;
      /*  this.age = 10;//this:指向当前对象的内存
        this.sex = "man";
        this.name = "caocao";*/

    }
    public Person5(String name,String sex,int age) {
        System.out.println("Person(name,sex,age)");
        this.age = age;//this:指向当前对象的内存
        this.sex = sex;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person5{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}


public class ObjectInit_2_1 {
    public static void main(String[] args) {
        Person5 person5 = new Person5();
        System.out.println( person5 );
    }
}
