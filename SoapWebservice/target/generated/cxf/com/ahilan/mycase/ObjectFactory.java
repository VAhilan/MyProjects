
package com.ahilan.mycase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ahilan.mycase package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateCustomerRequest_QNAME = new QName("http://mycase.ahilan.com", "createCustomerRequest");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://mycase.ahilan.com", "createCustomerResponse");
    private final static QName _CreateAgreementRequest_QNAME = new QName("http://mycase.ahilan.com", "createAgreementRequest");
    private final static QName _CreateAgreementResponse_QNAME = new QName("http://mycase.ahilan.com", "createAgreementResponse");
    private final static QName _UpdateStatusRequest_QNAME = new QName("http://mycase.ahilan.com", "updateStatusRequest");
    private final static QName _UpdateStatusResponse_QNAME = new QName("http://mycase.ahilan.com", "updateStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ahilan.mycase
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCustomerRequest }
     * 
     */
    public CreateCustomerRequest createCreateCustomerRequest() {
        return new CreateCustomerRequest();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link CreateAgreementRequest }
     * 
     */
    public CreateAgreementRequest createCreateAgreementRequest() {
        return new CreateAgreementRequest();
    }

    /**
     * Create an instance of {@link CreateAgreementResponse }
     * 
     */
    public CreateAgreementResponse createCreateAgreementResponse() {
        return new CreateAgreementResponse();
    }

    /**
     * Create an instance of {@link UpdateStatusRequest }
     * 
     */
    public UpdateStatusRequest createUpdateStatusRequest() {
        return new UpdateStatusRequest();
    }

    /**
     * Create an instance of {@link UpdateStatusResponse }
     * 
     */
    public UpdateStatusResponse createUpdateStatusResponse() {
        return new UpdateStatusResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Agreement }
     * 
     */
    public Agreement createAgreement() {
        return new Agreement();
    }

    /**
     * Create an instance of {@link UpdateStatus }
     * 
     */
    public UpdateStatus createUpdateStatus() {
        return new UpdateStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mycase.ahilan.com", name = "createCustomerRequest")
    public JAXBElement<CreateCustomerRequest> createCreateCustomerRequest(CreateCustomerRequest value) {
        return new JAXBElement<CreateCustomerRequest>(_CreateCustomerRequest_QNAME, CreateCustomerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mycase.ahilan.com", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAgreementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mycase.ahilan.com", name = "createAgreementRequest")
    public JAXBElement<CreateAgreementRequest> createCreateAgreementRequest(CreateAgreementRequest value) {
        return new JAXBElement<CreateAgreementRequest>(_CreateAgreementRequest_QNAME, CreateAgreementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAgreementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mycase.ahilan.com", name = "createAgreementResponse")
    public JAXBElement<CreateAgreementResponse> createCreateAgreementResponse(CreateAgreementResponse value) {
        return new JAXBElement<CreateAgreementResponse>(_CreateAgreementResponse_QNAME, CreateAgreementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mycase.ahilan.com", name = "updateStatusRequest")
    public JAXBElement<UpdateStatusRequest> createUpdateStatusRequest(UpdateStatusRequest value) {
        return new JAXBElement<UpdateStatusRequest>(_UpdateStatusRequest_QNAME, UpdateStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mycase.ahilan.com", name = "updateStatusResponse")
    public JAXBElement<UpdateStatusResponse> createUpdateStatusResponse(UpdateStatusResponse value) {
        return new JAXBElement<UpdateStatusResponse>(_UpdateStatusResponse_QNAME, UpdateStatusResponse.class, null, value);
    }

}
