package com.mobilestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.repository.MobileStoreRepositoryInterface;

@Service
public class MobileStoreService implements MobileStoreServiceInterface{
	
	@Autowired
	MobileStoreRepositoryInterface service;
	
	
	public String customerDetailsRegister(Customer customer) {
	int i=service.customerDetailsInsert(customer);
	
	if(i!=0)
		return i+"id inserted successfully";
	else 
	    return "Object not inserted sucecsfully";
		
	}
	
	

}
