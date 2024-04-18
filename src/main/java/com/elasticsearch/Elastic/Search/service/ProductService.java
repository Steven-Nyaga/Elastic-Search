package com.elasticsearch.Elastic.Search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elasticsearch.Elastic.Search.models.Product;
import com.elasticsearch.Elastic.Search.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Iterable<Product> getProducts() {
		return repository.findAll();
	}
	
	public Product insertProduct(Product product) {
		return repository.save(product);
	}
	
	public Product updateProduct(Product product, int id) {
		Product product1 = repository.findById(id).get();
		product1.setPrice(product.getPrice());
		return product1;
	}
	
	public void deleteProduct(int id) {
		repository.deleteById(id);
	}
	
}
