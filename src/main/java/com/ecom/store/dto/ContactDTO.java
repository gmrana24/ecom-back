package com.ecom.store.dto;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Data;

@Data
public class ContactDTO {
	private String name;
	private String email;
	private String mobileNumber;
	private String message;
}
