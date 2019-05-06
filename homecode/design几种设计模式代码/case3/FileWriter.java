package priv.design.case3;
import java.io.*;


public class FileWriter {
    public void write(String encryText,String fileNameDes) throws IOException {
        //1:创建目标对象（表示把数据保存到哪一个文件）
        File target = new File(fileNameDes);
        //2:创建文件字节输出流对象（水管）
        OutputStream out = new FileOutputStream(target, true);//true表示需要追加文件内容
        out.write(encryText.getBytes());
        //4:关闭资源对象
        out.close();
        System.out.println("文件已经保存");
    }
}
