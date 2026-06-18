package com.ecom.store.entity;

import java.math.BigDecimal;
import java.time.Instant;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	private String name;

	private String description;

	private BigDecimal price;

	private Integer popularity;

	private String imageUrl;

	@ColumnDefault("CURRENT_TIMESTAMP")
	private Instant createdAt;

	private String createdBy;

	@ColumnDefault("NULL")
	private Instant updatedAt;

	@ColumnDefault("NULL")
	private String updatedBy;
}
