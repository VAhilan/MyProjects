package com.ahilan.mycase;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-06-12T11:29:43.337+02:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://mycase.ahilan.com", name = "CustomerAgreementPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerAgreementPortType {

    @WebMethod(action = "http://mycase.ahilan.com/updateStatus")
    @WebResult(name = "updateStatusResponse", targetNamespace = "http://mycase.ahilan.com", partName = "parameters")
    public UpdateStatusResponse updateStatus(
        @WebParam(partName = "parameters", name = "updateStatusRequest", targetNamespace = "http://mycase.ahilan.com")
        UpdateStatusRequest parameters
    );

    @WebMethod(action = "http://mycase.ahilan.com/createCustomer")
    @WebResult(name = "createCustomerResponse", targetNamespace = "http://mycase.ahilan.com", partName = "parameters")
    public CreateCustomerResponse createCustomer(
        @WebParam(partName = "parameters", name = "createCustomerRequest", targetNamespace = "http://mycase.ahilan.com")
        CreateCustomerRequest parameters
    );

    @WebMethod(action = "http://mycase.ahilan.com/createAgreement")
    @WebResult(name = "createAgreementResponse", targetNamespace = "http://mycase.ahilan.com", partName = "parameters")
    public CreateAgreementResponse createAgreement(
        @WebParam(partName = "parameters", name = "createAgreementRequest", targetNamespace = "http://mycase.ahilan.com")
        CreateAgreementRequest parameters
    );
}
