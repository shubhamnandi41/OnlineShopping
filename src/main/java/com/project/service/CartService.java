package com.project.service;

import java.util.List;

import com.project.entity.Cart;
import com.project.entity.Product;

public interface CartService {

	public List<Cart> getCart();
	public Cart addItemToCart(Product p);
	public Cart removeItemFromCart(Product p);
	public String removeAllItems();
	public String placeItemsOrder();
}
