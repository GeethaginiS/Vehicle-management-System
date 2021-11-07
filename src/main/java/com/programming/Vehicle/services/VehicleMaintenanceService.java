package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.VehicleMaintenance;
import com.programming.Vehicle.repositories.VehicleMaintenanceRepository;

@Service
public class VehicleMaintenanceService {
	@Autowired
	private VehicleMaintenanceRepository vehicleMaintenanceRepository;
	
	
//Return list of vehicleMaintenances
public List<VehicleMaintenance> findAll(){
	return vehicleMaintenanceRepository.findAll();
}
// save new vehicleMaintenances
public void save(VehicleMaintenance vehicleMaintenance) {
	vehicleMaintenanceRepository.save(vehicleMaintenance);
}

// get by id
public Optional<VehicleMaintenance> findById(int id) {
	return vehicleMaintenanceRepository.findById(id);
}
public void delete(Integer id) {
	 vehicleMaintenanceRepository.deleteById(id);

}
}
