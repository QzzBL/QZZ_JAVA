package com_1.reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * @ClassName TestReflect
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/13 19:26
 * @Title 愿上苍有好生之德
 **/
class Student {
    public int age;
    public String sex;
    private String name;
    private Student(String name) {
        this.name = name;
    }
    public Student() {

    }
    public void fun1() {
        System.out.println("Student fun1()");
    }
    private void fun2() {
        System.out.println("Student fun2()");
    }
    public void setName() {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.通过getClass获取Class对象
        Student s1 = new Student();
        Class c1 = s1.getClass();
        System.out.println(c1);

        //2.类名.class
        //这说明任何一个类都有一个隐含的静态成员变量 class
        Class c2 = Student.class;
        System.out.println(c2);

        //3.通过Class对象的forName（）静态方法来获取，用的最多
        //但可能抛出ClassNotFountException异常 ***
        Class c3 = Class.forName("com_1.reflect.Student");
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);

        /**
         * 面试问题：
         * Class对象的个数？
         * 2、三个最重要的类型？
         *Field     Method     Constructor
         * newInstance;
         */

        //得到类名
        String classname = c2.getName();
        System.out.println(classname);
        System.out.println("==========================");


        //获取类的public属性
        Field[] fields = c2.getFields();
        for ( Field field : fields){
            System.out.println(field);
            System.out.println(field.getName());
        }
        System.out.println("==========================");

        //获取类的所有属性  包括私有属性
        Field[] fileds2 = c2.getDeclaredFields();
        for(Field field : fileds2){
            System.out.println(field);
            System.out.println(field.getName());
        }


        //获得类的所有方法
        Method[] methods = c2.getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(method);
        }
        System.out.println("==========================");

        //获取指定的属性public
        Field f1 = c2.getField("age");
        System.out.println(f1);
        System.out.println("==========================");

        //获取private私有属性
        Field f2 = c2.getDeclaredField("name");//抛出异常
        System.out.println(f2);
        System.out.println("==========================");

        //启用和禁用访问安全检查的开关，值为 true，
        //则表示反射的对象在使用时应该取消 java 语言的访问检查；反之不取消
        f2.setAccessible(true);
        System.out.println("================newInstance==============");

        Student p2 = (Student)(c2.newInstance());//抛出异常
        f2.set(p2,"qzz");
        System.out.println(f2.get(p2));

        System.out.println("==========无参数的私有构造函数===========");
        //得到对象的私有的构造函数
        Constructor cc1 = c2.getDeclaredConstructor();
        cc1.setAccessible(true);
        Student p1 = (Student)cc1.newInstance();
        System.out.println("无参数的私有构造函数\t" +p1);

        System.out.println("==========================");
        //得到带有一个参数的私有构造函数
        Constructor cc2 = c2.getDeclaredConstructor(String.class);
        cc2.setAccessible(true);
        //得到对应的一个实例 但是枚举不可以得到实例
        //面试题：为什么枚举不可以newInstance？通过反射，得到一个实例。
        Student p3=(Student)cc2.newInstance("qzz");
        System.out.println("有参数的构造函数\t"+p3.getName());
    }
}
