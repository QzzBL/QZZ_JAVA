/**
 * @ClassName TestDemo2
 * @Description TODO
 * @Author QZZ
 * @Date 2018/11/15 14:17
 * @Title 愿上苍有好生之德
 **/
enum Color {
    RED, GREEN, WHITE, BLACK
        }
public class TestDemo2 {
    public static void main(String[] args) {
        Color color = Color.BLACK;
        switch (color) {
            case GREEN:
                System.out.println("green");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case RED:
                System.out.println("red");
                break;
            case WHITE:
                System.out.println("white");
                break;
                default:
                    System.out.println("default");
                    break;
        }
    }
}
