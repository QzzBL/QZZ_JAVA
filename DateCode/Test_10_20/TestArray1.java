/**
 * @ClassName TestArray1
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/19 17:03
 * @Title 愿上苍有好生之德
 **/
/**
 * Arrays.copyOf 对基本类型的拷贝 深拷贝
 */

/**
 * 深浅拷贝的区别:
 *     浅拷贝是将原始对象中的数据型字段拷贝到新对象中去，将引用型字段的“引用”复制到
 *       新对象中去，不把“引用的对象”复制进去，所以原始对象和新对象引用同一对象，新对象
 *       中的引用型字段发生变化会导致原始对象中的对应字段也发生变化。
 *
 *     深拷贝是在引用方面不同，深拷贝就是创建一个新的和原始字段的内容相同的字段，
 *       是两个一样大的数据段，所以两者的引用是不同的，之后的新对象中的引用型字段发生改变，
 *       不会引起原始对象中的字段发生改变。
 */

import java.util.*;
public class TestArray1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] brray = Arrays.copyOf(array,array.length);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
        brray[0] = 1000;
        System.out.println("=================");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(brray));
    }
    }

