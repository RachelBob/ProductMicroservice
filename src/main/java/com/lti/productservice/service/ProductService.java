package com.lti.productservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.productservice.exception.ProductNotFoundException;
import com.lti.productservice.model.Product;
import com.lti.productservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product findByuuid(String uuid) {
		//Product products = productRepository.findByuuid(uuid);
		//return productRepository.findByuuid(uuid);
		Optional<Product> optionalObj1=Optional.ofNullable(productRepository.findByuuid(uuid));
		Product product = optionalObj1.orElseThrow(()->new ProductNotFoundException("Product not found with uuid : "+uuid));
		return product;
	}

	public Optional<Product> findOne(Long productId) {
		return productRepository.findById(productId);
		}

	public Product findByName(String name) {
		//Product products = productRepository.findByName(name);
		//return productRepository.findByName(name);
		Optional<Product> optionalObj1=Optional.ofNullable(productRepository.findByName(name));
		Product product = optionalObj1.orElseThrow(()->new ProductNotFoundException("Product not found with productname : "+name));
		return product;
	}
	
	public List<Product> findAll() {
		List <Product> products = productRepository.findAll();
		//System.out.println("products" + products);
		return products;
	}

}
