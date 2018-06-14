package com.mycase.soap.webservice.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ahilan.mycase.Agreement;

@Component("agreementDao")
public class AgreementDaoImpl implements AgreementDao {

	private Map<String, List<Agreement>> agreements = new HashMap<>();
	
	//Holds agreement ID for all agreements 
	static int iAgreementID;
	
	public AgreementDaoImpl() {
		super();
		System.out.println("AgreementDaoImol created");
	}

	@Override
	public int createCustomerAgreementId(Agreement agreement) {
		List<Agreement> customerAgreements = null;
		//Id for this agreement
		int id=0;
		
		String customerNr = agreement.getCustomernr();
		
		//Get all the agreements for this customer
		if (agreements.containsKey(customerNr)) 
			customerAgreements = agreements.get(customerNr);
		
		
		if (customerAgreements == null) {
			//No agreement is found
			customerAgreements = new ArrayList<>();
			
			id = ++iAgreementID;
			
			agreement.setAgreementID(Integer.toString(iAgreementID));
			customerAgreements.add(agreement);
			
			agreements.put(customerNr, customerAgreements);
		}
		else {
			//Customer has some agreements, go thr' and find out this agreement
			// is already there
			for (Agreement a: customerAgreements) {
				if(a.getIdentifier().equals(agreement.getIdentifier())) {
					//Agreement is already there for this identifier. Return this id
					id = Integer.parseInt(a.getAgreementID());
					break;
				}
			}
			
			//Agreement not found yet. Add this agreement to customer and update agreementID
			if(id==0) {
				id = ++iAgreementID;
				
				agreement.setAgreementID(Integer.toString(iAgreementID));
				customerAgreements.add(agreement);
				
				agreements.put(customerNr, customerAgreements);
			}
		}
		
		return id;
	}

}
