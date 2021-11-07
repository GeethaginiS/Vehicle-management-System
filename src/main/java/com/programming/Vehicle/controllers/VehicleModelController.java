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

import com.programming.Vehicle.models.VehicleModel;
import com.programming.Vehicle.services.VehicleModelService;

@Controller
public class VehicleModelController {
	@Autowired
	private VehicleModelService vehicleModelService;
	
	@GetMapping("/vehicleModels")
	public String goStates(Model model) {
		
		model.addAttribute("vehicleModels", vehicleModelService.findAll());

		
		return "VehicleModel";
	}
	@PostMapping("/vehicleModels/addNew")
	public String addNew(VehicleModel vehicleModel) {
		vehicleModelService.save(vehicleModel);
		return "redirect:/vehicleModels";
	}
	@RequestMapping("vehicleModels/findById")
	@ResponseBody
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelService.findById(id);
	}
	
	
	@RequestMapping(value="/vehicleModels/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleModel vehicleModel) {
		vehicleModelService.save(vehicleModel);
		return "redirect:/vehicleModels";
	}
	
	
	@RequestMapping(value="/vehicleModels/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleModelService.delete(id);
		return "redirect:/vehicleModels";
	}
}
