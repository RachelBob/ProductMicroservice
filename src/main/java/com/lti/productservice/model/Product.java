package com.lti.productservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "seq_product", sequenceName = "seq_product", allocationSize = 1)
public class Product {
	
	@Id
	@GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)
	
	private Long products_id;
	
	private String name;
	
	private String description;
	
	private double price;
	
	public Product(Long products_id, String name, String description, double price) {
		this.products_id = products_id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
}
