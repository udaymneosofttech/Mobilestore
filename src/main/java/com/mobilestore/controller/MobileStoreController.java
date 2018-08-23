package com.mobilestore.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import com.mobilestore.hloentity.Customer;
import com.mobilestore.service.MobileStoreService;


@RestController
public class MobileStoreController {

	@Autowired
	private MobileStoreService service;
	
	@GetMapping(value="insert")
	public String customerDetailSend(@ModelAttribute("customer") Customer customer,Map<String,String> map) {
		
		System.out.println("it enter into controller");
		
		String str=service.customerDetailsRegister(customer);
		map.put("result",str);
		return "result";
		
		
	}
}
