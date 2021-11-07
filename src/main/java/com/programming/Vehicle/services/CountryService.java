package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.Country;
import com.programming.Vehicle.repositories.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	
	
//Return list of countries
public List<Country> findAll(){
	return countryRepository.findAll();
}
// save new countries
public void save(Country country) {
	countryRepository.save(country);
}

// get by id
public Optional<Country> findById(int id) {
	return countryRepository.findById(id);
}
public void delete(Integer id) {
	 countryRepository.deleteById(id);

}
}
