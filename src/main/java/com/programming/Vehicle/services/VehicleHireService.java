package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.VehicleHire;
import com.programming.Vehicle.repositories.VehicleHireRepository;

@Service
public class VehicleHireService {
	@Autowired
	private VehicleHireRepository vehicleHireRepository;
	
	
//Return list of vehicleHires
public List<VehicleHire> findAll(){
	return vehicleHireRepository.findAll();
}
// save new vehicleHires
public void save(VehicleHire vehicleHire) {
	vehicleHireRepository.save(vehicleHire);
}

// get by id
public Optional<VehicleHire> findById(int id) {
	return vehicleHireRepository.findById(id);
}
public void delete(Integer id) {
	 vehicleHireRepository.deleteById(id);

}
}
