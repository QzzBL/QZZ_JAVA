package priv.qzz.priv_code;

/**
 * @ClassName BF
 * @Description TODO
 * @Author QZZ
 * @Date 2019/3/6 11:34
 * @Title Ը�ϲ��к���֮��
 * @Description:
 **/
public class BF {
    public static int BF (String str,String sub,int pos){
        int lenstr = str.length();
        int lensub = sub.length();
        if(pos < 0 || pos > lenstr-lensub) {
            throw new UnsupportedOperationException("posλ�ò��Ϸ�");
        }
        int i = pos;
        int j = 0;
        while(i < lenstr && j < lensub) {
            if(str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                i = i-j+1;
                j = 0;
            }
        }
        if(j >= lensub) {
            return i-j;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "ababcabcdabcde";
        String sub = "abcdf";
        System.out.println(BF(str,sub,0));
    }
}

