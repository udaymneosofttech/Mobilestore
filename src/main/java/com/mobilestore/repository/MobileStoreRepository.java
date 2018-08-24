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
		int m=101;
		int a=10;
		int b=25;
		int c=a+b;
		System.out.println(c);
		
		customer.setCid(m);
	int i=(int) ht.save(customer);
	return i;
	
	}

}
