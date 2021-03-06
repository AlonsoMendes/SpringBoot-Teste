package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	
	@GetMapping("/")
	public String helloMessage() {
		return "HELLO, DIGITAL INNOVATIO ONE!";
	}
}
