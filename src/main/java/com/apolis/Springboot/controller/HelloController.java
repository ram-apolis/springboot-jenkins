package com.apolis.Springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloController {
	
	@GetMapping
	public String sayHello()
	{
		return "Hello there!!";
	}

}
