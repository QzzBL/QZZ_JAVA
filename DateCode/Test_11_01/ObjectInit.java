/**
 * @ClassName ObjectInit
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/29 9:35
 * @Title 愿上苍有好生之德
 **/

/**
 * 对象的初始化方法
 * 1.提供 get set 方法
 * 2.通过合适的构造函数进行初始化（系统本身会自动生成无参数的构造函数）
 * 3.静态块初始化（类名去调用）
 * 4.和实例块初始化
 */
//1.提供 get set 方法
class Person{
    private int age;
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

/*    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }*/
}


public class ObjectInit {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("qzz");
        person.setSex("man");
        // System.out.println(person);没有生成toString打印的是地址
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.getSex());
    }
}
