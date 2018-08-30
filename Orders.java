package com.mobilestore.hloentity;

import java.sql.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Orders {
	
	@Id
	private int id;
	private int customerid;
	@Temporal(TemporalType.DATE)
	private Date orderdate;
	private String status;
	
	private String paymentid;
	@Temporal(TemporalType.DATE)
	private Date shipping_date;
	

}
