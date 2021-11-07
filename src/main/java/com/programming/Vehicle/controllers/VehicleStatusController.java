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

import com.programming.Vehicle.models.VehicleStatus;
import com.programming.Vehicle.services.VehicleStatusService;

@Controller
public class VehicleStatusController {
	@Autowired
	private VehicleStatusService vehicleStatusService;
	
	@GetMapping("/vehicleStatuses")
	public String goVehicleStatuses(Model model) {
		model.addAttribute("vehicleStatuses", vehicleStatusService.findAll());

		
		return "VehicleStatus";
	}
	@PostMapping("/vehicleStatuses/addNew")
	public String addNew(VehicleStatus vehicleStatus) {
		vehicleStatusService.save(vehicleStatus);
		return "redirect:/vehicleStatuses";
	}
	@RequestMapping("vehicleStatuses/findById")
	@ResponseBody
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusService.findById(id);
	}
	
	
	@RequestMapping(value="/vehicleStatuss/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleStatus vehicleStatus) {
		vehicleStatusService.save(vehicleStatus);
		return "redirect:/vehicleStatuses";
	}
	
	
	@RequestMapping(value="/vehicleStatuss/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleStatusService.delete(id);
		return "redirect:/vehicleStatuses";
	}
}
