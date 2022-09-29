package com.project.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Orders_Details")
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	
	private LocalDate orderDate;
	private String orderStatus;
	private int total;
	private String Productanme;
	private int ProductQuantity;
	
	public String getProductanme() {
		return Productanme;
	}

	public void setProductanme(String productanme) {
		Productanme = productanme;
	}

	public int getProductQuantity() {
		return ProductQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	
//	@OneToMany(cascade=CascadeType.ALL)
//	private List<Product> prdlist=new ArrayList<Product>();
//	
//	@OneToOne(cascade=CascadeType.ALL)
//	private Cart cart;
//	
//	@ManyToOne
//	@JoinColumn(name="CustomerUsername")
//	private Customer cust;
//	
//	public List<Product> getPrdlist() {
//		return prdlist;
//	}
//
//	public void setPrdlist(List<Product> prdlist) {
//		this.prdlist = prdlist;
//	}
//
//	public Cart getCart() {
//		return cart;
//	}
//
//	public void setCart(Cart cart) {
//		this.cart = cart;
//	}
//	public Customer getCust() {
//		return cust;
//	}
//
//	public void setCust(Customer cust) {
//		this.cust = cust;
//	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", total="
				+ total + ", Productanme=" + Productanme + ", ProductQuantity=" + ProductQuantity + "]";
	}

	
}
