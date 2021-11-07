package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.Contact;
import com.programming.Vehicle.repositories.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
	
	
//Return list of contacts
public List<Contact> findAll(){
	return contactRepository.findAll();
}
// save new contacts
public void save(Contact contact) {
	contactRepository.save(contact);
}

// get by id
public Optional<Contact> findById(int id) {
	return contactRepository.findById(id);
}
public void delete(Integer id) {
	 contactRepository.deleteById(id);

}
}
