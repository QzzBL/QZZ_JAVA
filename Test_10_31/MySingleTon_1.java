/**
 * @ClassName MySingleTon_1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/31 14:42
 * @Title 愿上苍有好生之德
 **/

/**
 * 饿汉式
 *    1):必须在该类中,自己先创建出一个对象.
 *       2):私有化自身的构造器,防止外界通过构造器创建新的对象.
 *       3):想外暴露一个公共的静态方法用于获取自身的对象.
 */
//饿汉式
class MySingleTon__2{
    private static MySingleTon__2 singleTon__2 = new MySingleTon__2();
    private MySingleTon__2(){
        System.out.println(" MySingleTon__2.init");
    }
    public static MySingleTon__2 getInstance2(){
        return singleTon__2;
    }
}

/**
 * 懒汉式
 */
class MySingleTon__1 {
    private static  Object lock = new Object();

    private static MySingleTon__1 singleTon = null;

    private MySingleTon__1() {
        System.out.println("MySingleTon__1().init");
    }

    //提供一个全局的访问点
    //可重入函数===》线程安全的函数
    public static MySingleTon__1 getInstance() {
        //4.两次判断致使无法再进入生成对象那一块（singleTon = new MySingleTon__1();）
        //double-checked locking 双重检验
        if(singleTon == null) {
            synchronized (lock) {
                if(singleTon == null) {
                    singleTon = new MySingleTon__1();
                }
            }
        }

        //3、多个线程时，可能有部分为null时就进去（singleTon == null），在lock外面等待，陆续又执行生成同一个对象
        /*if(singleTon == null) {

            synchronized (lock) {
                singleTon = new MySingleTon__1();//至少执行2遍
            }
        }/*

        2、 对于多个线程是好，但是对于一个线程不方便，外部加锁浪费资源
         synchronized (lock) {
            if(singleTon == null) {
                singleTon = new MySingleTon__1();
            }
        }

        1、多个线程时，一部分不为null时，都进来了，创建对象，不安全
        if(singleTon == null) {
            singleTon = new MySingleTon__1();
        }*/
        return singleTon;
    }
}

public class MySingleTon_1 {
    public static void main(String[] args) {
        //MySingleTon__1 mySigleTon = new MySingleTon__1();
        MySingleTon__1 mySigleTon1 = MySingleTon__1.getInstance();
        MySingleTon__1 mySigleTon2 = MySingleTon__1.getInstance();
        MySingleTon__1 mySigleTon3 = MySingleTon__1.getInstance();
        System.out.println(mySigleTon1);
        System.out.println(mySigleTon2);
        System.out.println(mySigleTon3);
        System.out.println("======================================");
        MySingleTon__2 mySigleTon__1 = MySingleTon__2.getInstance2();
        MySingleTon__2 mySigleTon__2 = MySingleTon__2.getInstance2();
        MySingleTon__2 mySigleTon__3 = MySingleTon__2.getInstance2();
        System.out.println(mySigleTon__1);
        System.out.println(mySigleTon__2);
        System.out.println(mySigleTon__3);



    }

}
