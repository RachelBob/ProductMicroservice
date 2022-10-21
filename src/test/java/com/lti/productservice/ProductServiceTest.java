package com.lti.productservice;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.productservice.model.Product;
import com.lti.productservice.repository.ProductRepository;
import com.lti.productservice.service.ProductService;

@SpringBootTest
public class ProductServiceTest {
	
	@InjectMocks
	ProductService productservice;
	
	@Mock
	ProductRepository productRepository;
	
	@Test
	public void getProductById() {
		when(productRepository.findById(1L)).thenReturn(createProductItemStub());
	}

	private Optional<Product> createProductItemStub(){
		
		return null;
	}
}
