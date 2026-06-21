package com.ecom.store.entity;

import java.math.BigDecimal;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Data
@Table(name = "products")
public class Product extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	private String name;

	private String description;

	private BigDecimal price;

	private Integer popularity;

	private String imageUrl;
}
