/**
 * @ClassName TArrayCopy
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/22 11:13
 * @Title 愿上苍有好生之德
 **/
import java.util.*;
public class TArrayCopy {
    private int val = 10;

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public static void print(TArrayCopy[][] array, TArrayCopy[][] brray) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j].getVal() + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < brray.length; i++) {
            for (int j = 0; j < brray[i].length; j++) {
                System.out.print(brray[i][j].getVal() + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    //for循环对的考别
    /*public static void main(String[] args) {
        TArrayCopy[][] array = new TArrayCopy[2][2];
        array[0][0] = new TArrayCopy();
        array[0][1] = new TArrayCopy();
        array[1][0] = new TArrayCopy();
        array[1][1] = new TArrayCopy();
        TArrayCopy[][] brray = new TArrayCopy[2][2];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                brray[i][j] = array[i][j];
            }
        }
        print(array, brray);
        brray[0][0].setVal(100000000);
        print(array, brray);
    }*/

    //clone() 拷贝
 /*   public static void main(String[] args) {
        TArrayCopy[][] array = new TArrayCopy[2][2];
        array[0][0] = new TArrayCopy();
        array[0][1] = new TArrayCopy();
        array[1][0] = new TArrayCopy();
        array[1][1] = new TArrayCopy();
        TArrayCopy[][] brray = new TArrayCopy[2][2];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                brray[i] = array[i].clone();
            }
        }
        print(array, brray);
        brray[0][0].setVal(100000000);
        print(array, brray);
    }*/

      //System.arraycopy()拷贝
 /*   public static void main(String[] args) {
        TArrayCopy[][] array = new TArrayCopy[2][2];
        array[0][0] = new TArrayCopy();
        array[0][1] = new TArrayCopy();
        array[1][0] = new TArrayCopy();
        array[1][1] = new TArrayCopy();
        TArrayCopy[][] brray = new TArrayCopy[2][2];
        for(int i = 0; i < array.length; i++) {
            System.arraycopy(array[i],0,brray[i],0,2);
        }

        print(array, brray);
        brray[0][0].setVal(100000000);
        print(array, brray);
    }*/


 //Arrays.copyOf()的拷贝
 public static void main(String[] args) {
     TArrayCopy[][] array = new TArrayCopy[2][2];
     array[0][0] = new TArrayCopy();
     array[0][1] = new TArrayCopy();
     array[1][0] = new TArrayCopy();
     array[1][1] = new TArrayCopy();
     TArrayCopy[][] brray = new TArrayCopy[2][2];
     //TArrayCopy[][] brray = Arrays.copyOf(array, array.length);


     for(int i = 0; i < array.length; i++){
         brray[i] = Arrays.copyOf(array[i], array[i].length);
     }
     print(array, brray);
     brray[0][0].setVal(100000000);
     print(array, brray);
 }
}