package priv.design.case1;

import org.w3c.dom.NodeList;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

/**
 * @ClassName XMLUtil
 * @Description TODO
 * @Author QZZ
 * @Date 2019/4/27 23:19
 * @Title 愿上苍有好生之德
 * @Description:
 **/
public class XMLUtil {
    public static Object getBean() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            //获取包含类名的文本节点
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName("priv.design.case1." + cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
