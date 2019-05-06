import client.MobileCodeWS;
import client.MobileCodeWSSoap;

public class PhoneTest {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap soap = mobileCodeWS.getMobileCodeWSSoap();
        String mobileCodeInfo = soap.getMobileCodeInfo("1837777888", null);
        System.out.println(mobileCodeInfo);
    }
}
