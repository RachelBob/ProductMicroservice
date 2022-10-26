package com.lti.productservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
//@AllArgsConstructor
@SequenceGenerator(name = "seq_product", sequenceName = "seq_product", allocationSize = 1)
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)
	private Long products_id;
	private String name;
	private String description;
	private double price;
	private String uuid;
	private String category;
	private double rating;
	private String imagesrc;
	
	public Product(Long products_id, String name, String description, double price, String uuid, String category, double rating, String imagesrc) {
		this.products_id = products_id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.uuid = uuid;
		this.category = category;
		this.rating = rating;
		this.imagesrc = imagesrc;
	}
    @JsonIgnore
    public Long getProducts_id() {
        return products_id;
    }
	
	
}
