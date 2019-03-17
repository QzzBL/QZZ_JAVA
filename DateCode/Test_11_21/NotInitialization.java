/**
 * @ClassName NotInitialization
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/21 9:43
 * @Title 愿上苍有好生之德
 * @Description:
 **/

/**
 * 通过子类引用父类静态字段，不会导致子类初始化
 */
class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}
class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
}
public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
