package com.project.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Retailer_Details")
public class Retailer {

	@Id
	private String username;
	private String retailerPass;
	private String retailerName;
	private String retailerAddress;
	private String retailerPhone;
	public String getRetailerPass() {
		return retailerPass;
	}

	public void setRetailerPass(String retailerPass) {
		this.retailerPass = retailerPass;
	}

	public String getRetailerAddress() {
		return retailerAddress;
	}

	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}

	public String getRetailerPhone() {
		return retailerPhone;
	}

	public void setRetailerPhone(String retailerPhone) {
		this.retailerPhone = retailerPhone;
	}

	
	
	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retailer(String username, String retailerPass, String retailerName, String retailerAddress,
			String retailerPhone) {
		super();
		this.username = username;
		this.retailerPass = retailerPass;
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
		this.retailerPhone = retailerPhone;
	}



	@OneToMany
	@JsonIgnore
	private List<Product> prdList;

	public List<Product> getPrdList() {
		return prdList;
	}

	public void setPrdList(List<Product> prdList) {
		this.prdList = prdList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	

	@Override
	public String toString() {
		return "Retailer [username=" + username + ", retailerPass=" + retailerPass + ", retailerName=" + retailerName
				+ ", retailerAddress=" + retailerAddress + ", retailerPhone=" + retailerPhone + "]";
	}

	

	
}
