package com.programming.Vehicle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.Vehicle.models.Client;
import com.programming.Vehicle.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	
//Return list of clients
public List<Client> findAll(){
	return clientRepository.findAll();
}
// save new clients
public void save(Client client) {
	clientRepository.save(client);
}

// get by id
public Optional<Client> findById(int id) {
	return clientRepository.findById(id);
}
public void delete(Integer id) {
	 clientRepository.deleteById(id);

}
}
