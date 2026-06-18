package com.ecom.store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.store.dto.ProductDTO;
import com.ecom.store.entity.Product;
import com.ecom.store.repository.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<ProductDTO> getProducts() {
		return productRepository.findAll().stream().map(this::transformToDTO).collect(Collectors.toList());
	}

	public ProductDTO transformToDTO(Product product) {
		ProductDTO productDTO = new ProductDTO();
		BeanUtils.copyProperties(product, productDTO);
		productDTO.setProductId(product.getProductId());
		return productDTO;
	}
}
