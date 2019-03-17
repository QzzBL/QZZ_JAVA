/**
 * @ClassName ObjectInit_2
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/29 9:49
 * @Title 愿上苍有好生之德
 **/
/**
 * 对象的初始化方法
 * 1.提供 get set 方法
 * 2.通过合适的构造函数进行初始化（系统本身会自动生成无参数的构造函数）
 * 3.静态块初始化（类名去调用）
 * 4.和实例块初始化
 */
//2.通过合适的构造函数进行初始化
// （系统本身会自动生成无参数的构造函数）
/*    2.1（对象的创建要分为哪几部）

            a.为对象创个内存

            b.调用合适的构造函数*/
//定义类Person1   自己不添加任何无参或有参数构造方法
class Person1{
    private int age;
    private String name;
    private String sex;

}
//定义类Person2   自己添加无参的构造方法
class Person2{
    private int age;
    private String name;
    private String sex;

    public Person2(){
        System.out.println("无参构造方法被调用");
    }
}

//定义类Person3   有参数的构造方法
class Person3{
    private int age;
    private String name;
    private String sex;

    public Person3(String name, String sex, int age ){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
//定义类Person4   自己添加无参的构造方法,和有参数的构造方法
class Person4{
    private int age;
    private String name;
    private String sex;


    //不带参数的构造函数，可以被重载
    public Person4(){
        System.out.println("无参构造方法被调用");
    }

    //带参数对的构造函数
    public Person4(String name, String sex, int age ){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public int getAge(){
        return age;
    }

}


public class ObjectInit_2 {
    public static void main(String[] args) {
        //Person1 person1 = new Person1();//编译通过；①实例化Person对象    ②自动调用构造方法Person( )

        //Person2 person2 = new Person2();//编译通过；打印: 无参构造方法被调用


        // 这样写，编译器会报错，原因是无参构造方法被有参构造方法覆盖，编译器不能提供无参构造方法
        //Person3 person3 = new Person3();

        //Person4 person4 = new Person4();//编译通过；打印: 无参构造方法被调用

        /*Person4 person4 = new Person4("qzz", "man", 18);
        System.out.println(person4.getAge());
        System.out.println(person4.getName());
        System.out.println(person4.getSex());*/

    }
}

