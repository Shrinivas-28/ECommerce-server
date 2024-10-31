package com.shrinivas.service;

import java.util.List;

import com.shrinivas.exception.ProductException;
import com.shrinivas.modal.Rating;
import com.shrinivas.modal.User;
import com.shrinivas.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
