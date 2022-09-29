package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product_Details")
public class Product {

	@Id
	private int prodId;
	
	private String prodName;
	private int prodprice;
	private int prodQuantity;
	private String prodImage;
	private String prodCategory;
	private String prodDescription;
	

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public String getProdImage() {
		return prodImage;
	}

	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}

	

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdprice() {
		return prodprice;
	}

	public void setProdprice(int prodprice) {
		this.prodprice = prodprice;
	}

	public int getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
//
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int prodId, String prodName, int prodprice, int prodQuantity, String prodImage, String prodCategory,
			String prodDescription) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodprice = prodprice;
		this.prodQuantity = prodQuantity;
		this.prodImage = prodImage;
		this.prodCategory = prodCategory;
		this.prodDescription = prodDescription;
		
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodprice=" + prodprice + ", prodQuantity="
				+ prodQuantity + ", prodImage=" + prodImage + ", prodCategory=" + prodCategory + ", prodDescription="
				+ prodDescription + "]";
	}

}
