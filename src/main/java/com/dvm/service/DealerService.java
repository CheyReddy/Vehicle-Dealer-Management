package com.dvm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dvm.jwt.JwtService;
import com.dvm.model.Dealer;
import com.dvm.repository.DealerRepository;

@Service
public class DealerService {

	@Autowired
	AuthenticationManager authenticationManager;
	
	private final DealerRepository dealerRepository;
	
	@Autowired
	private JwtService jwtService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;


    public DealerService(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    public Dealer save(Dealer dealer) {
    	dealer.setPassword(passwordEncoder.encode(dealer.getPassword())); 
        return dealerRepository.save(dealer);
    }

    public Dealer findById(Long id) {
        return dealerRepository.findById(id).orElseThrow(() -> new RuntimeException("Dealer not found"));
    }

    public List<Dealer> findAll() {
        return dealerRepository.findAll();
    }

    public void delete(Long id) {
    	dealerRepository.deleteById(id);
    }
    
    public Dealer findByEmail(String email) {
    	return dealerRepository.findDealerByEmail(email);
    }

    public String verify(Dealer dealer) {
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(dealer.getEmail(), dealer.getPassword())
        );

        if (authentication.isAuthenticated()) {
            String email = authentication.getName();
            return jwtService.generateToken(email);
        }

        return "Failed, Try again..!";
    }


}
