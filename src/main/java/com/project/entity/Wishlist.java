package com.project.entity;

import java.util.ArrayList;
import java.util.List;

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
@Table(name="Wishlist_Details")
public class Wishlist {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int wishlistId;
	
	private String productName;


	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "CustomerUsername")
//	private Customer cust;
//	 
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="ProductID")
//	private List<Product> prdList=new ArrayList<Product>();
	
//	public Customer getCust() {
//		return cust;
//	}
//
//	public void setCust(Customer cust) {
//		this.cust = cust;
//	}
//
//	public List<Product> getOrdList() {
//		return prdList;
//	}
//
//	public void setOrdList(List<Product> ordList) {
//		this.prdList = ordList;
//	}

	@Override
	public String toString() {
		return "Wishlist [wishlistId=" + wishlistId + ", productName=" + productName + "]";
	}
	
	
	
}
