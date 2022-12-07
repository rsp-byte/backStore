package com.audisoft.crud.application.repository;


import com.audisoft.crud.domain.Product;

import java.util.List;

public interface ProductRepository {

	public Product findById(Long id);
	
	public void saveProduct(Product product);
	
	public List<Product> getAllProduct();

	public Product updateProduct(Long id, Product product);
}
