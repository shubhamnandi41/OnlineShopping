package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CartRepository;
import com.project.entity.Cart;
import com.project.entity.Product;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRep;
	
	@Autowired
	private OrdersServiceImpl orSr;
	
	@Override
	public List<Cart> getCart() {
		// TODO Auto-generated method stub
		return cartRep.findAll();
	}

	@Override
	@Transactional
	public Cart addItemToCart(Product p) {
		// TODO Auto-generated method stub
		Cart ca=new Cart();
		System.out.println(p);
		ca.setProdName(p.getProdName());
		ca.setProdPrice(p.getProdprice());
		ca.setProdImage(p.getProdImage());
		ca.setProdQuantity(p.getProdQuantity());//change qauntity in front end
		int total=p.getProdprice()*p.getProdQuantity();
		ca.setTotalPrice(total);
		cartRep.save(ca);
		return ca;
	}

	@Override
	@Transactional
	public Cart removeItemFromCart(Product p){
		List<Cart> ca=null;
		ca=cartRep.findAll();
		for(Cart c:ca) {
			if(c.getProdName().equals(p.getProdName())) {
				cartRep.delete(c);
				return c;
			}
		}
		return null;
	}

	@Override
	@Transactional
	public String removeAllItems() {  
		cartRep.deleteAll();
		return "success";
	}

	@Override
	public String placeItemsOrder() {
		
		orSr.addOrder(cartRep.findAll());
		return "Placed";
		
	}

}
