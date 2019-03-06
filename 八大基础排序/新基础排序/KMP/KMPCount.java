package priv.qzz.priv_code;

/**
 * @ClassName KMPCount
 * @Description TODO
 * @Author QZZ
 * @Date 2019/3/6 11:26
 * @Title 愿上苍有好生之德
 * @Description:  对重复出现的进行计数
 **/
public class KMPCount {
    public static void getNext(String sub,int[] next) {
        int lensub = sub.length();
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int k = 0;
        while(i <= lensub) {
            if(k == -1 || sub.charAt(k) == sub.charAt(i-1)) {
                next[i] = k+1;
                i++;
                k = k+1;
            } else {
                k = next[k];
            }
        }
    }

    public static int kmpCount(String str,String sub,int pos) {
        int lenstr = str.length();
        int lensub = sub.length();
        int i = pos;//遍历主串
        int j = 0;
        int[] next = new int[sub.length()+1];
        int count = 0;
        getNext(sub,next);
        while(i < lenstr) {
            if(j >= lensub) {
                count++;
                j = next[j];
            }
            if(j == -1 || str.charAt(i) == sub.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];//  j == 5   j == next[5]  j = 2;
            }
        }
        if(j >= lensub) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcabcdabcdeabc";
        String sub = "abc";
        System.out.println(kmpCount(str,sub,0));
    }
}

