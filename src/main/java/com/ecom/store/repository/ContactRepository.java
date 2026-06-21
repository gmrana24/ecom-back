package com.ecom.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.store.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
