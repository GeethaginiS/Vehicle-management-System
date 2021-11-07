package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.EmployeeType;
import com.programming.Vehicle.repositories.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {
	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
	
	
//Return list of employeeTypes
public List<EmployeeType> getEmployeeTypes(){
	return employeeTypeRepository.findAll();
}
// save new employeeTypes
public void save(EmployeeType employeeType) {
	employeeTypeRepository.save(employeeType);
}

// get by id
public Optional<EmployeeType> findById(int id) {
	return employeeTypeRepository.findById(id);
}
public void delete(Integer id) {
	 employeeTypeRepository.deleteById(id);

}
}
