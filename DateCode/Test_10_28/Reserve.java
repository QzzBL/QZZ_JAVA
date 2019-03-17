import java.util.Scanner;

/**
 * @ClassName Reserve
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/28 14:41
 * @Title 愿上苍有好生之德
 **/
//20、"abcdef" ===> "cdefab"   参数：String    n  位置
public class Reserve {
    public static String reverse1(String str, int begin, int end) {
        char[] ch = str.toCharArray();
        char tmp;
        while (begin < end) {
            tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;
        }
        return String.copyValueOf(ch);//将ch转化为字符串
    }
    public static void leftRoadString(String str, int n) {//2
        if (str == null || n < 0 || n > str.length()) {
            return;
        }
        //abcdef
        int left = 0;
        int leftend = n - 1;
        int right = n;
        int rightend = str.length() - 1;
        str = reverse1(str, left, leftend);//bacdef
        str = reverse1(str, right, rightend);//bafedc
        str = reverse1(str, left, rightend);//cdefab
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //System.out.println(reverseSentence(str));
        int n = scanner.nextInt();
        leftRoadString(str, n);
    }
}
