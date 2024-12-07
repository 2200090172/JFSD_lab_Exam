package com.klef.jfsd.springboot.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "order_table")
@Entity
public class Order 
{
	@Id
	public String orderId;
	
	@Column(nullable = false)
	public String productName;
	
	@Column(nullable = false)
	public String customerName;
	
	@Column(nullable = false)	
	public long quantity;
	
	@Column(nullable = false)
	private LocalDate orderDate = LocalDate.now();
	
}
