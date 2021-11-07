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

import com.programming.Vehicle.models.Contact;
import com.programming.Vehicle.services.ContactService;
import com.programming.Vehicle.services.CountryService;
import com.programming.Vehicle.services.StateService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@GetMapping("/contacts")
	public String goContacts(Model model) {
		
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("contacts", contactService.findAll());
		
		return "Contact";
	}
	@PostMapping("/contacts/addNew")
	public String addNew(Contact contact) {
		contactService.save(contact);
		return "redirect:/contacts";
	}
	@RequestMapping("contacts/findById")
	@ResponseBody
	public Optional<Contact> findById(int id) {
		return contactService.findById(id);
	}
	
	
	@RequestMapping(value="/contacts/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Contact contact) {
		contactService.save(contact);
		return "redirect:/contacts";
	}
	
	
	@RequestMapping(value="/contacts/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		contactService.delete(id);
		return "redirect:/contacts";
	}
}
