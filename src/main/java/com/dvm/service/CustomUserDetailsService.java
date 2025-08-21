package com.dvm.service;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dvm.model.Dealer;
import com.dvm.repository.DealerRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final DealerRepository dealerRepository;

    public CustomUserDetailsService(DealerRepository dealerRepository) {
        this.dealerRepository = dealerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	Dealer dealer = dealerRepository.findDealerByEmail(email);

        if (dealer == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }

        return User.builder()
                .username(dealer.getEmail())
                .password(dealer.getPassword()) 
                .authorities(Collections.emptyList()) 
                .build();
    }
}
