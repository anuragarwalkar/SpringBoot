package com.anurag.arwalkar.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4300")
@RestController
public class BasicAuthenticationController {
	

	
	@GetMapping(path= "/basicauth")
	public  AuthenticationBean HelloWorldBean() {
		return new AuthenticationBean("You are Authenticated");
	}
	
}
	
	
