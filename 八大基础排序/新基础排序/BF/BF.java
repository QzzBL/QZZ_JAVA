package priv.qzz.priv_code;

/**
 * @ClassName BF
 * @Description TODO
 * @Author QZZ
 * @Date 2019/3/6 11:34
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class BF {
    public static int BF (String str,String sub,int pos){
        int lenstr = str.length();
        int lensub = sub.length();
        if(pos < 0 || pos > lenstr-lensub) {
            throw new UnsupportedOperationException("pos位置不合法");
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

