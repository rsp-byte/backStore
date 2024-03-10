package com.audisoft.crud.application.service;

import java.util.List;

import com.audisoft.crud.application.repository.CommentRepository;
import com.audisoft.crud.application.repository.ProductRepository;
import com.audisoft.crud.domain.Comment;
import com.audisoft.crud.domain.Product;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;
	private final CommentRepository commentRepository;

	public Product getProduct(Long id){
		return productRepository.findById(id);
	}
	
	public void saveProduct(Product product){
	 productRepository.saveProduct(product);
	}
	
	public List<Product> getAllProduct(){
		 return productRepository.getAllProduct();
	}
	
	public void updateProduct(Long id , Product product){productRepository.updateProduct(id, product);}
	
	public void deleteProduct(Long id) {productRepository.deleteProduct(id);}
	
	public void saveComments(Comment comment) {commentRepository.saveComment(comment);}

}
