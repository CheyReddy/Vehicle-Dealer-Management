package com.dvm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dvm.model.Dealer;
import com.dvm.repository.DealerRepository;

import jakarta.validation.Valid;

@Controller
public class LoginController {


    @Autowired
    private DealerRepository dealerRepository;

    @PostMapping("/login")
	public String signin(@Valid @ModelAttribute("dealer") Dealer dealer,
            BindingResult bindingResult,
            Model model) {
    	System.out.println("came into login controller");
        if (bindingResult.hasErrors()) {
            return "login"; 
        }

        Optional<Dealer> dealerOpt = dealerRepository.findByEmailAndPassword(
                dealer.getEmail(), dealer.getPassword());

        if (dealerOpt.isPresent()) {
            model.addAttribute("message", "Login successful!");
            return "dashboard"; 
        } else {
            model.addAttribute("error", "Invalid email or password!");
            return "login"; 
        }
    }
}

