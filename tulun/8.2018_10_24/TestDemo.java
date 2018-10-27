import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2018-10-24
 * Time: 17:47
 */
public class TestDemo {

    public static void magicScqure(int[][] array,int n) {//3     1- 9
        array[0][n/2] = 1;
        int prevRow = 0;
        int prevCol = n/2;
        for(int i = 2;i <= n*n;i++) {
            if(array[(prevRow-1+n)%n][(prevCol+1)%n] != 0) {
                //上一行的下一列没有数据
                prevRow = (prevRow+1)%n;//下一行
            } else {
                prevRow = (prevRow-1+n)%n;
                prevCol = (prevCol+1)%n;
            }
            array[prevRow][prevCol] = i;
        }
    }

    public static void main(String[] args) {
        int row = 5;
        int[][] array = new int[row][row];
        magicScqure(array,row);
        System.out.println(Arrays.deepToString(array));
    }
}
