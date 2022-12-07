package com.audisoft.crud;

import com.audisoft.crud.application.repository.ProductRepository;
import com.audisoft.crud.application.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrudApplicationConfig {

	 @Bean
	  public ProductService productService(ProductRepository productRepository) {
	    return new ProductService(productRepository);
	  }

}
