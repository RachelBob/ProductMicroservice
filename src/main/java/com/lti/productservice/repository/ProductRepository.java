
package com.lti.productservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.lti.productservice.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	//<Product>  findByProductId(Long productId);
	
	Product findByuuid(String uuid);
    
	Product findByName(String name);
	
	List<Product> findAll();

}
