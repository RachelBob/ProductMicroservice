package com.lti.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.productservice.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productservice;

	@RequestMapping(value = "/{productId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity get(@PathVariable String productId) {
		return ResponseEntity.ok(productservice.findOne(Long.parseLong(productId)));
	}
	
	@RequestMapping(value = "/findbyname/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity findByName(@PathVariable String name) {
		return ResponseEntity.ok( productservice.findByName( name ) );
		
	}

}
