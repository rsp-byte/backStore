package com.audisoft.crud.infrastructure;


import com.audisoft.crud.application.service.ProductService;
import com.audisoft.crud.domain.Product;
import com.audisoft.crud.infrastructure.dto.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping("/producto/{id}")
	public ResponseEntity<ProductDto> getUserById(@PathVariable Long id) {
		return new ResponseEntity<>(modelMapper.map((productService.getProduct(id)), ProductDto.class), HttpStatus.OK);
	}

	@PostMapping("/producto")
	public ResponseEntity<ProductDto> saveUser(@RequestBody ProductDto productDto) {
		productService.saveProduct(modelMapper.map(productDto, Product.class));
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
	
	@GetMapping("/productos")
	public ResponseEntity<List<ProductDto>> getProducts() {
		List<Product> pe = productService.getAllProduct();
		List<ProductDto> p = new ArrayList<>();
		pe.forEach(pep-> p.add(modelMapper.map(pep, ProductDto.class)));
		return new ResponseEntity<>(p, HttpStatus.OK);
	}

	@PutMapping("producto/{id}")
	public ResponseEntity<ProductDto> updateProduct(@PathVariable Long id , @RequestBody ProductDto productDto){
		productService.updateProduct(id,modelMapper.map(productDto,Product.class));
		return new ResponseEntity<>( modelMapper.map((productService.getProduct(id)), ProductDto.class), HttpStatus.ACCEPTED);
	}

}
