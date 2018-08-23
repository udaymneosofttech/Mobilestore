package com.mobilestore.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.mobilestore.hloentity.Customer;

@Repository
public class MobileStoreRepository implements MobileStoreRepositoryInterface{
	
	
	@Autowired
	private HibernateTemplate ht;
	
	
	public int customerDetailsInsert(Customer customer) {
		
		
	int i=(int) ht.save(customer);
	return i;
	
	}

}
