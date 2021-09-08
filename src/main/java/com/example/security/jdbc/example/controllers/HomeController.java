package com.example.security.jdbc.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	
	@GetMapping("/user")
	public String userHome() {
		return ("<h1>Welcome to User Home</h1>");
	}
	
	@GetMapping("/admin")
	public String adminHome() {
		return ("<h1>Welcome to Admin Home</h1>");
	}
}
