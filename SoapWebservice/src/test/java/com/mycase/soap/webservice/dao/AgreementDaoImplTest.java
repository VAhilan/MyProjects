package com.mycase.soap.webservice.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.ahilan.mycase.Agreement;

@RunWith(MockitoJUnitRunner.class)
public class AgreementDaoImplTest{

@Mock
Map<String, List<Agreement>> agreements;

@InjectMocks
AgreementDao dao = new AgreementDaoImpl();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	//For new agreement, create and increase agreementID and return that id
	@Test
	public void createAgreementIdForNewAgreement() {
		//List<Agreement> CustomerAgreements = new ArrayList<>();
		
		Agreement a= new Agreement();
		a.setCustomernr("1");a.setIdentifier("Bil");
		
		when(agreements.containsKey(Mockito.anyString())).thenReturn(false);
		int id=dao.createCustomerAgreementId(a);
		
		assertTrue(id >= 1);
		
	}
	
	//If same agreement is found for this customer, return that agreementID
	@Test
	public void createAgreementIdForExistingAgreement() {
		Agreement a= new Agreement();
		a.setCustomernr("1");a.setIdentifier("Bil");a.setAgreementID("2");
		
		List<Agreement> CustomerAgreements = new ArrayList<>();
		CustomerAgreements.add(a);
		
		when(agreements.containsKey(Mockito.anyString())).thenReturn(true);
		when(agreements.get(Mockito.anyString())).thenReturn(CustomerAgreements);
		
		int id=dao.createCustomerAgreementId(a);
		
		assertEquals(2, id);
		
	}
	
	//Customer has some agreements,but this is new, return create new agreementID
		@Test
		public void createAgreementIdForExistingAgreementList() {
			Agreement a= new Agreement();
			a.setCustomernr("1");a.setIdentifier("Bil");a.setAgreementID("2");
			
			List<Agreement> CustomerAgreements = new ArrayList<>();
			CustomerAgreements.add(a);
			
			Agreement b= new Agreement();
			b.setCustomernr("1");b.setIdentifier("Buss");
			
			when(agreements.containsKey(Mockito.anyString())).thenReturn(true);
			when(agreements.get(Mockito.anyString())).thenReturn(CustomerAgreements);
			
			int id=dao.createCustomerAgreementId(b);
			
			assertNotEquals(2, id);
			
		}

}
