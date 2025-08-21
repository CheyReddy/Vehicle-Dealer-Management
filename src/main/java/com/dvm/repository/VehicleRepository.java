package com.dvm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvm.model.SubscriptionType;
import com.dvm.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	List<Vehicle> findByDealerSubscriptionType(SubscriptionType subscriptionType);
}
