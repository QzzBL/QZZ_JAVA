/**
 * @ClassName MainClass
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/9 23:39
 * @Title 愿上苍有好生之德
 **/

/**
 * Java 实例 - 输出数组元素
 * 以下实例演示了如何通过重载 MainClass 类的 printArray 方法
 * 输出不同类型(整型, 双精度及字符型)的数组：
 */
public class MainClass {
    public static void printArray(Integer[] inputArray) {
        for (Integer element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void printArray(Double[] inputArray) {
        for (Double element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void printArray(Character[] inputArray) {
        for (Character element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println("输出整型数组:");
        printArray(integerArray);
        System.out.println("\n输出双精度型数组:");
        printArray(doubleArray);
        System.out.println("\n输出字符型数组:");
        printArray(characterArray);
    }
}
