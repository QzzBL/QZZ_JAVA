/**
 * @ClassName Overload
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/3 17:12
 * @Title 愿上苍有好生之德
 **/
class Overloading {
    public int test(){
        return 1;
    }
    public void test(int a) {
        System.out.println("2");
    }
    //以下两个参数类型顺序不同
    public String test(int a, String s) {
        return "3";
    }
    public String test(String s,int a){
        return "4";
    }

}
public class Overload {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.test());
        o.test(2);
        System.out.println(o.test(3,"test3"));
        System.out.println(o.test("test4",4));
    }
}
