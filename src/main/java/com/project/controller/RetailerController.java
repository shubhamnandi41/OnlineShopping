package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Product;
import com.project.entity.Retailer;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;
import com.project.service.RetailerService;


@RestController
public class RetailerController {

	@Autowired
	private RetailerService rsr;
	
	
	
//	@GetMapping("/retailer")
//	public List<Retailer> findAllRetailers(){	//checked
//		return rsr.getRetailers();
//	}
	
	@GetMapping("/retailer/findProd/{pid}")
	public Product findProdById(@PathVariable("pid")  int pid) throws NoSuchEntityException{	//checked
		return rsr.findProdByPid(pid);
	}
	
	@GetMapping("/retailer/Products")
	public List<Product> getProducts(){	//checked
		return rsr.getAllProducts();
	}
	
	@PostMapping("/retailer/FindRet")
	public Retailer getRetailerByUname(@RequestParam  String username) throws NoSuchEntityException {	//checked
		return rsr.findRetailer(username);
	}
	
	@PostMapping("/retailer/AddProducts")
	public Product addIntoProducts(@RequestBody Product p)	//checked
	{
		return rsr.addProdToProducts(p);
		
	}
//	@PostMapping("/retailer/AddRetailer")
//	public Retailer addRetailer(@RequestBody Retailer p) {
//		return rsr.addRetailer(p);
//	}
	
	@PostMapping("/retailer/DeleteProducts")
	public Product removeFromProducts(@RequestBody Product p) throws NoSuchEntityException{	//checked
		return rsr.removeProdFromProducts(p);
		
	}
	
	@PostMapping("/retailer/retLogin")
	public Retailer verifyReatiler(@RequestBody Retailer a) throws NoSuchEntityException, PasswordMissmatchException {	//checked
		return rsr.findRetailer(a.getUsername());
		
	}
	
}