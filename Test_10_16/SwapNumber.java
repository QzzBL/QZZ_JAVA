/**
 * @ClassName SwapNumber
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/15 23:29
 * @Title 愿上苍有好生之德
 **/

/**
 * 3.交换两个数的几种方法
 */
public class SwapNumber {
    //方法一：引入一个量交换
    public static void swap1(int a1, int b1){
        int temp;
        temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("a1" + " = " + a1 + "; " + "b1" + " = " + b1 + '\n');
    }
    //方法二：简单的加减运算，可能会溢出
    public static void swap2(int a2, int b2){
        a2 = a2 + b2;//30
        b2 = a2 - b2;//10
        a2 = a2 - b2;
        System.out.println("a2" + " = " + a2 + "; " + "b2" + " = " + b2 + '\n');
    }
    //异或，相同为0，不同为1，二进制的运算
    /*
             10的二进制: 01010 //a3
             20的二进制: 10100 //b3
      异或得：30       ：11110 //  a3 = a3 ^ b3//30
                         此时相当于30分别与20异或得到：10//b3 = a3 ^ b3
                                   30   与10异或得到：20//a3 = a3 ^ b3
     */
    public static void swap3(int a3, int b3){
        a3 = a3^b3;//30
        b3 = a3^b3;//10
        a3 = a3^b3;//20
        System.out.println("a3" + " = " + a3 + "; " + "b3" + " = " + b3);
    }
    public static void main(String[] args) {
        swap1(10, 20);
        swap2(10, 20);
        swap3(10, 20);
    }
}

/*
a1 = 20;b1 = 10

a2 = 20;b2 = 10

a3 = 20;b3 = 10

Process finished with exit code 0
 */