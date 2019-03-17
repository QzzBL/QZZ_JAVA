/**
 * @ClassName CreateDir
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/7 19:34
 * @Title 愿上苍有好生之德
 **/

/**
 * Java中的目录
 * 创建目录：
 * File类中有两个方法可以用来创建文件夹：
 * mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
 * mkdirs()方法创建一个文件夹和它的所有父文件夹。
 * 下面的例子创建 "D:/代码创建的文件夹" 文件夹：
 */
import java.io.File;

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "D:/代码创建的文件夹";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}


