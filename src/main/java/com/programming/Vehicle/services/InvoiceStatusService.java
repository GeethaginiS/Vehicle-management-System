package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.InvoiceStatus;
import com.programming.Vehicle.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
	
	
//Return list of invoiceStatuss
public List<InvoiceStatus> findAll(){
	return invoiceStatusRepository.findAll();
}
// save new invoiceStatuss
public void save(InvoiceStatus invoiceStatus) {
	invoiceStatusRepository.save(invoiceStatus);
}

// get by id
public Optional<InvoiceStatus> findById(int id) {
	return invoiceStatusRepository.findById(id);
}
public void delete(Integer id) {
	 invoiceStatusRepository.deleteById(id);

}
}
