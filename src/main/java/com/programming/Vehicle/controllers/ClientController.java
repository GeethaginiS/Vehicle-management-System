package com.programming.Vehicle.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.programming.Vehicle.models.Client;
import com.programming.Vehicle.services.CountryService;
import com.programming.Vehicle.services.StateService;
import com.programming.Vehicle.services.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@GetMapping("/clients")
	public String goClients(Model model) {
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("clients", clientService.findAll());
		return "Client";
	}
	@PostMapping("/clients/addNew")
	public String addNew(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}
	@RequestMapping("clients/findById")
	@ResponseBody
	public Optional<Client> findById(int id) {
		return clientService.findById(id);
	}
	
	
	@RequestMapping(value="/clients/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}
	
	
	@RequestMapping(value="/clients/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		clientService.delete(id);
		return "redirect:/clients";
	}
}
