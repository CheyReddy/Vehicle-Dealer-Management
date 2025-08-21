package com.dvm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dvm.model.Dealer;
import com.dvm.service.DealerService;

@Controller
@RequestMapping("/api/auth")
public class MainController {
	
	private DealerService dealerService;
	
	public MainController(DealerService dealerService) {
		this.dealerService = dealerService;
	}
	
	
	@ResponseBody
	@PostMapping("/signup")
	public Dealer signUp(@RequestBody Dealer dealer) {
		return dealerService.save(dealer);
	}
	
	@ResponseBody
	@PostMapping("/signin")
	public String signin(@RequestBody Dealer dealer) {
		return dealerService.verify(dealer);
	}
	
	@ResponseBody
	@PostMapping("/home")
	public String dashboard() {
		return "Dashboard";
	}
	
	
}
