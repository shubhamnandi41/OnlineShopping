package com.project.service;

import java.util.List;

import com.project.entity.Admin;
import com.project.entity.Product;
import com.project.entity.Retailer;
import com.project.exception.AlreadyExistException;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;

public interface AdminService {

	public List<Admin> getAdmin();
	public Admin verifyAdmin(Admin a) throws NoSuchEntityException, PasswordMissmatchException;
	public Retailer addRetailer(Retailer ret) throws AlreadyExistException;
	public Retailer removeRetailer(Retailer ret) throws NoSuchEntityException;
	public List<Product> getAllProducts();
	public List<Retailer> getRetailers();
}
