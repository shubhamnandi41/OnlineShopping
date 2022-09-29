package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Product;
import com.project.exception.NoSuchEntityException;
import com.project.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService prsr;
//	
//	@GetMapping("/product")
//	public List<Product> findAllProducts() throws NoSuchEntityException{
//		return prsr.getAllProducts();
//	}
//	
//	@PostMapping("/product/AddProd")
//	public void addProductsToEntity(@RequestBody Product p) {
//		prsr.addProduct(p);
//		return;
//	}
//	
//	@PostMapping("/product/RemProd")
//	public void removeProductEntity(@RequestBody Product p) throws NoSuchEntityException {
//		prsr.removeProduct(p);
//		return ;
//	}
//	
//	@PostMapping("/product/SearchProd")
//	public Product searchProdtById(@RequestBody int pid) throws NoSuchEntityException {
//		return prsr.getProductById(pid);
//	}
//	
}
