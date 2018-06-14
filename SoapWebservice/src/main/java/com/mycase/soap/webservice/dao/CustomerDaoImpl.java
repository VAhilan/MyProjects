package com.mycase.soap.webservice.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ahilan.mycase.Customer;

@Component("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	
	//Key = personNr
	private Map<String, Customer> customers = new HashMap<>();
	static int iCustomerID;

	
	public CustomerDaoImpl() {
		super();
		System.out.println("CustomerDaoImpl created : " + this);
	}


	@Override
	/**
	 * Return : customer ID
	 */
	public String insertCustomer(Customer customer) {
		
		String personNr = customer.getPersonnr();
		if(customers.containsKey(personNr)) {
			return customers.get(personNr).getCustomerID();
		}
		else {
			++iCustomerID;
			customer.setCustomerID(""+ iCustomerID);
			customers.put(personNr, customer);
			return customer.getCustomerID();
		}
		
	}
	
	
}
