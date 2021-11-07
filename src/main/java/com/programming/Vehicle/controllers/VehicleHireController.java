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

import com.programming.Vehicle.models.VehicleHire;
import com.programming.Vehicle.services.ClientService;
import com.programming.Vehicle.services.LocationService;
import com.programming.Vehicle.services.VehicleHireService;
import com.programming.Vehicle.services.VehicleService;

@Controller
public class VehicleHireController {
	@Autowired private VehicleHireService vehicleHireService;
	@Autowired private VehicleService vehicleService;
	@Autowired private LocationService locationService;
	@Autowired private ClientService clientService;
	
	@GetMapping("/vehicleHires")
	public String goStates(Model model) {
		
		model.addAttribute("vehicleHires", vehicleHireService.findAll());
		model.addAttribute("clients", clientService.findAll());
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("vehicles", vehicleService.findAll());
		
		return "VehicleHire";
	}
	@PostMapping("/vehicleHires/addNew")
	public String addNew(VehicleHire vehicleHire) {
		vehicleHireService.save(vehicleHire);
		return "redirect:/vehicleHires";
	}
	@RequestMapping("vehicleHires/findById")
	@ResponseBody
	public Optional<VehicleHire> findById(int id) {
		return vehicleHireService.findById(id);
	}
	
	
	@RequestMapping(value="/vehicleHires/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleHire vehicleHire) {
		vehicleHireService.save(vehicleHire);
		return "redirect:/vehicleHires";
	}
	
	
	@RequestMapping(value="/vehicleHires/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleHireService.delete(id);
		return "redirect:/vehicleHires";
	}
}
