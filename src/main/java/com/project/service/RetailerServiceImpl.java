package com.project.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ProductRepository;
import com.project.dao.RetailerRepository;
import com.project.entity.Product;
import com.project.entity.Retailer;
import com.project.exception.NoSuchEntityException;

@Service
public class RetailerServiceImpl implements RetailerService{

	@Autowired
	private RetailerRepository reRepo;
	
	@Autowired
	private ProductServiceImpl prSr;
	
	@Autowired
	private ProductRepository proRepo;
	
	

	@Override
	public Retailer findRetailer(String username) throws NoSuchEntityException{
		// TODO Auto-generated method stub
		Optional<Retailer> rFind = reRepo.findById(username);
		Retailer ret = null;
		if(rFind.isPresent()) {
			ret = rFind.get();
			reRepo.delete(ret);
		}
		else {
			throw new NoSuchEntityException("Retailer Not Found");
		}
		return ret;
	}

	@Override
	@Transactional
	public Product addProdToProducts(Product p) {
		return prSr.addProduct(p);
		 
	}

	@Override
	@Transactional
	public Product removeProdFromProducts(Product p) throws NoSuchEntityException{	
		Optional<Product> pro = proRepo.findById(p.getProdId());
		
		if(pro.isPresent())
		{
			prSr.removeProduct(p);
		}
		else
		{
			throw new NoSuchEntityException("Product not present");
		}
		return p;
	}

//	@Override
//	@Transactional
//	public Retailer addRetailer(Retailer r) {
//		// TODO Auto-generated method stub
//		return reRepo.save(r);
//	}

	@Override
	@Transactional
	public Retailer removeRetailer(Retailer r) throws NoSuchEntityException {		
		// TODO Auto-generated method stub
		Optional<Retailer> ret2 = reRepo.findById(r.getUsername());
		
		if(ret2.isPresent())
		{
			
			reRepo.delete(r);
		}
		else
		{
			throw new NoSuchEntityException("Retailer not present");
		}
		return r;
	}

	@Override
	public Product findProdByPid(int pid) throws NoSuchEntityException {
		// TODO Auto-generated method stub
		Product p =  prSr.getProductById(pid);
		if(p==null)
			throw new NoSuchEntityException("No such Product Exists");
		return p;
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prSr.getAllProducts();
	}

}
