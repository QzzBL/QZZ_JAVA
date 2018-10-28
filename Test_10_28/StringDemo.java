/**
 * @ClassName StringDemo
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/26 16:49
 * @Title 愿上苍有好生之德
 **/
public class StringDemo {
    public static void testString(){
        long begin = System.currentTimeMillis();
        String str = "";
        for(int i = 0; i < 30000; i++){
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
    public static void testStringBuffer(){
        long begin = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("");
        for(int i = 0; i < 30000; i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
    public static void testStringBuilder(){
        long begin = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < 30000; i++){
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
    }
}


