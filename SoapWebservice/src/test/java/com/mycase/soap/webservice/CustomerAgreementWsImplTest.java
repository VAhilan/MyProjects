package com.mycase.soap.webservice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.ahilan.mycase.CreateCustomerRequest;
import com.ahilan.mycase.CreateCustomerResponse;
import com.ahilan.mycase.Customer;
import com.ahilan.mycase.CustomerAgreementPortType;
import com.mycase.soap.webservice.dao.AgreementDao;
import com.mycase.soap.webservice.dao.CustomerDao;

/**
 * This test class is redundant and not in use
 * @author Ahilan
 *
 */


@RunWith(MockitoJUnitRunner.class)
public class CustomerAgreementWsImplTest {
	
	@Mock
	CustomerDao cstDao;
	
	@Mock
	AgreementDao agrDao;
	
	@InjectMocks
	CustomerAgreementPortType service = new CustomerAgreementWsImpl();
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		System.out.println("SetUp complete!");
	}
	
	@Test
	public void testCreateNewCustomer() {
		CreateCustomerRequest req = new CreateCustomerRequest();
		Customer c = new Customer();
	
		req.setCustomer(c);;
		
		when(cstDao.insertCustomer(c)).thenReturn("2");
		
		CreateCustomerResponse res=service.createCustomer(req);
		
		System.out.println("Running assertTrue : " + res.getCustomerID());
		assertEquals( "2", res.getCustomerID());
	}

	/*@Test
	public void testCreateOldCustomer() {
		CreateCustomerRequest req = new CreateCustomerRequest();
		
		Customer c = new Customer();
		c.setCustomerID("1");
		req.setCustomer(c);
		
		when(cstDao.insertCustomer(c)).thenReturn("1");
		
		CreateCustomerResponse res=service.createCustomer(req);
		
		System.out.println("Runnung assertTrue : " + res.getCustomerID());
		assertTrue( Integer.parseInt(res.getCustomerID()) == 1);
	}*/
	
}
