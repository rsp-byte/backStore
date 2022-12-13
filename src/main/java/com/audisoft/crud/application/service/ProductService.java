package com.audisoft.crud.application.service;

import java.util.List;

import com.audisoft.crud.application.repository.ProductRepository;
import com.audisoft.crud.domain.Product;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;

	public Product getProduct(Long id){
		return productRepository.findById(id);
	}
	
	public void saveProduct(Product product){
	 productRepository.saveProduct(product);
	}
	
	public List<Product> getAllProduct(){
		 return productRepository.getAllProduct();
	}
	
	public Product updateProduct(Long id , Product product){
		return productRepository.updateProduct(id, product);
	}
}
