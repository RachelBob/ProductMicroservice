
package com.lti.productservice.dao;

import com.lti.productservice.model.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder

@NoArgsConstructor

@AllArgsConstructor
public class ProductDAO {

	private Long products_id;
	private String name;
	private String description;
	private double price;
	
	public Product toEntity() {
		return new Product(products_id, name, description, price);
	}

	public static ProductDAO of(Product product) {
		//return new ProductDAO(product.getProducts_id(), product.getName(), product.getDescription(), product.getPrice());
		return new ProductDAO();
	}

}
