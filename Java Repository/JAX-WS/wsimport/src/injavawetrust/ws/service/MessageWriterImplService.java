
package injavawetrust.ws.service;

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
@WebServiceClient(name = "MessageWriterImplService", targetNamespace = "http://service.ws.injavawetrust/", wsdlLocation = "http://localhost:8888/injavawetrust/hello.jaxws?wsdl")
public class MessageWriterImplService
    extends Service
{

    private final static URL MESSAGEWRITERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MESSAGEWRITERIMPLSERVICE_EXCEPTION;
    private final static QName MESSAGEWRITERIMPLSERVICE_QNAME = new QName("http://service.ws.injavawetrust/", "MessageWriterImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/injavawetrust/hello.jaxws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MESSAGEWRITERIMPLSERVICE_WSDL_LOCATION = url;
        MESSAGEWRITERIMPLSERVICE_EXCEPTION = e;
    }

    public MessageWriterImplService() {
        super(__getWsdlLocation(), MESSAGEWRITERIMPLSERVICE_QNAME);
    }

    public MessageWriterImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MESSAGEWRITERIMPLSERVICE_QNAME, features);
    }

    public MessageWriterImplService(URL wsdlLocation) {
        super(wsdlLocation, MESSAGEWRITERIMPLSERVICE_QNAME);
    }

    public MessageWriterImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MESSAGEWRITERIMPLSERVICE_QNAME, features);
    }

    public MessageWriterImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MessageWriterImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MessageWriter
     */
    @WebEndpoint(name = "MessageWriterImplPort")
    public MessageWriter getMessageWriterImplPort() {
        return super.getPort(new QName("http://service.ws.injavawetrust/", "MessageWriterImplPort"), MessageWriter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MessageWriter
     */
    @WebEndpoint(name = "MessageWriterImplPort")
    public MessageWriter getMessageWriterImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.ws.injavawetrust/", "MessageWriterImplPort"), MessageWriter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MESSAGEWRITERIMPLSERVICE_EXCEPTION!= null) {
            throw MESSAGEWRITERIMPLSERVICE_EXCEPTION;
        }
        return MESSAGEWRITERIMPLSERVICE_WSDL_LOCATION;
    }

}
