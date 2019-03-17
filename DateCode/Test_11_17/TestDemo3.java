import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum TestDemo3 {
    RED("red",1),GREEN("green",2),WHITE("white",3),BLACK("black",4),
    BROWN("brown",5);
    private  String name;
    private  int key;
    private TestDemo3(String name, int key) {
        this.name = name;
        this.key = key;
    }
    private TestDemo3() {

    }

    public static TestDemo3 getKey(int key) {//5
        for (TestDemo3 color : TestDemo3.values() ) {
            if(color.key == key) {
                return  color;
            }
        }
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(getKey(3).toString());//WHITE

        Class colorEnum = TestDemo3.class;// 拿到class TestDemo3 的信息
        Constructor[] constructors = colorEnum.getDeclaredConstructors();

        //1.打印TestDemo3中的构造器（Enum 默认私有构造器）
      /*  for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
            //private TestDemo3(java.lang.String,int)
            //private TestDemo3(java.lang.String,int,java.lang.String,int)
        }*/
      /*  Constructor constructor = colorEnum.getDeclaredConstructor(
                String.class, int.class,String.class, int.class);
        constructor.setAccessible(true);
        TestDemo3 p=(TestDemo3)constructor.newInstance("green","绿色");//
        System.out.println("有参数的构造函数\t"+p);

        System.out.println("==================================================");*/

        Constructor constructor1 = colorEnum.getDeclaredConstructor(
                String.class, int.class);
        constructor1.setAccessible(true);
        TestDemo3 p1=(TestDemo3)constructor1.newInstance();//
        System.out.println("无参数的构造函数\t"+p1);
    }
}
