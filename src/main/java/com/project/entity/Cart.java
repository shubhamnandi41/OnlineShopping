package com.project.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cart_Details")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cartID;
	
	private String prodName;
	private int prodQuantity;
	private int prodPrice;
	private int totalPrice;
	private String prodImage;

	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}

	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	
	
	
	
//	@OneToMany()
//	private List<Product> prdList=new ArrayList<Product>();
//	
//	@OneToOne()
//	private Orders ord;
//			
//	@OneToOne
//	private Customer cust;
//	public List<Product> getPrdset() {
//		return prdList;
//	}
//	public void setPrdset(List<Product> prdset) {
//		this.prdList = prdset;
//	}
//	public Orders getOrd() {
//		return ord;
//	}
//	public void setOrd(Orders ord) {
//		this.ord = ord;
//	}
//	public List<Product> getPrdList() {
//	return prdList;
//}
//public void setPrdList(List<Product> prdList) {
//	this.prdList = prdList;
//}
//
//public Customer getCust() {
//	return cust;
//}
//public void setCust(Customer cust) {
//	this.cust = cust;
//}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Cart [cartID=" + cartID + ", prodName=" + prodName + ", prodQuantity=" + prodQuantity + ", prodPrice="
				+ prodPrice + ", totalPrice=" + totalPrice + ", prodImage=" + prodImage + "]";
	}
	
	
		


	

}
