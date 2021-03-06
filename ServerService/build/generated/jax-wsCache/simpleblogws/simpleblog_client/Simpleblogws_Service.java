
package simpleblog_client;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "simpleblogws", targetNamespace = "http://simpleblog/", wsdlLocation = "http://localhost:8080/EngineWEB/simpleblogws?wsdl")
public class Simpleblogws_Service
    extends Service
{

    private final static URL SIMPLEBLOGWS_WSDL_LOCATION;
    private final static WebServiceException SIMPLEBLOGWS_EXCEPTION;
    private final static QName SIMPLEBLOGWS_QNAME = new QName("http://simpleblog/", "simpleblogws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/EngineWEB/simpleblogws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SIMPLEBLOGWS_WSDL_LOCATION = url;
        SIMPLEBLOGWS_EXCEPTION = e;
    }

    public Simpleblogws_Service() {
        super(__getWsdlLocation(), SIMPLEBLOGWS_QNAME);
    }

    public Simpleblogws_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SIMPLEBLOGWS_QNAME, features);
    }

    public Simpleblogws_Service(URL wsdlLocation) {
        super(wsdlLocation, SIMPLEBLOGWS_QNAME);
    }

    public Simpleblogws_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SIMPLEBLOGWS_QNAME, features);
    }

    public Simpleblogws_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Simpleblogws_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Simpleblogws
     */
    @WebEndpoint(name = "simpleblogwsPort")
    public Simpleblogws getSimpleblogwsPort() {
        return super.getPort(new QName("http://simpleblog/", "simpleblogwsPort"), Simpleblogws.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Simpleblogws
     */
    @WebEndpoint(name = "simpleblogwsPort")
    public Simpleblogws getSimpleblogwsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://simpleblog/", "simpleblogwsPort"), Simpleblogws.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SIMPLEBLOGWS_EXCEPTION!= null) {
            throw SIMPLEBLOGWS_EXCEPTION;
        }
        return SIMPLEBLOGWS_WSDL_LOCATION;
    }

}
