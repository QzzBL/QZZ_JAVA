package priv.design.case3;

public class CipherMachine {
    public String encrypt(String plainText){
        String encryText = plainText + "0340203";
        System.out.println("文件已加密: " + encryText);
        return encryText;
    }
}
