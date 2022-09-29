package com.project.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.dao.ProductRepository;
import com.project.entity.Product;
import com.project.exception.NoSuchEntityException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prRep;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prRep.findAll();
	}

	@Override
	@Transactional
	public Product addProduct(Product p) {
		return prRep.save(p);
				
	}

	@Override
	@Transactional
	public Product removeProduct(Product p) {
		prRep.delete(p);
		return p;
	}

	@Override
	public Product getProductById(int pid) throws NoSuchEntityException {
		Optional<Product> pFind = prRep.findById(pid);
		Product prod = null;
		if(pFind.isPresent()) {
			prod = pFind.get();
		}
		else {
			throw new NoSuchEntityException("Product not found");
		}
		return prod;
	}

	

}
