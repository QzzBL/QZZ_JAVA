/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-26
 * Time: 20:55
 */
//1、斐波那契额数列写成递归   分析：循环   递归   那个更好？？
    //2、二分查找写成递归的
    //3、总结递归的优点  缺点
public class TestDemo2 {

    public static int peopleAge(int n) {
        int age = 18;
        for(int i = 2;i <= n;i++) {//迭代
            age += 2;
        }
        return age;
    }

    //递归：1、趋近于某个临界值     2、循环调用自己本身

    /**
     * 优点：代码解答  代码量少
     * 缺点：不容易理解
     * 栈如果溢出：异常信息是什么？
     * @param n
     * @return
     */
    public static int peopleAge2(int n) {//5
        int tmp = 0;
        /*tmp = peopleAge2(n-1)+2;
        return tmp;*/
        if(n == 1) {
            tmp = 18;
            return tmp;
        } else {
            tmp = peopleAge2(n-1)+2;
            return tmp;
        }
    }
    //求5的阶乘：
    public static int fac(int n) {
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
        }
        return tmp;
    }

    //递归：
    public static int fac2(int n) {
        int tmp = 1;
        if(n == 1) {
            tmp = 1;
            return tmp;
        } else {
            tmp = fac2(n-1)*n;
            return tmp;
        }
    }

    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"==>"+pos2 + " ");
    }

    public static void hanio(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        } else {
            hanio(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanio(n-1,pos2,pos1,pos3);
        }
    }

    public static void main(String[] args) {
        hanio(1,'A','B','C');
        System.out.println();
        hanio(2,'A','B','C');
        System.out.println();
        hanio(3,'A','B','C');
    }
}
