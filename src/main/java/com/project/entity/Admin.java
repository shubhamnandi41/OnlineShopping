package com.project.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Admin_Details")
public class Admin {
	
	@Id
	private String username;
	
	private String password; 
	
	
//	public Admin(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//
//	@OneToMany
//	@JsonIgnore
//	private List<Retailer> retlist=new ArrayList<Retailer>();

//	@OneToMany(cascade=CascadeType.ALL)
//	private List<Product> prd=new ArrayList<Product>();
	
//	public List<Product> getPrd() {
//		return prd;
//	}
//
//	public void setPrd(List<Product> prd) {
//		this.prd = prd;
//	}
//
//	public List<Retailer> getRetlist() {
//		return retlist;
//	}
//
//	public void setRetlist(List<Retailer> retlist) {
//		this.retlist = retlist;
//	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}

	
	
}
