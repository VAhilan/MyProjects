package com.mycase.soap.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ahilan.mycase.CreateAgreementRequest;
import com.ahilan.mycase.CreateAgreementResponse;
import com.ahilan.mycase.CreateCustomerRequest;
import com.ahilan.mycase.CreateCustomerResponse;
import com.ahilan.mycase.Customer;
import com.ahilan.mycase.CustomerAgreementPortType;
import com.ahilan.mycase.UpdateStatusRequest;
import com.ahilan.mycase.UpdateStatusResponse;
import com.mycase.soap.webservice.dao.AgreementDao;
import com.mycase.soap.webservice.dao.AgreementDaoImpl;
import com.mycase.soap.webservice.dao.CustomerDao;
import com.mycase.soap.webservice.dao.CustomerDaoImpl;

@Component
public class CustomerAgreementWsImpl implements CustomerAgreementPortType {
	
	int agreementID;
	
	@Autowired
	private CustomerDao customerDao;

	@Autowired
	AgreementDao agreementDao;

	@Override
	public CreateCustomerResponse createCustomer(CreateCustomerRequest req) {
		
		Customer c = req.getCustomer();
		if(customerDao == null) {
			customerDao = new CustomerDaoImpl();
			System.out.println("CustomerDaoImpl created and assigned");
		}
		String newCustomerID=customerDao.insertCustomer(c);
		
		CreateCustomerResponse resp = new CreateCustomerResponse();
		resp.setCustomerID(newCustomerID);
		return resp;
		
	}

	@Override
	public CreateAgreementResponse createAgreement(CreateAgreementRequest req) {
		
		if(agreementDao == null) {
			agreementDao=new AgreementDaoImpl();
			System.out.println("AgreementDaoImpl created and assigned");
		}
		
		int agreementID = agreementDao.createCustomerAgreementId(req.getAgreement());		
		
		//Return agreementID in response
		CreateAgreementResponse resp = new CreateAgreementResponse();
		resp.setAgreementID(Integer.toString(agreementID));
		return resp;
	}

	
	@Override
	public UpdateStatusResponse updateStatus(UpdateStatusRequest parameters) {
		UpdateStatusResponse myResp = new UpdateStatusResponse();
		myResp.setStatus("Active");
		return myResp;
	}

}
