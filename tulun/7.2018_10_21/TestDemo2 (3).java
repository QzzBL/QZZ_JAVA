import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-21
 * Time: 20:13
 */
class TestArray2 {
    private int val;
    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return this.val;
    }
}

public class TestDemo2 {

    public static void main(String[] args) {
        TestArray2[][] testArray2 = new TestArray2[2][2];
        testArray2[0][0] = new TestArray2();
        testArray2[0][1] = new TestArray2();
        testArray2[1][0] = new TestArray2();
        testArray2[1][1] = new TestArray2();
        TestArray2[][] testArray3 = new TestArray2[2][2];
       // System.arraycopy();
        /*for (int i = 0; i < testArray2.length; i++) {
            testArray3[i] = Arrays.copyOf(testArray2[i],testArray2[i].length);
            //System.arraycopy(testArray2[i],0,testArray3[i],0,
                    //testArray2[i].length);
        }*/
        System.out.println(testArray3);
        System.out.println(testArray2);
        testArray3 = Arrays.copyOf(testArray2,testArray2.length);
        System.out.println(testArray3);
        System.out.println(testArray2);


        System.out.println("=============拷贝完成=========");
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[i].length; j++) {
                System.out.print(testArray2[i][j].getVal()+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < testArray3.length; i++) {
            for (int j = 0; j < testArray3[i].length; j++) {
                System.out.print(testArray3[i][j].getVal()+" ");
            }
        }
        System.out.println();

        testArray2[0][0].setVal(1000000);
        System.out.println("============修改完成=========");
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[i].length; j++) {
                System.out.print(testArray2[i][j].getVal()+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < testArray3.length; i++) {
            for (int j = 0; j < testArray3[i].length; j++) {
                System.out.print(testArray3[i][j].getVal()+" ");
            }
        }
        System.out.println();

    }


    public static void main4(String[] args) {
        TestArray2[][] testArray2 = new TestArray2[2][2];
        testArray2[0][0] = new TestArray2();
        testArray2[0][1] = new TestArray2();
        testArray2[1][0] = new TestArray2();
        testArray2[1][1] = new TestArray2();
        TestArray2[][] testArray3 = new TestArray2[2][2];
        //clone
        for (int i = 0; i <testArray2.length ; i++) {
            testArray3[i] = testArray2[i].clone();
        }
        System.out.println("=============拷贝完成=========");
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[i].length; j++) {
                System.out.print(testArray2[i][j].getVal()+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < testArray3.length; i++) {
            for (int j = 0; j < testArray3[i].length; j++) {
                System.out.print(testArray3[i][j].getVal()+" ");
            }
        }
        System.out.println();

        testArray2[0][0].setVal(1000000);
        System.out.println("============修改完成=========");
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[i].length; j++) {
                System.out.print(testArray2[i][j].getVal()+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < testArray3.length; i++) {
            for (int j = 0; j < testArray3[i].length; j++) {
                System.out.print(testArray3[i][j].getVal()+" ");
            }
        }
        System.out.println();

    }

    public static void main3(String[] args) {
        TestArray2[][] testArray2 = new TestArray2[2][2];
        testArray2[0][0] = new TestArray2();
        testArray2[0][1] = new TestArray2();
        testArray2[1][0] = new TestArray2();
        testArray2[1][1] = new TestArray2();
        TestArray2[][] testArray3 = new TestArray2[2][2];
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[i].length; j++) {
                testArray3[i][j] = testArray2[i][j];
            }
        }
        System.out.println("=============拷贝完成=========");
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[i].length; j++) {
                System.out.print(testArray2[i][j].getVal()+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < testArray3.length; i++) {
            for (int j = 0; j < testArray3[i].length; j++) {
                System.out.print(testArray3[i][j].getVal()+" ");
            }
        }
        System.out.println();

        testArray2[0][0].setVal(1000000);
        System.out.println("============修改完成=========");
        for (int i = 0; i < testArray2.length; i++) {
            for (int j = 0; j < testArray2[i].length; j++) {
                System.out.print(testArray2[i][j].getVal()+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < testArray3.length; i++) {
            for (int j = 0; j < testArray3[i].length; j++) {
                System.out.print(testArray3[i][j].getVal()+" ");
            }
        }
        System.out.println();
    }

    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] brray = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                brray[i][j] = array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(brray));
        brray[0][0] = 1000;
        System.out.println(Arrays.deepToString(array));
        System.out.println(Arrays.deepToString(brray));
        /*int[][] brray = array;
        System.out.println(Arrays.deepToString(brray));*/
    }

    /*//重载函数
    public static int sum(int a,int b) {//sum(int,int )
        return a+b;
    }
    public static int sum(int a,int b,int c) {//sum(int,int ,int)
        return a+b+c;
    }
    public static int sum(int... array) {//函数签名
    }*/
    public static void main1(String[] args) {
        int[][] array = new int[2][3];
        int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.deepToString(array));

        int[][] array3 = new int[2][];
        array3[0] = new int[4];
        array3[1] = new int[5];

        System.out.println(Arrays.deepToString(array3));


    }
}
