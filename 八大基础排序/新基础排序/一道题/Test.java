/**
 * @ClassName Test
 * @Description TODO
 * @Author QZZ
 * @Date 2019/1/14 21:16
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class Test {
    String str = "aabbccddaa";
    String[] arr = toString().split(",");
    String[] newArr = new String[arr.length * 2];


    public static void test(String[] arr, String[] newArr) {
        String temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int count = 1;
            if (arr[i].equals(temp)) {
                count++;
            }else {
                newArr[i - count] = temp;
                //String newStr = (String) ( 1 + count );
                //newArr[i - 1] = count + 1;
                temp = arr[i];
            }
        }
    }
}
