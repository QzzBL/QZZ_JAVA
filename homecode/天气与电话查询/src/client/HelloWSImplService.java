
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWSImplService", targetNamespace = "http://server/", wsdlLocation = "http://192.168.1.139:8989/wsDemo/hellows?wsdl")
public class HelloWSImplService
    extends Service
{

    private final static URL HELLOWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWSIMPLSERVICE_EXCEPTION;
    private final static QName HELLOWSIMPLSERVICE_QNAME = new QName("http://server/", "HelloWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.139:8989/wsDemo/hellows?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWSIMPLSERVICE_WSDL_LOCATION = url;
        HELLOWSIMPLSERVICE_EXCEPTION = e;
    }

    public HelloWSImplService() {
        super(__getWsdlLocation(), HELLOWSIMPLSERVICE_QNAME);
    }

    public HelloWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWSIMPLSERVICE_QNAME, features);
    }

    public HelloWSImplService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWSIMPLSERVICE_QNAME);
    }

    public HelloWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWSIMPLSERVICE_QNAME, features);
    }

    public HelloWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWSImpl
     */
    @WebEndpoint(name = "HelloWSImplPort")
    public HelloWSImpl getHelloWSImplPort() {
        return super.getPort(new QName("http://server/", "HelloWSImplPort"), HelloWSImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWSImpl
     */
    @WebEndpoint(name = "HelloWSImplPort")
    public HelloWSImpl getHelloWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server/", "HelloWSImplPort"), HelloWSImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWSIMPLSERVICE_EXCEPTION!= null) {
            throw HELLOWSIMPLSERVICE_EXCEPTION;
        }
        return HELLOWSIMPLSERVICE_WSDL_LOCATION;
    }

}
