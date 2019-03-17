/**
 * @ClassName FindMaxK
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/14 20:42
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class FindMaxK {
    public static int partion(int[] array, int low, int high) {
        int temp = 0;
        temp = array[0];
        while (low < high) {
            while (temp < high) {
                high--;
            }
            if (low >= high) {
                break;
            }
            if (temp > array[high]) {
                array[low] = array[high];
            }
            while (low < temp) {
                low++;
            }
            if (low >= high) {
                break;
            }
            if (temp < array[low]) {
                array[high] = array[low];
            }
        }
        array[low] = temp;
        return low;
    }
    public static void goOn(int[] arrays, int par, int k) {
        if (par > (k - 1)) {
            //partion(arrays);
        }
    }
}
