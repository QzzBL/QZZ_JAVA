/**
 * @ClassName Interface
 * @Description TODO
 * @Author QZZ
 * @Date 2018/10/31 20:20
 * @Title 愿上苍有好生之德
 **/
abstract class Door{
    public abstract void open();
    public abstract void close();
}
interface Alarm{
    void alarm();
}

class FindAlarm extends Door implements Alarm{

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void alarm() {

    }
}
public class Interface {
    public static void main(String[] args) {

    }
}
