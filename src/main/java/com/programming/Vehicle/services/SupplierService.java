package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.Supplier;
import com.programming.Vehicle.repositories.SupplierRepository;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	
	
//Return list of suppliers
public List<Supplier> findAll(){
	return supplierRepository.findAll();
}
// save new suppliers
public void save(Supplier supplier) {
	supplierRepository.save(supplier);
}

// get by id
public Optional<Supplier> findById(int id) {
	return supplierRepository.findById(id);
}
public void delete(Integer id) {
	 supplierRepository.deleteById(id);

}
}
