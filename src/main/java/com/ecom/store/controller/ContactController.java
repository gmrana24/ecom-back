package com.ecom.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.store.dto.ProductDTO;
import com.ecom.store.entity.Contact;
import com.ecom.store.service.ProductService;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

	private final ProductService productService;

	@Autowired
	public ContactController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ResponseEntity<String> saveContact(@RequestBody ProductDTO productDTO) {
		productService.save(productDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Request processed successfully");
	}
}
