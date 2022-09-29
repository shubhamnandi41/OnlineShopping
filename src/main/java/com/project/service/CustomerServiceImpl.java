package com.project.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CustomerRepository;
import com.project.entity.Cart;
import com.project.entity.Customer;
import com.project.entity.Product;
import com.project.entity.Wishlist;
import com.project.exception.AlreadyExistException;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository cuRep;
	
	@Autowired
	private WishlistService wlSr;
	
	@Autowired
	private CartService crSr;
	
	@Autowired
	private OrdersService orSr;
	
	@Transactional
	@Override
	public Customer createCustomer(Customer c) throws AlreadyExistException {	
		Optional<Customer> cus = cuRep.findById(c.getUsername());
		if(cus.isPresent())
		{
			throw new AlreadyExistException("Customer already registered!");
		}
		else
		{
		return cuRep.save(c);
		}
	}

	@Override
	public Customer checkCustomer(Customer c) throws PasswordMissmatchException, NoSuchEntityException {
		// TODO Auto-generated method stub
		String uname=c.getUsername();
		String pass=c.getPass();
		Optional<Customer> cfind=cuRep.findById(uname);
		if(cfind.isPresent()) {
			if(cfind.get().getPass().equals(pass)) {
				return c;
			}
			else
			{
				throw new PasswordMissmatchException("Wrong Password");
			}
		
		}
		else
		{
			throw new NoSuchEntityException("Customer with "+uname+" is not present");
		}

	}

	@Override
	public List<Customer> findAll() {
		return cuRep.findAll();
	}

	@Override
	@Transactional
	public Wishlist addItemToWishlist(Product p) {
		return wlSr.addItemToWishlist(p);
	}

	@Override
	@Transactional
	public Cart addProdToCart(Product p) {
		return crSr.addItemToCart(p);
	}

	@Override
	@Transactional
	public String removeCart() {
		return crSr.removeAllItems();
	}

	@Override
	public String placeOrder() {
		return orSr.makePayment();
	}

	@Override
	@Transactional
	public Cart removeProdFromCart(Product p)  {
		// TODO Auto-generated method stub
		return crSr.removeItemFromCart(p);
	}

	@Override
	@Transactional
	public Wishlist removeItemFromWishlist(Product p) {
		// TODO Auto-generated method stub
		return wlSr.removeItemFromWishlist(p);
	}

	@Override
	public String removeWishlist() {
		// TODO Auto-generated method stub
		return wlSr.removeWishlist();
	}

	@Override
	public List<Cart> getCartItems() {
		// TODO Auto-generated method stub
		return crSr.getCart();
	}

	@Override
	public List<Wishlist> getWishItems() {
		// TODO Auto-generated method stub
		return wlSr.getWishlist();
	}
	
}
