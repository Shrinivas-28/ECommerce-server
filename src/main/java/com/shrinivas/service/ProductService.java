package com.shrinivas.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.shrinivas.exception.ProductException;
import com.shrinivas.modal.Product;
import com.shrinivas.request.CreateProductRequest;
import com.shrinivas.user.domain.ProductSubCategory;

public interface ProductService {

	public Product createProduct(CreateProductRequest req) throws ProductException;

	public String deleteProduct(Long productId) throws ProductException;

	public Product updateProduct(Long productId, Product product) throws ProductException;

	public List<Product> getAllProducts();

	public Product findProductById(Long id) throws ProductException;

	public List<Product> findProductByCategory(String category);

	public List<Product> searchProduct(String query);

	public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize);

	public List<Product> recentlyAddedProduct();

}
