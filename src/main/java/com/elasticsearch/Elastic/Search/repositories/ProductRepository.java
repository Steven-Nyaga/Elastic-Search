package com.elasticsearch.Elastic.Search.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.elasticsearch.Elastic.Search.models.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {

}
