package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Product;
import com.project.entity.Wishlist;
import com.project.service.WishlistService;

@RestController
public class WishlistController {

	@Autowired
	private WishlistService wsr;
	
	@GetMapping("/wishCont")
	public List<Wishlist> getWishlist(){
		return wsr.getWishlist();
	}
	
	@PostMapping("/wishCont/addProd")
	public void addItemToWishlist(@RequestBody Product p) {
		wsr.addItemToWishlist(p);
		return;
	}
	
	@PostMapping("/wishCont/removeProd")
	public void removeItemFromWishlist(@RequestBody Product p) {
		wsr.removeItemFromWishlist(p);
		return;
	}
}
