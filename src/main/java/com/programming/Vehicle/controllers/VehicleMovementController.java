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

import com.programming.Vehicle.models.VehicleMovement;
import com.programming.Vehicle.services.LocationService;
import com.programming.Vehicle.services.VehicleMovementService;
import com.programming.Vehicle.services.VehicleService;

@Controller
public class VehicleMovementController {
	@Autowired
	private VehicleMovementService vehicleMovementService;
	
	@Autowired
	private VehicleService vehicleService;
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/vehicleMovements")
	public String getVehicleMovements(Model model) {
		
		model.addAttribute("vehicleMovements", vehicleMovementService.findAll());
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("vehicles", vehicleService.findAll());

		
		
		return "VehicleMovement";
	}
	@PostMapping("/vehicleMovements/addNew")
	public String addNew(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehicleMovements";
	}
	@RequestMapping("vehicleMovements/findById")
	@ResponseBody
	public Optional<VehicleMovement> findById(int id) {
		return vehicleMovementService.findById(id);
	}
	
	
	@RequestMapping(value="/vehicleMovements/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleMovement vehicleMovement) {
		vehicleMovementService.save(vehicleMovement);
		return "redirect:/vehicleMovements";
	}
	
	
	@RequestMapping(value="/vehicleMovements/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleMovementService.delete(id);
		return "redirect:/vehicleMovements";
	}
}
