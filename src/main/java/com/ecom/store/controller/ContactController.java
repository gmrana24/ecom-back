package com.ecom.store.controller;

import java.util.List;

import com.ecom.store.dto.ContactDTO;
import com.ecom.store.service.ContactService;
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

	private final ContactService contactService;

	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@PostMapping
	public ResponseEntity<String> saveContact(@RequestBody ContactDTO contactDTO) {
		contactService.save(contactDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body("Request processed successfully");
	}
}
