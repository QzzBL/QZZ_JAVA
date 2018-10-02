import java.util.Scanner;
/*题一：闰年判断标准：
1. 如果能被4整除，但是不能被100整除
2. 能够被400整除
  题二：输入月份，判断季节
  题三：输入一个数打印其阶乘
  题四：打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
  题五：复利有关，下方代码
  题六：寻找某两个数相除，其结果 离黄金分割点 0.618最近
        分母和分子不能同时为偶数
        分母和分子 取值范围在[1-20]
  题七：显示100~200之间不能被3整除的数，要求一行显示10个数
*/
/*public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个年份 ： ");
        int year = scanner.nextInt();
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;
        if((a == 0 && b != 0) || c == 0){
            System.out.println( + year +"是闰年");
        }else{
            System.out.println( + year +"不是闰年");
        }
    }
}*/
//输入月份，显示季节
/*
public class LeapYear{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个月份 ：");
        int month = scanner.nextInt();
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("春季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("夏季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("秋季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("冬季");
                break;
            default:
                System.out.println("没有这个月份");
        }
    }
}
*/

//题三
/*public class LeapYear{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int num = scanner.nextInt();
        int s = 1;
        while(num > 0){
            System.out.print(num + " ");
            s = s*num;
            num--;
        }
        System.out.println("\n");
        System.out.println(s);
    }
}
*/
//题四
/*public class LeapYear{
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 3 != 0 && i % 5 != 0)
                System.out.println(i);
        }
    }
}*/

/*
假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。

然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。

那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
（复利计算按照每年12000投入计算，不按照每月计息）

复利公式：
F = p* ( (1+r)^n );
F 最终收入
p 本金
r 年利率
n 存了多少年
 */

/*public class LeapYear {
    public static void main(String[] args) {
        double p = 12000;
        double f;
        for (int year = 1; p > 0;year++){
            f = p*1.2;
            p = f+12000;
            System.out.println("持续投资"+year+"年，总收入达到"+f+"元");
            if(f>1000000) {
                System.out.println("持续投资"+year+"年，总收入达到一百万  ");
                break;
            }
        }
    }
}
*/

/*
寻找某两个数相除，其结果 离黄金分割点 0.618最近

分母和分子不能同时为偶数
分母和分子 取值范围在[1-20]
 */
/*public class LeapYear{
    public static void main(String[] args){
        double sum = 0;
        for(double i = 1; i <= 20; i++){
            for(double j = 1; j <= 20; j++){
                if((i % 2 != 0 || j % 2 != 0)) {
                    sum = i / j;
                }else if(sum <= 0.618){
                    System.out.println(sum);
                }
            }

        }
    }
}
*/

//题七：显示100~200之间不能被3整除的数，要求一行显示10个数
/*public class LeapYear{
    public static void main(String[] args){
        int j = 0;                          //控制一行显示的数字个数
        System.out.println("100~200之间不能被3整除的整数为 :");
        for ( int i = 0; i <= 200; i++){
            if(i % 3 == 0)
                continue;                   //能被3整除的数
            System.out.printf("%5d",i);     //更整齐d
           // System.out.print(i + " ");
            j++;
            if ( j % 10 == 0)
                System.out.println();       //一行显示10个数后换行
        }
    }
}*/