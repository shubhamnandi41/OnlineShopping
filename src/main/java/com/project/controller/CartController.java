package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Cart;
import com.project.entity.Product;
import com.project.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService crtSr;
	
//	@GetMapping("/cart/items")
//	public List<Cart> getProducts(){
//		return crtSr.getCart();
//	}
	
//	@PostMapping("/cart/additem")
//	public Cart addToCart(@RequestBody Product pr) {
//		return crtSr.addItemToCart(pr);
//	}
	
//	@DeleteMapping("/cart/deleteitem")
//	public Cart deleteFromCart(@RequestBody Product pr) {
//		return crtSr.removeItemFromCart(pr);
//	}
//	
//	@DeleteMapping("/cart/deletAll")
//	public String deleteAllItems() {
//		return crtSr.removeAllItems();
//	}
//	
//	@GetMapping("/cart/order")
//	public String placeOrder() {
//		return crtSr.placeItemsOrder();
//		
//	}
}
