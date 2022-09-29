package com.project.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Table")
public class Customer {

	
	@Id
	private String username;
	
	private String pass;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	@OneToOne
	private Cart cart;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="Carts")
//	private List<Cart> cart=new ArrayList<Cart>();
//
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="Orders")
//	private List<Orders> ordList=new ArrayList<Orders>();
//
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="Wishlist")
//	private List<Wishlist> wish=new ArrayList<Wishlist>();
//	
//	public List<Wishlist> getWish() {
//		return wish;
//	}
//	public void setWish(List<Wishlist> wish) {
//		this.wish = wish;
//	}
//	public List<Cart> getCart() {
//		return cart;
//	}
//	public void setCart(List<Cart> cart) {
//		this.cart = cart;
//	}
//	public List<Orders> getOrdList() {
//		return ordList;
//	}
//	public void setOrdList(List<Orders> ordList) {
//		this.ordList = ordList;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String username, String pass, String firstName, String lastName, String phone, String address) {
		super();
		this.username = username;
		this.pass = pass;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [username=" + username + ", pass=" + pass + ", firstName=" + firstName + ", lastName="
				+ lastName + ", phone=" + phone + ", address=" + address +  "]";
	}
	
	
}
