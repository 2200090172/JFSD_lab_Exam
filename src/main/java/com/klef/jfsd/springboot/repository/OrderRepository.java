package com.klef.jfsd.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.klef.jfsd.springboot.model.Order;

public interface OrderRepository extends CrudRepository<Order, String> {

}
