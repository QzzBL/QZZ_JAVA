import java.util.ArrayList;

/**
 * @ClassName GenericObjectStack3
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/19 11:13
 * @Title 愿上苍有好生之德
 * @Description: 1.写一个通用的算法：打印集合ArrayList内的所有元素
 *                2.通配符简单用法
 **/
//泛型方法
class GenericAlg3 {
    public static <T> void printList(ArrayList<T> arrList){
        for (T obj : arrList) {
            System.out.println(obj);
        }
    }
    //通配符用于 以及泛型的擦除机制-->Object 向上擦除
    public static <T> void printList1(ArrayList<?> arrList){
        for (Object obj : arrList) {
            System.out.println(obj);
        }
    }
}
public class GenericObjectStack3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        GenericAlg3.printList(arrayList);
        GenericAlg3.printList1(arrayList);


    }
}
