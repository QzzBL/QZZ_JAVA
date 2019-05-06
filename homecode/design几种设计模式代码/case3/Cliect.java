package priv.design.case3;
import java.io.IOException;

public class Cliect {
    public static void main(String[] args) throws IOException {
        new EncryptFacade().fileEncrypt("D:\\read.txt","D:\\write.txt");
    }
}
