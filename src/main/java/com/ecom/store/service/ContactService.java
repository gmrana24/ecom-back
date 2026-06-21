package com.ecom.store.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.store.dto.ContactDTO;
import com.ecom.store.entity.Contact;
import com.ecom.store.repository.ContactRepository;

@Service
public class ContactService {
	private final ContactRepository contactRepository;

	@Autowired
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}

	public boolean save(ContactDTO contactDTO) {
		Contact contact = transformToEntity(contactDTO);
		contactRepository.save(contact);
		return true;
	}

	public Contact transformToEntity(ContactDTO contactDTO) {
		Contact contact = new Contact();
		BeanUtils.copyProperties(contactDTO, contact);
		return contact;
	}
}
