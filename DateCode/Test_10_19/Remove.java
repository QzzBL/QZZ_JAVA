/**
 * @ClassName Remove
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 12:03
 * @Title 愿上苍有好生之德
 **/
/**
 * 8.如何删除数组指定元素
 * ArrayList集合的用法
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Remove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList List = new ArrayList();
        for( int i=0;i<10;i++ ) { //给数组增加10个Int元素
            List.add(i);
        }
        System.out.println("增加的元素: " + List);

        System.out.println("输入想删除的下标号key: ");
        int key = scanner.nextInt();
        List.remove(key);
        System.out.println("删除下表为: " + key + "的元素后的数组: "+ List);
    }
}
