package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class DemoRestController {

	@GetMapping(value = "/welcome")
	public String welcomePage()
	{
		String msg="<h1 style='color:green'>Welcome To Spring Boot App</h1>";
		return msg;
	}
	
}
