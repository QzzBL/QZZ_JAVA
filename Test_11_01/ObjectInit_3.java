/**
 * @ClassName ObjectInit_3
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/29 13:17
 * @Title 愿上苍有好生之德
 **/

/**
 * 3.静态块初始化
 * （类名去调用）
 *
 * static 所修饰的方法或者数据成员不依赖于对象
 *
 * static{
 *
 * }
 *
 * 和实例块初始化
 *
 * {
 * this.naem = "ddd"
 * this.sex = "men"
 * }
 */
//对象的初始化顺序？？？
//
//
//先静态块初始化（当类里面有 实例成员 和 实例代码块时，同等级别的执行顺序按照他们的顺序来执行）
//
//然后实例代码块初始化
//
//再然后构造函数初始化
class Person6 {
    private int age;//数据
    private String name;
    private String sex;
    private  static  int count; //???????

    {
        this.name = "gaobo";
        this.sex = "superman";
        this.age = 18;
        System.out.println("instance {} init");//实例块初始化
    }

    public Person6() {
        System.out.println("Person().constrcutor");
    }

    static {//static所修饰的方法或者数据成员不依赖于对象
        count = 10;
        //this.name = "gaobo";
        System.out.println("static {} init");
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class ObjectInit_3 {
    public static void main(String[] args) {
        Person6 person6 = new Person6();
        System.out.println(person6);
        System.out.println("----------------------");
        Person6 person7 = new Person6(); //   这几句代码验证了*不管多少个对象，静态代码块只初始化一次 static代码块只出现一次
    }

}
