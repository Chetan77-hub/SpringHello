package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(allowedHeaders = "*")
public class MainController {
	
	
	@GetMapping("/")
	public String HelloWorld() {
		return "Hello World";
	}

}
