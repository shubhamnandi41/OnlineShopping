package com.project.service;

import java.util.List;

import com.project.entity.Cart;
import com.project.entity.Customer;
import com.project.entity.Product;
import com.project.entity.Wishlist;
import com.project.exception.AlreadyExistException;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;

public interface CustomerService {
	
	public Customer createCustomer(Customer c) throws AlreadyExistException;
	public Customer checkCustomer(Customer c) throws PasswordMissmatchException, NoSuchEntityException;
	public List<Customer> findAll(); 
	public Wishlist addItemToWishlist(Product p);
	public Cart addProdToCart(Product p);
	public Cart removeProdFromCart(Product p);
	public Wishlist removeItemFromWishlist(Product p);
	public List<Cart> getCartItems();
	public List<Wishlist> getWishItems();
	public String removeWishlist();
	public String removeCart();
	public String placeOrder();
}
