package com.dvm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.dvm.model.Payment;
import com.dvm.model.PaymentRequest;
import com.dvm.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/initiate")
    public Payment initiate(@RequestBody PaymentRequest request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth == null || !auth.isAuthenticated()) {
            throw new RuntimeException("Unauthorized access");
        }

        String username = auth.getName(); 
        System.out.println("Payment initiated by: " + username);

        return service.initiatePayment(request.getDealerId(), request.getAmount(), request.getMethod());
    }
}
