package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.WishlistRepository;
import com.project.entity.Product;
import com.project.entity.Wishlist;

@Service
public class WishlistServiceImpl implements WishlistService {

	@Autowired
	private WishlistRepository wlRepo;
	
	@Override
	public List<Wishlist> getWishlist() {
		// TODO Auto-generated method stub
		return wlRepo.findAll();
	}

	@Override
	@Transactional
	public Wishlist addItemToWishlist(Product p) {
		String productName=p.getProdName();
		Wishlist wish=new Wishlist();
		wish.setProductName(productName);
		wlRepo.save(wish);
		return wish;		
	}

	@Override
	@Transactional
	public Wishlist removeItemFromWishlist(Product p) {
		List<Wishlist> wl=wlRepo.findAll();
		for(Wishlist w:wl){
			if(w.getProductName().equals(p.getProdName())) {
				wlRepo.delete(w);
				return w;
			}
		}
		return null;
 	}

	@Override
	@Transactional
	public String removeWishlist() 
	{
		wlRepo.deleteAll();
		return "wishlist removed";
		
	}

}
