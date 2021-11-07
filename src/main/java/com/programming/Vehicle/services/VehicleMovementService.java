package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.VehicleMovement;
import com.programming.Vehicle.repositories.VehicleMovementRepository;

@Service
public class VehicleMovementService {
	@Autowired
	private VehicleMovementRepository vehicleMovementRepository;
	
	
//Return list of vehicleMovements
public List<VehicleMovement> findAll(){
	return vehicleMovementRepository.findAll();
}
// save new vehicleMovements
public void save(VehicleMovement vehicleMovement) {
	vehicleMovementRepository.save(vehicleMovement);
}

// get by id
public Optional<VehicleMovement> findById(int id) {
	return vehicleMovementRepository.findById(id);
}
public void delete(Integer id) {
	 vehicleMovementRepository.deleteById(id);

}
}
