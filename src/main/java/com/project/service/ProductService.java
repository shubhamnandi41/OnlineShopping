package com.project.service;

import java.util.List;

import com.project.entity.Product;
import com.project.exception.NoSuchEntityException;

public interface ProductService {
	
	public List<Product> getAllProducts();
	public Product addProduct(Product p);
	public Product removeProduct(Product p) throws NoSuchEntityException;
	public Product getProductById(int pid) throws NoSuchEntityException ;
	
}
