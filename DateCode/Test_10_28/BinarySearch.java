/**
 * @ClassName BinarySearch
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/28 12:58
 * @Title 愿上苍有好生之德
 **/
public class BinarySearch {
    public static int binaryS(int[] array,int val, int low, int high){
        int mid = (low+high)>>>1;
        if(low > high){
            return -1;
        }else if(array[mid] > val){
            return binaryS(array, val,  low, mid - 1);
        }else if(array[mid] < val){
            return binaryS(array, val, mid + 1,  high);
        }else{
            return mid;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int val = 2;
        int low = 0;
        int high = array.length-1;
        System.out.println(binaryS(array,val, low, high));
    }
}
