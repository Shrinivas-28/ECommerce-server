package com.shrinivas.service;

import com.shrinivas.exception.CartItemException;
import com.shrinivas.exception.UserException;
import com.shrinivas.modal.Cart;
import com.shrinivas.modal.CartItem;
import com.shrinivas.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
