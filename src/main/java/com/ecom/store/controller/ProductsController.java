package com.ecom.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.store.dto.ProductDTO;
import com.ecom.store.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductsController {

	private final ProductService productService;

	@Autowired
	public ProductsController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public List<ProductDTO> getProducts() {
		return productService.getProducts();
	}

}
