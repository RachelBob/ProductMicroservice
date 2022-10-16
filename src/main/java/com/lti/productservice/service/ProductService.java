package com.lti.productservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.productservice.dao.ProductDAO;
import com.lti.productservice.model.Product;
import com.lti.productservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public ProductDAO findOne(Long productId) {
		return productRepository.findById(productId).map(ProductDAO::of).orElse(null);
	}

	public List<ProductDAO> findByName(String name) {
		List<Product> products = productRepository.findByName(name);
		return products.stream().map(ProductDAO::of).collect(Collectors.toList());
	}

}
