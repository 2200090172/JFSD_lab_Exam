package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Order;
import com.klef.jfsd.springboot.service.CustomerService;

@RestController
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("addorder")
	public String addorder(@RequestBody Order order)
	{
		return customerService.addorder(order); 
	}
}
