/**
 * @ClassName SingleNum
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 0:28
 * @Title 愿上苍有好生之德
 **/

/**常规解法：
 * 3、题目：=一个整形数组，除了两个数字只出现一次外，
 * 其他数字都是两次。{1,3,1,2,3,4}    找到这两个数字
 */
/**
 * 3、题目：=一个整形数组，除了两个数字只出现一次外，
 * 其他数字都是两次。{1,3,1,2,3,4}    找到这两个数字
 *
 * （1）常规方法一:先找相同，再判断与相同的不否的则为不同的那两个数字
 * （2）方法二:(如下代码)思想:
 *                          先对数组排序，由于两个相同，只需从0下标开始和后面的比，元素相同
 *                          则i加上2，比如{1,1,2,3,3,4}中，从0下标调到2号下标，再和后面比较
 *                          不同则已经确定一个元素，i加1再次判断加1后的元素与它后面是否相等，
 *                          相等则找到，此为一种情况，代码最下方的四中情况就概括了两个数字可能
 *                          放置的不同位置，最后打印，一次for循环即可
 */

import java.util.*;
public class SingleNum {
    public static void singleNum(int[] arr){
        int i;
        int j;
        for( i = 0 ; i < arr.length; i = i + 2){
            if(i == arr.length - 1){//判断 i 和 最后一个下标是否相等，例如case1:{1,1,2,3,3,4}，找到最后不同的元素
                System.out.println(arr[i]);
                break;
            }
            if(arr[i] != arr[i + 1] ){
                i++;
                if( i == arr.length - 1 || arr[i] != arr[i + 1]){// i == arr.length - 1 用于判断ase3:{1,1,2,2,3,4}情况
                                                                  //!= 判断不能放在前面，应为最后一个数的后面没有数了，会数组下标越界
                    System.out.println(arr[i - 1] + " " + arr[i]);
                    break;
                }else {
                    System.out.println(arr[i - 1]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,4}; //sort后: case1:{1,1,2,3,3,4} 2  4；两个只出现一次的数，一个在中间，一个在最后
       //int[] arr = {1,3,5,2,5,1};//sort后: case2:{1,1,2,3,5,5}  2  3；两个只出现一次的数，都在中间
        //int[] arr = {1,1,2,3,4,2};//sort后: case3:{1,1,2,2,3,4}  3  4；两个只出现一次的数，都在末尾
        //int[] arr = {1,2,1,4,5,3,3,5};//sort后: case:{1,1,2,3,3,4,5,5} 2  4；两个只出现一次的数，在数组中间，并且夹着数
        Arrays.sort(arr);
        singleNum(arr);
    }
}
