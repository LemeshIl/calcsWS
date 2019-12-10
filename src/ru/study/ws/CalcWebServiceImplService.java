
package ru.study.ws;

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
@WebServiceClient(name = "CalcWebServiceImplService", targetNamespace = "http://ws.study.ru/", wsdlLocation = "http://localhost:8080/wss/calc?wsdl")
public class CalcWebServiceImplService
    extends Service
{

    private final static URL CALCWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CALCWEBSERVICEIMPLSERVICE_QNAME = new QName("http://ws.study.ru/", "CalcWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/wss/calc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CALCWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CalcWebServiceImplService() {
        super(__getWsdlLocation(), CALCWEBSERVICEIMPLSERVICE_QNAME);
    }

    public CalcWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public CalcWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CALCWEBSERVICEIMPLSERVICE_QNAME);
    }

    public CalcWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public CalcWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalcWebService
     */
    @WebEndpoint(name = "CalcWebServiceImplPort")
    public CalcWebService getCalcWebServiceImplPort() {
        return super.getPort(new QName("http://ws.study.ru/", "CalcWebServiceImplPort"), CalcWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalcWebService
     */
    @WebEndpoint(name = "CalcWebServiceImplPort")
    public CalcWebService getCalcWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.study.ru/", "CalcWebServiceImplPort"), CalcWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CALCWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CALCWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
