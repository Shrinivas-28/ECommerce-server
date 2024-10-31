package com.shrinivas.service;

import java.util.List;

import com.shrinivas.exception.ProductException;
import com.shrinivas.modal.Review;
import com.shrinivas.modal.User;
import com.shrinivas.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
