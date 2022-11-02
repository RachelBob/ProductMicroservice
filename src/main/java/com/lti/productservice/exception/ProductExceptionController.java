package com.lti.productservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ProductExceptionController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> customerNotFoundException(ProductNotFoundException exception ){
		ExceptionResponse response=new ExceptionResponse();
		response.setErrorCode(HttpStatus.NOT_FOUND.toString());
		response.setErrorMessage(exception.getMessage());
		return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}

}
