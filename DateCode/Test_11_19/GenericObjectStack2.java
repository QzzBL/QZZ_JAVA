/**
 * @ClassName GenericObjectStack2
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/19 10:26
 * @Title 愿上苍有好生之德
 * @Description: 写一个通用的算法，找到数组当中的最大值
 **/
class GenericAlg  {

    public static <T extends Comparable<T>>T findMaxVal(T[] arr) {//Integer extends Number implements Comparable<Integer>
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(max) > 0){//(arr[i] > max){不能用> 比较泛型
                max = arr[i];
            }
        }
        return max;
    }
}
class GenericAlg1<T extends Comparable<T>> {
    public T findMaxVal1(T[] arr){
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}
public class GenericObjectStack2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};//不能用int 泛型是属于引用类型？
        GenericAlg1<Integer> genericAlg1 = new GenericAlg1<Integer>();
        System.out.println(genericAlg1.findMaxVal1(arr));

        Double[] arr1 = {1.2, 9.5, 9.1, 6.6};
        GenericAlg1<Double> genericAlg2 = new GenericAlg1<Double>();
        System.out.println(genericAlg2.findMaxVal1(arr1));

        System.out.println("----------------------------------");


        Integer[] arr2 = {1,2,3,4,5,6};
        Double[] arr3 = {1.2, 9.5, 9.1, 6.6};
        System.out.println(GenericAlg.findMaxVal(arr2));
        System.out.println(GenericAlg.<Double>findMaxVal(arr3));
    }
}
