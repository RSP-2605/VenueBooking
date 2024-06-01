package com.venubooking.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {

	@GetMapping("/test")
	public String TestMethod() {
		return "This is test response";
	}
	
	@GetMapping("/")
	public String Home() {
		return "This is home page of venue booking made by Rahul Singh Parihar, Kshitija Shingnapurkar, Siddhesh Gathibandhe, Pratiksha Hatekar";
	}
	
}
