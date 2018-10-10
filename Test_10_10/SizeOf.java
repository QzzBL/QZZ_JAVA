/**
 * @ClassName SizeOf
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/10 17:07
 * @Title 愿上苍有好生之德
 **/
public class SizeOf {
    public static void main(String[] args){
        System.out.println("Integer: " + Integer.SIZE/8);			// 4
        System.out.println("Short: " + Short.SIZE/8);				// 2
        System.out.println("Long: " + Long.SIZE/8);					// 8
        System.out.println("Byte: " + Byte.SIZE/8);					// 1
        System.out.println("Character: " + Character.SIZE/8);		// 2
        System.out.println("Float: " + Float.SIZE/8);				// 4
        System.out.println("Double: " + Double.SIZE/8);				// 8
        //System.out.println("Boolean: " + Boolean);                //注意Boolean是1个字节，（毕竟字节是最小的内存单元）因为没有SIZE这个方法，所以打印不出来 。
    }
}
