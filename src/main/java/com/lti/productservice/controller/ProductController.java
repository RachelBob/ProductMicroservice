package com.lti.productservice.controller;


import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.productservice.model.Product;
import com.lti.productservice.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private ProductService productservice;
	
	@RequestMapping(value = "/findbyuuid/{uuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> findByuuid(@PathVariable String uuid) {
		logger.info("Product Controller :: getProductByuuid : UUID -> " + uuid);
		return ResponseEntity.ok(productservice.findByuuid( uuid ));
	}

	@RequestMapping(value = "/findbyid/{productId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Product>> get(@PathVariable String productId) {
		logger.info("Product Controller :: getProductById : Product ID -> " + productId);
		return ResponseEntity.ok(productservice.findOne(Long.parseLong(productId)));
	}
	
	@RequestMapping(value = "/findbyname/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> findByName(@PathVariable String name) {
		logger.info("Product Controller :: getProductByName : Name -> " + name);
		return ResponseEntity.ok( productservice.findByName( name ) );
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findAll() {
		logger.info("Product Controller :: getAllProduct : AllProduct ->");
		return ResponseEntity.ok( productservice.findAll() );
		
	}

}
