package com.project.service;

import java.util.List;

import com.project.entity.Product;
import com.project.entity.Wishlist;

public interface WishlistService {

	public List<Wishlist> getWishlist();
	public Wishlist addItemToWishlist(Product p);
	public Wishlist removeItemFromWishlist(Product p);
	public String removeWishlist();
}
