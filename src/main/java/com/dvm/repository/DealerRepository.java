package com.dvm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvm.model.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long> {
	
	Dealer findDealerByEmail(String email);

	Optional<Dealer> findByEmailAndPassword(String email, String password);

}
