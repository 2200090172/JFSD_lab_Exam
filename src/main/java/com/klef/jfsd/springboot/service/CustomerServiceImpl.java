package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Order;
import com.klef.jfsd.springboot.repository.OrderRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public String addorder(Order order) {
		orderRepository.save(order);
		return "Order Added successfully";
	}

}
