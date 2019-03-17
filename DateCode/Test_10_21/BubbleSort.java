/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/21 19:00
 * @Title 愿上苍有好生之德
 **/
public class BubbleSort {
    private static int[] array = {6, 3, 8, 9, 2};
    public static void bubbleSort(){
        int i;
        int j;
        int temp = 0;
        for(i = 0; i < array.length - 1; i++){
            for(j = 0; j < array.length -1 - i; j++){
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        bubbleSort();
    }
}
