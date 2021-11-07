package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.Invoice;
import com.programming.Vehicle.repositories.InvoiceRepository;

@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	
//Return list of invoices
public List<Invoice> findAll(){
	return invoiceRepository.findAll();
}
// save new invoices
public void save(Invoice invoice) {
	invoiceRepository.save(invoice);
}

// get by id
public Optional<Invoice> findById(int id) {
	return invoiceRepository.findById(id);
}
public void delete(Integer id) {
	 invoiceRepository.deleteById(id);

}
}
