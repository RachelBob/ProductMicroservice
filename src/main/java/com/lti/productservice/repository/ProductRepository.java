
package com.lti.productservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lti.productservice.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByName(String name);

}
