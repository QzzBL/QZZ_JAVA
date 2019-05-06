package priv.design.case3;

import java.io.*;
import java.util.Arrays;

public class FileReader {
    public String read(String fileNameSrc) throws IOException {
        //1.创建源（挖井）
        File f = new File(fileNameSrc);
        //2.创建文件字节输入流对象，并接在源上
        InputStream in = new FileInputStream(f);
        //3.具体的读取操作
        byte[] buffer = new byte[9];
        String str = null;
        int len = -1;//表示当前读取的字节总数，如果为-1，表示读到末尾了
        while ((len = in.read(buffer)) != -1) {
            str = new String(buffer, 0 , len);
        }
        System.out.println("读出文件: " + str);
        in.close();
        return str;
    }
}
