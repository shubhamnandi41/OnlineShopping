package com.project.service;

import java.util.List;

import com.project.entity.Cart;
import com.project.entity.Orders;

public interface OrdersService {

	public String addOrder(List<Cart> c);
	public List<Orders> getOrders();
	public String makePayment();
	
}
