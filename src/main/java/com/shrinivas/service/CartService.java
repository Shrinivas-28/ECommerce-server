package com.shrinivas.service;

import com.shrinivas.exception.ProductException;
import com.shrinivas.modal.Cart;
import com.shrinivas.modal.CartItem;
import com.shrinivas.modal.User;
import com.shrinivas.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
