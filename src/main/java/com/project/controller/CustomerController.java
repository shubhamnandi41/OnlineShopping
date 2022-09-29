package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Cart;
import com.project.entity.Customer;
import com.project.entity.Product;
import com.project.entity.Wishlist;
import com.project.exception.AlreadyExistException;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;
import com.project.service.CustomerServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {

	@Autowired
    private CustomerServiceImpl csr;
	
//	@GetMapping("/customer/GetAll")
//	public List<Customer> findCustomers() {
//		return csr.findAll();
//	}
	@PostMapping("/customer/create")
	public Customer addCustomer(@RequestBody Customer c) throws AlreadyExistException {	//checked
		
		return csr.createCustomer(c);
	}
	@PostMapping("/customer/Login")
	public Customer verifyCustomer(@RequestBody Customer c) throws NoSuchEntityException, PasswordMissmatchException{	//checked
		return csr.checkCustomer(c);
	}
	
	@PostMapping("/customer/AddToWish")
	public Wishlist addToWishlist(@RequestBody Product p) {
		return csr.addItemToWishlist(p);
		
	}
	
	@PostMapping("/customer/AddToCart")
	public Cart addToCart(@RequestBody Product p){	//checked
		return csr.addProdToCart(p);
		
	}
	
	@PostMapping("/customer/RemoveFromCart")
	public Cart deleteProdFromCart(@RequestBody Product p) {
		return csr.removeProdFromCart(p);
	}
	
	@PostMapping("/customer/RemoveFromWish")
	public Wishlist deleteProdFromWish(@RequestBody Product p) {
		return csr.removeItemFromWishlist(p);
	}
	
	@DeleteMapping("/customer/RemoveAllWish")
	public String removeWishlist() {
		return csr.removeWishlist();
		
	}
	
	@DeleteMapping("/customer/RemoveAllCart")
	public String removeCart() {
		return csr.removeCart();
		
	}
	
	@GetMapping("/customer/Order")
	public String confirmOrder() {
		return csr.placeOrder();
	}
	
	@GetMapping("/customer/GetCart")
	public List<Cart> getCart(){
		return csr.getCartItems();
	}
	@GetMapping("/customer/GetWish")
	public List<Wishlist> getWish(){
		return csr.getWishItems();
	}
}