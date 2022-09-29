package com.project.service;

import java.util.List;

import com.project.entity.Product;
import com.project.entity.Retailer;
import com.project.exception.NoSuchEntityException;

public interface RetailerService {

//	public List<Retailer> getRetailers();
	public Retailer findRetailer(String username) throws NoSuchEntityException;
	public Product addProdToProducts(Product p);
	public Product removeProdFromProducts(Product p) throws NoSuchEntityException;
	public Product findProdByPid(int pid) throws NoSuchEntityException;
	public Retailer removeRetailer(Retailer ret) throws NoSuchEntityException;
	public List<Product> getAllProducts();
//	public Retailer addRetailer(Retailer r);
}
