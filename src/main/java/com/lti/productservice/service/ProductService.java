package com.lti.productservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.lti.productservice.dao.ProductDAO;
import com.lti.productservice.model.Product;
import com.lti.productservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product findByuuid(String uuid) {
		Product products = productRepository.findByuuid(uuid);
		return productRepository.findByuuid(uuid);
	}

	public Optional<Product> findOne(Long productId) {
		return productRepository.findById(productId);
		}

	public Product findByName(String name) {
		Product products = productRepository.findByName(name);
		return productRepository.findByName(name);
	}
	
	public List<Product> findAll() {
		List <Product> products = productRepository.findAll();
		System.out.println("products" + products);
		return products;
	}

}
