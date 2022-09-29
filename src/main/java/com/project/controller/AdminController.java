package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Admin;
import com.project.entity.Customer;
import com.project.entity.Product;
import com.project.entity.Retailer;
import com.project.exception.AlreadyExistException;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;
import com.project.service.AdminService;
import com.project.service.CustomerService;
//import com.project.service.AdminServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {
	
	@Autowired
	private AdminService asr;
	
	@Autowired
	private CustomerService csr;
	
	@GetMapping("/admin")
	public List<Admin> getAdmin(){	//checked
		return asr.getAdmin();
	}
	
	@GetMapping("/admin/Products")
	public List<Product> getProducts(){	//checked
		return asr.getAllProducts();
	}
	
	@GetMapping("/admin/Retailers")
	public List<Retailer> getAllRetailers(){	//checked
		return asr.getRetailers();
	}
	
	@PostMapping("/admin/Login")
	public Admin verifyAdmin(@RequestBody Admin a) throws NoSuchEntityException, PasswordMissmatchException {	//checked
		return asr.verifyAdmin(a);
		
	} 
	
	@PostMapping("/admin/AddRetailer")
	public Retailer addRetailer(@RequestBody Retailer r) throws AlreadyExistException {	//checked
		return asr.addRetailer(r);
	}
	
	@PostMapping("/admin/RemoveRetailer")
	public Retailer removeRetailer(@RequestBody Retailer r) throws NoSuchEntityException {	//checked
		return asr.removeRetailer(r);
	} 
	
//	@GetMapping("/admin/Customers")
//	public List<Customer> getAllCustomers(){	//checked
//		return csr.findAll();
//	}
}