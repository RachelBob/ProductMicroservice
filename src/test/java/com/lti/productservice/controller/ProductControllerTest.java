package com.lti.productservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.lti.productservice.model.Product;
import com.lti.productservice.repository.ProductRepository;
import com.lti.productservice.service.ProductService;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {
	@Autowired
    private MockMvc mvc;
	@MockBean
	private ProductService productservice;
	
	@Mock
	ProductRepository prodRepo;
	
	@Test
	 void findByuuidTest() throws Exception {
		Product product= new Product();
		product.setName("Test");
		product.setProducts_id(1L);
		when(productservice.findByuuid("1")).thenReturn(product);
		mvc.perform(get("/products/findbyuuid/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	
	@Test
	 void getTest() throws Exception {
		Product product= new Product();
		product.setName("Test");
		product.setProducts_id(1L);
		when(productservice.findOne(1L)).thenReturn(Optional.of(product));
		mvc.perform(get("/products/findbyid/1").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	
	@Test
	 void findByNameTest() throws Exception {
		Product product= new Product();
		product.setName("Test");
		product.setProducts_id(1L);
		when(productservice.findByName("test")).thenReturn(product);
		mvc.perform(get("/products/findbyname/test").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
	
	@Test
	 void findAllTest() throws Exception {
		Product product= new Product();
		product.setName("Test");
		product.setProducts_id(1L);
		Product product1= new Product();
		product.setName("Test");
		product.setProducts_id(2L);
		when(productservice.findAll()).thenReturn(Arrays.asList(product,product1));
		mvc.perform(get("/products/findall").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
	}
}
