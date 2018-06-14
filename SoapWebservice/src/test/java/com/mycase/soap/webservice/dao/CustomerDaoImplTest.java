package com.mycase.soap.webservice.dao;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.ahilan.mycase.Customer;

@RunWith(MockitoJUnitRunner.class)
public class CustomerDaoImplTest {

@Mock
Map<String, Customer> customersMock;

@InjectMocks
CustomerDao dao = new CustomerDaoImpl();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	//For new customer, create and increase customerID and return that id
	@Test
	public void testInsertNewCustomer() {
		Customer c= new Customer();
		c.setPersonnr("12");
		when(customersMock.containsKey(Mockito.anyString())).thenReturn(false);
		String id=dao.insertCustomer(c);
		
		assertTrue(id.equals("1"));
		
	}
	
	
	//For Existing customer return customerId for that customer
	@Test
	public void testInsertExistingCustomer() {
		Customer c = new Customer();
		c.setCustomerID("4");c.setPersonnr("12");
		
		when(customersMock.containsKey(Mockito.anyString())).thenReturn(true);
		
		when(customersMock.get(Mockito.anyString())).thenReturn(c);
		
		String id=dao.insertCustomer(c);
		
		assertTrue(id.equals("4"));
		
	}

}
