package com.project.service;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.OrdersRepository;
import com.project.entity.Cart;
import com.project.entity.Orders;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository orRep;
	
	@Override
	public List<Orders> getOrders() {
		return orRep.findAll();
	}


	@Override
	public String makePayment() {
		// TODO Auto-generated method stub
		return "Payment Successfull ";
	}


	@Override
	@Transactional
	public String addOrder(List<Cart> c) {
		LocalDate orderDate;
		String orderStatus,Productanme;
		int total,ProductQuantity;
		for(Cart ca:c) {
			Orders or=new Orders();
			orderDate = LocalDate.now();
			orderStatus=" Order placed";
			total=ca.getTotalPrice();
			Productanme=ca.getProdName();
			ProductQuantity=ca.getProdQuantity();
			or.setOrderDate(orderDate);
			or.setOrderStatus(orderStatus);
			or.setTotal(total);
			or.setProductanme(Productanme);
			or.setProductQuantity(ProductQuantity);
			orRep.save(or);
		}
		return "Suuccfully added to orders";
	}


}
