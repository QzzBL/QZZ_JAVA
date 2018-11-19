import java.util.ArrayList;

/**
 * @ClassName GenericObjectStack4
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/19 11:27
 * @Title 愿上苍有好生之德
 * @Description: 写一个算法：找到集合当中的最大值。
 **/
class GenericAlg4 {
    public static <T extends Comparable<T>>T findMaxVal1(ArrayList<T> list) {
        T max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }
    public static <T extends Comparable<T>> T findMaxVal2(ArrayList<? extends T> list) {
        T max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }
}
class Person implements Comparable<Person> {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}

class Student1 extends Person {
    private int age;
    public Student1(String name, int age){
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
public class GenericObjectStack4 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(1);
        System.out.println(GenericAlg4.findMaxVal1(arrayList));
        System.out.println(GenericAlg4.findMaxVal2(arrayList));

        ArrayList<Person> arrayList1 = new ArrayList<Person>();
        arrayList1.add(new Person("qzz"));
        arrayList1.add(new Person("zcx"));
        System.out.println(GenericAlg4.findMaxVal1(arrayList1));
        System.out.println(GenericAlg4.findMaxVal2(arrayList1));

        ArrayList<Student1> arrayList2 = new ArrayList<Student1>();
        arrayList2.add(new Student1("qzz",18));
        arrayList2.add(new Student1("sun",17));
        //System.out.println(GenericAlg4.findMaxVal1(arrayList2));
        System.out.println(GenericAlg4.findMaxVal2(arrayList2));
    }
}
