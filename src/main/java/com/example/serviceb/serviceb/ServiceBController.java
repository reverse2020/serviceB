package com.example.serviceb.serviceb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

	
	
	@GetMapping("/hi")
	public String hi() {
		return "updated hi from ServiceB";
	}
}
