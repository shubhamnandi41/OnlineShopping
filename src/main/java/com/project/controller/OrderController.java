package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Cart;
import com.project.entity.Orders;
import com.project.service.OrdersService;

@RestController
public class OrderController {

	@Autowired
	private OrdersService orSr; 
	
	@PostMapping("/Order")
	public String addOrder(@RequestBody List<Cart> c) {
		return orSr.addOrder(c);
	}
	
	@GetMapping("/Order/GetOrders")
	public List<Orders> getOrders(){
		return orSr.getOrders();
	}
	

	@GetMapping("/order/pay")
	public String makePayment() {
		return orSr.makePayment();
	}
}
