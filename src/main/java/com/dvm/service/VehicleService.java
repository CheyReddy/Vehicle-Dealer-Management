package com.dvm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dvm.model.SubscriptionType;
import com.dvm.model.Vehicle;
import com.dvm.repository.VehicleRepository;

@Service
public class VehicleService {
	
	private VehicleRepository vehicleRepository;

	public VehicleService(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;	
	}
	
	public Vehicle save(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}
	
	public Vehicle findById(Long id) {
		return vehicleRepository.findById(id).orElseThrow(() -> new RuntimeException("Vehicle not found..!"));
	}
	
	public List<Vehicle> findAll(){
		return vehicleRepository.findAll();
	}
	
	public void delete(Long id) {
		vehicleRepository.deleteById(id);
	}
	
	public List<Vehicle> findVehiclesByPremiumDealers(){
		return vehicleRepository.findByDealerSubscriptionType(SubscriptionType.PREMIUM);
	}
	
}
