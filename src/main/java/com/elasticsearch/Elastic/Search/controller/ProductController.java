package com.elasticsearch.Elastic.Search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elasticsearch.Elastic.Search.models.Product;
import com.elasticsearch.Elastic.Search.service.ProductService;

@RestController
@RequestMapping("/apis")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/find-all")
	Iterable<Product> findAll() {
		return productService.getProducts();
	}
	
	@PostMapping("/insert")
	public Product insertProduct(@RequestBody Product product) {
		return productService.insertProduct(product);
	}
	
}
