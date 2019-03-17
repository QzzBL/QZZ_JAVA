/**
 * @ClassName TestArray
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 16:57
 * @Title 愿上苍有好生之德
 **/
/**
 * for ; clone() ; System.arraycopy() ;  Arrays.copyOf  四中拷贝方式对对象引用的拷贝   浅拷贝
 */

import java.util.*;
public class TestArray {
    private int val = 10;

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return this.val;
    }

    public static void print(TestArray[] t1, TestArray[] t2) {
        for (int i = 0; i < t1.length; i++) {
            t2[i] = t1[i];//赋值的是引用，最后t1[i] t2[i] 都指向的是引用的地址，一个变都变，浅拷贝
        }
        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i].getVal() + " ");
        }
        System.out.println();
        for (int i = 0; i < t2.length; i++) {
            System.out.print(t2[i].getVal() + " ");
        }
        System.out.println();
        System.out.println();
    }
   /* public static void main(String[] args) {
        TestArray[] t1 = new TestArray[4];//TestArray 已经是引用类型
        t1[0] = new TestArray();// t1[0] 链接的是对象的引用
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = new TestArray[4];//t2[0]
        print(t1, t2);
        t2[0].setVal(100000);
        print(t1, t2);*/
        /*
        10 10 10 10
10 10 10 10
===============
100000 10 10 10
100000 10 10 10

    }*/


    /*public static void main(String[] args) {
        TestArray[] t1 = new TestArray[4];
        t1[0] = new TestArray();
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = t1.clone();//t2[0]
        print(t1, t2);
        t2[0].setVal(99999);
        print(t1, t2);*/
        /*
        10 10 10 10
10 10 10 10
===============
100000 10 10 10
100000 10 10 10
         */
 /*public static void main(String[] args) {
    TestArray[] t1 = new TestArray[4];
    t1[0] = new TestArray();
    t1[1] = new TestArray();
    t1[2] = new TestArray();
    t1[3] = new TestArray();
    TestArray[] t2 = new TestArray[4];//t2[0]
    System.arraycopy(t1,0,t2,0,t1.length);
    print(t1, t2);
    t2[0].setVal(88888);
    print(t1, t2);*/


    /*
    10 10 10 10
10 10 10 10
===============
100000 10 10 10
100000 10 10 10     深拷贝
     */

    public static void main(String[] args) {
        TestArray[] t1 = new TestArray[4];
        t1[0] = new TestArray();
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = Arrays.copyOf(t1,t1.length);
         print(t1, t2);
         t2[0].setVal(666666);
         print(t1, t2);
        /*
        10 10 10 10
10 10 10 10
===============
100000 10 10 10
100000 10 10 10    浅拷贝
         */
    }
}

