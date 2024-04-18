package com.elasticsearch.Elastic.Search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
