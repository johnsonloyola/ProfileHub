package com.hub.profile.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TestController {

	@GetMapping("/api")
	public String message() {
		return "Welcome";
	}
	
}
