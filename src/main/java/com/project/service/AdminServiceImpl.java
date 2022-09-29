package com.project.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AdminRepository;
import com.project.dao.CustomerRepository;
import com.project.dao.RetailerRepository;
import com.project.entity.Admin;
import com.project.entity.Customer;
import com.project.entity.Product;
import com.project.entity.Retailer;
import com.project.exception.AlreadyExistException;
import com.project.exception.NoSuchEntityException;
import com.project.exception.PasswordMissmatchException;

@Service
public class AdminServiceImpl implements AdminService{
		
	@Autowired
	private AdminRepository adRep;
	
	@Autowired
	private RetailerService retSr;
	
	@Autowired
	private ProductService prSr;
	
	@Autowired
	private RetailerRepository reRepo;

	@Override
	public Admin verifyAdmin(Admin a) throws NoSuchEntityException, PasswordMissmatchException{
		// TODO Auto-generated method stub
		String uname=a.getUsername();
		String pass=a.getPassword();
		Optional<Admin> afind=adRep.findById(uname);
		if(afind.isPresent()) {
			if(afind.get().getPassword().equals(pass)) {
				return a;
			}
			else
			{
				throw new PasswordMissmatchException("Wrong Password");
			}
		
		}
		else
		{
			throw new NoSuchEntityException("Admin with "+uname+" is not present");
		}
		
	}

	@Override
	@Transactional
	public Retailer addRetailer(Retailer ret)throws AlreadyExistException {
		Optional<Retailer> r = reRepo.findById(ret.getUsername());
		if(r.isPresent())
		{
			throw new AlreadyExistException("Retailer already registered!");
		}
		else
		{
		return reRepo.save(ret);
		}
	}

	@Override
	@Transactional
	public Retailer removeRetailer(Retailer ret) throws NoSuchEntityException {	//to be done
		// TODO Auto-generated method stub
		return retSr.removeRetailer(ret);
	}

	@Override
	public List<Product> getAllProducts(){
		// TODO Auto-generated method stub
		return prSr.getAllProducts();
	}
	
	@Override
	public List<Retailer> getRetailers() {
		// TODO Auto-generated method stub
		return reRepo.findAll();
	}

	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return adRep.findAll();
	}

	

}
