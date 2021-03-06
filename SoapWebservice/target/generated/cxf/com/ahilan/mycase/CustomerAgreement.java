package com.ahilan.mycase;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-06-12T11:29:43.349+02:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "CustomerAgreement", 
                  wsdlLocation = "file:/C:/Users/Thanja/Documents/workspace-sts-3.9.4.RELEASE/SoapWebservice/src/main/resources/CustomerAgreement.wsdl",
                  targetNamespace = "http://mycase.ahilan.com") 
public class CustomerAgreement extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://mycase.ahilan.com", "CustomerAgreement");
    public final static QName CustomerAgreementPortType = new QName("http://mycase.ahilan.com", "CustomerAgreementPortType");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Thanja/Documents/workspace-sts-3.9.4.RELEASE/SoapWebservice/src/main/resources/CustomerAgreement.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CustomerAgreement.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Thanja/Documents/workspace-sts-3.9.4.RELEASE/SoapWebservice/src/main/resources/CustomerAgreement.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CustomerAgreement(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CustomerAgreement(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerAgreement() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CustomerAgreement(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CustomerAgreement(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CustomerAgreement(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CustomerAgreementPortType
     */
    @WebEndpoint(name = "CustomerAgreementPortType")
    public CustomerAgreementPortType getCustomerAgreementPortType() {
        return super.getPort(CustomerAgreementPortType, CustomerAgreementPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerAgreementPortType
     */
    @WebEndpoint(name = "CustomerAgreementPortType")
    public CustomerAgreementPortType getCustomerAgreementPortType(WebServiceFeature... features) {
        return super.getPort(CustomerAgreementPortType, CustomerAgreementPortType.class, features);
    }

}
