/**
 * @ClassName Fibonacci
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/14 11:10
 * @Title 愿上苍有好生之德
 **/
/**
 * 求斐波那契数列的前40项的和
 *
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）
 * 以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
 * 在数学上，斐波纳契数列以如下被以递归的方法定义：F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int i = 1; //第一项数字
        int firstNum = 1;
        int secondNum = 1;
        int preNum = 1;
        int lastNum = 1;
        int lastLastNum = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想求和到第多少项： ");
        int input = scanner.nextInt();
        while(i <= input){
            //preNum = firstNum + secondNum;//2
            //lastNum = preNum + secondNum;//3
            lastLastNum = preNum + lastNum;//3
            preNum = lastNum;//1
            lastNum = lastLastNum;//2
            System.out.print(lastLastNum + " ");
            //System.out.println("前" + input + "项的斐波那契数列和" + (sum = sum + lastLastNum) );
            i++;
        }
    }
}
