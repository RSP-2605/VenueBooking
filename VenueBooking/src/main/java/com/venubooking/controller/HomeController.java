package com.venubooking.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

	@GetMapping("/test")
	public String TestMethod() {
		return "This is test response";
	}
	
}
