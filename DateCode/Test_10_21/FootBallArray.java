/**
 * @ClassName FootBallArray
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/21 12:37
 * @Title 愿上苍有好生之德
 **/

/**
 * 假设我现在是球队的教练,我需要安排上场的球员(安排5个).模拟数据存储的案例,模拟上场球员的球衣号码的存储:
 *
 * Integer[] players = null;
 *
 * 作为一个教练,要安排上场:
 *
 * 1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码.
 * 2):安排5个球员上场:[11,22,33,44,55].
 * 3):查询指定位置的球员的球衣号码是多少.查询索引位置为2的球衣号码是:33.
 * 4):根据球衣号码查询该球员在场上的索引位置. 44球衣号的球员在场上的索引位置是:3.
 * 5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333. 333把33替换了.
 * 6):替换球衣号码为22的球员,替换之后为222.
 * 7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位.).
 * 8):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55].
 */
import java.util.*;
public class FootBallArray {
    public static int n = 0;
    public static Integer player[] =  null;

    //1):初始容量为5的线性列表,准备用来存储场上的5个球衣号码.
    public static void player(int n) {
        player = new Integer[n];
    }

    //2):安排5个球员上场:[11,22,33,44,55]
    public static void addPlayer() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < player.length; i++) {
            player[i] = scanner.nextInt();
        }
    }

    //3):查询指定位置的球员的球衣号码是多少.查询索引位置为2的球衣号码是:33.
    public static void searchNumByIndex(int index) {
        for (int i = 0; i < player.length; i++) {
            if (i == index) {
                System.out.println(player[i]);
            }
        }
    }

    //4):根据球衣号码查询该球员在场上的索引位置. 44球衣号的球员在场上的索引位置是:3.
    public static void searchIndexByNum(int num) {
        for (int i = 0; i < player.length; i++) {
            if (player[i] == num) {
                System.out.println(i);
            }
        }
    }

    //5):替换场上索引位置为2的球员,替换之后该位置的球衣编号为333. 333把33替换了.
    public static void replaceNumByIndex(int index1, int newNum) {
        for (int i = 0; i < player.length; i++) {
            if (i == index1) {
                player[i] = newNum;
            }
        }
        print();
    }

    //6):替换球衣号码为22的球员,替换之后为222.
    public static void replaceNumByNum(int num1, int newNum1) {
        for (int i = 0; i < player.length; i++) {
            if (player[i] == num1) {
                player[i] = newNum1;
            }
        }
        print();
    }

    //7):把场上索引位置为2的球衣罚下场(注意:罚下,没有补位.).
    public static void redCard(int index2, int n) {
        if (index2 >= player.length) {
            System.out.println("数组越界");
        }
        for (int i = index2; i < player.length - 1; i++) {
            player[i] = player[i + 1];
        }
        n--;
        //tatic int addPlayer[2]
        print();
        //return player;
    }

    //9):按照球员在场上的位置,打印出球衣号码,打印风格:[11,22,33,44,55].
    public static void print(){
        //数组还没有初始化
        if(player == null){
            System.out.println("null");
            return;
        }
        //初始化了，但是没有值，也就是台上还没有球员
        if(n == 0){
            System.out.println("没有球员");
            return;
        }
        System.out.println(Arrays.toString(player));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        player(5);


        addPlayer();

        int index = scanner.nextInt();
        searchNumByIndex(index);

        int num = scanner.nextInt();
        searchIndexByNum(num);

        int index1 = scanner.nextInt();
        int newNum = scanner.nextInt();
        replaceNumByIndex(index1, newNum);

        int num1 = scanner.nextInt();
        int newNum1 = scanner.nextInt();
        replaceNumByNum(num1, newNum1);
        int index2 = scanner.nextInt();
        redCard(index2,n);
        System.out.println(Arrays.toString(player));
    }
}
    //public String toString(){
     //   if(player[player.length - 1] = 0 ){

        //}
       // StringBuilder Sb = new StringBuilder(100);
       // sb.append("[");
      //  if(){

       // }
   // }
//}
