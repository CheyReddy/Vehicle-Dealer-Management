package com.dvm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dvm.model.Vehicle;
import com.dvm.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

	private VehicleService vehicleService;
	
	public VehicleController(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	@PostMapping("/addVehicle")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.save(vehicle);
    }

    @GetMapping("/{id}")
    public Vehicle getVehicle(@PathVariable("id") Long id) {
        return vehicleService.findById(id);
    }

    @GetMapping("/all")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.findAll();
    }

    @PutMapping("/{id}")
    public Vehicle updateVehicle(@PathVariable("id") Long id, @RequestBody Vehicle newData) {
        Vehicle vehicle = vehicleService.findById(id);

        if (newData.getPrice() != null) {
            vehicle.setPrice(newData.getPrice());
        }
        if (newData.getStatus() != null) {
            vehicle.setStatus(newData.getStatus());
        }

        return vehicleService.save(vehicle);
    }


    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable("id") Long id) {
        vehicleService.delete(id);
    }

    @GetMapping("/premium")
    public List<Vehicle> getVehiclesOfPremiumDealers() {
        return vehicleService.findVehiclesByPremiumDealers();
    }
}
