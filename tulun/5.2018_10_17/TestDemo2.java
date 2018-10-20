import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:一维数组for循环的拷贝
 * User: GAOBO
 * Date: 2018-10-17
 * Time: 20:06
 */

/**
 * 作业：
 * 1、{1,2,3,4,5,6}
 * 将奇数放在偶数前面     大小顺序不要求
 * 2、一个数组是有序的，给定一个key:数字   有两个数字的和加起来等于key
 * 找到这两个数字的下标
 * {1,2,3,4,5,6}       7
 *3、题目：=一个整形数组，除了两个数字只出现一次外，
 *  其他数字都是两次。{1,3,1,2,3,4}    找到这两个数字
 *
 * 4、熟悉Arrays这个类里面的方法：
 * 2.2：如何排序数组并插入某个元素？
 * 2.5：如何搜索数组中的最小值和最大元素？
 * 如何合并两个数组（合并到一个新的数组）？
 * 如何填充数组（一次填充，部分填充）？
 * 2.10：如何删除数组指定元素？
 * 2.11： 如何从数组中查找常见的元素？
 */

class TestArray {
    private int val = 10;
    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return this.val;
    }
}
//clone:clone是否会产生新的对象？？？  Object
//简单类型来说他是深拷贝
//总的来说他就是浅拷贝

/**
 * 不会产生新的对象
 *
 * native：C/C++代码实现
 *
 *    public static native void arraycopy(Object src,  int  srcPos,
 *                                         Object dest, int destPos,
 *                                         int length);
 * src ：源地址   srcPos:源地址开始位置
 * dest：目的地   destPos：目的地的开始位置
 * length：拷贝的长度
 *
 * arraycopy？？？？？？  浅拷贝
 */

/**
 *Arrays.copyOf();     T[]
 *浅拷贝
 */
//匿名数组
public class TestDemo2 {

    public static int sum(int a,int b) {
        return a+b;
    }

    public static int sum2(int a,int b,int c){
        return a+b+c;
    }

    //可变参数编程:数组

    public static int sum3(int... array) {
        int sum = 0;
        for(int i : array) {
            sum += i;
        }
        return sum;
    }
    public static int sum4(int[]  array) {
        int sum = 0;
        for(int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        sum3(1,2,3,4,5);
        sum3(1,2);
        sum3(array);

        sum3(new int[]{1,2,3,4});

        sum4(array);



        sum2(1,2,3);
        //new[4]{1,2,3,4,5};
        //new int[5]{1,2,3,4,5};
        //new int[]{1,2,3,45};
    }

    public static void main10(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] brray =Arrays.copyOfRange(array,2,4);//[2,3)
        System.out.println(Arrays.toString(brray));

       // boolean flg = Arrays.equals(array,brray);

       // System.out.println(flg);



    }

    public static void main9(String[] args) {
        TestArray[] t1 = new TestArray[4];
        t1[0] = new TestArray();
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = Arrays.copyOf(t1,t1.length);

        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }
        System.out.println();
        t2[0].setVal(100000);
        System.out.println("===============");

        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }

    }

    public static void main8(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = Arrays.copyOf(array,array.length);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }

    public static void main7(String[] args) {
        TestArray[] t1 = new TestArray[4];
        t1[0] = new TestArray();
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = new TestArray[4];//t2[0]

        System.arraycopy(t1,0,t2,0,t1.length);

        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }
        System.out.println();
        t2[0].setVal(100000);
        System.out.println("===============");

        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }

    }

    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = new int[array.length];
        System.arraycopy(array,0,brray,0,array
        .length);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));

    }

    public static void main5(String[] args) {
        TestArray[] t1 = new TestArray[4];
        t1[0] = new TestArray();
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = t1.clone();//t2[0]
        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }
        System.out.println();
        t2[0].setVal(100000);
        System.out.println("===============");

        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }

    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = array.clone();

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));

    }

    public static void main3(String[] args) {
        TestArray[] t1 = new TestArray[4];
        t1[0] = new TestArray();
        t1[1] = new TestArray();
        t1[2] = new TestArray();
        t1[3] = new TestArray();
        TestArray[] t2 = new TestArray[4];//t2[0]
        for(int i = 0;i < t1.length;i++) {
            t2[i] = t1[i];
        }
        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }
        System.out.println();
        t2[0].setVal(100000);
        System.out.println("===============");

        for(int i = 0;i < t1.length;i++) {
            System.out.print(t1[i].getVal()+" ");
        }
        System.out.println();
        for(int i = 0;i < t2.length;i++) {
            System.out.print(t2[i].getVal()+" ");
        }
    }

    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = new int[array.length];
        for(int i = 0;i < array.length;i++) {
            brray[i] = array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }

}
