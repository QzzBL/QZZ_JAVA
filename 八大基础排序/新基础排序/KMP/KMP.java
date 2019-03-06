package priv.qzz.priv_code;

/**
 * @ClassName KMP
 * @Description TODO
 * @Author QZZ
 * @Date 2019/3/6 11:24
 * @Title 愿上苍有好生之德
 * @Description:  找到第一个出现的位置
 **/
public class KMP {

    public static void getNext(String sub,int[] next) {
        int lensub = sub.length();
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int k = 0;
        while(i < lensub) {
            if(k == -1 || sub.charAt(k) == sub.charAt(i-1)) {
                next[i] = k+1;
                i++;
                k = k+1;
            } else {
                k = next[k];
            }
        }
    }

    public static int kmp(String str,String sub,int pos) {
        int lenstr = str.length();
        int lensub = sub.length();
        int i = pos;//遍历主串
        int j = 0;
        int[] next = new int[sub.length()];

        getNext(sub,next);

        while(i < lenstr && j < lensub) {
            if(j == -1 || str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];//  j == 5   j == next[5]  j = 2;
            }
        }
        if(j >= lensub) {
            return i-j;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "ababcabcdabcdeabc";
        String sub = "abc";
        System.out.println(kmp(str,sub,0));
    }
}
