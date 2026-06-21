package com.ecom.store.entity;

import java.time.Instant;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import lombok.Data;

@Data
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
	@CreatedDate
	@Column(updatable = false)
	private Instant createdAt;

	@CreatedBy
	@Column(updatable = false)
	private String createdBy;

	@UpdateTimestamp
	@LastModifiedDate
	@Column(insertable = false)
	private Instant updatedAt;

	@LastModifiedBy
	@Column(insertable = false)
	private String updatedBy;
}
