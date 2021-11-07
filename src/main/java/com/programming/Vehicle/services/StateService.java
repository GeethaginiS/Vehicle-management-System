package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.State;
import com.programming.Vehicle.repositories.StateRepository;

@Service
public class StateService {
	@Autowired
	private StateRepository stateRepository;
	
	
//Return list of states
public List<State> findAll(){
	return stateRepository.findAll();
}
// save new states
public void save(State state) {
	stateRepository.save(state);
}

// get by id
public Optional<State> findById(int id) {
	return stateRepository.findById(id);
}
public void delete(Integer id) {
	 stateRepository.deleteById(id);

}
}
