import java.util.ArrayList;

/**
 * @ClassName ArrayListDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/19 21:27
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class ArrayListDemo {
    public static <T>void test(ArrayList <? extends Number> arrayList){
        for (Number obj : arrayList){
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        test(integer);
        ArrayList<Double> double1 = new ArrayList<>();
        test(double1);
    }
}
