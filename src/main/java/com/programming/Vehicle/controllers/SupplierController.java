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

import com.programming.Vehicle.models.Supplier;
import com.programming.Vehicle.services.CountryService;
import com.programming.Vehicle.services.StateService;
import com.programming.Vehicle.services.SupplierService;

@Controller
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	@Autowired
	private CountryService countryService;
	
	@Autowired
	private StateService stateService;
	
	@GetMapping("/suppliers")
	public String goSuppliers(Model model) {
		
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("suppliers", supplierService.findAll());
		
		return "Supplier";
	}
	@PostMapping("/suppliers/addNew")
	public String addNew(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}
	@RequestMapping("suppliers/findById")
	@ResponseBody
	public Optional<Supplier> findById(int id) {
		return supplierService.findById(id);
	}
	
	
	@RequestMapping(value="/suppliers/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}
	
	
	@RequestMapping(value="/suppliers/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		supplierService.delete(id);
		return "redirect:/suppliers";
	}
}
