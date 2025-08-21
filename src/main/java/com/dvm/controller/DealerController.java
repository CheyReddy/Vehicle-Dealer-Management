package com.dvm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dvm.model.Dealer;
import com.dvm.service.DealerService;

@RestController
@RequestMapping("/api/dealers")
public class DealerController {

	private final DealerService dealerService;

    public DealerController(DealerService dealerService) {
        this.dealerService = dealerService;
    }

    @PostMapping("/addDealer")
    public Dealer createDealer(@RequestBody Dealer dealer) {
        return dealerService.save(dealer);
    }

    @GetMapping("/{id}")
    public Dealer getDealer(@PathVariable("id") Long id) {
        return dealerService.findById(id);
    }

    @GetMapping("/all")
    public List<Dealer> getAllDealers() {
        return dealerService.findAll();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Dealer> updateDealer(@PathVariable Long id, @RequestBody Dealer dealerDetails) {
        Dealer dealer = dealerService.findById(id);

        dealer.setName(dealerDetails.getName());
        dealer.setEmail(dealerDetails.getEmail());
        dealer.setSubscriptionType(dealerDetails.getSubscriptionType());
        dealer.setPassword(dealerDetails.getPassword());

        Dealer updatedDealer = dealerService.save(dealer);
        return ResponseEntity.ok(updatedDealer);
    }

    @DeleteMapping("/{id}")
    public void deleteDealer(@PathVariable("id") Long id) {
        dealerService.delete(id);
    }
}
