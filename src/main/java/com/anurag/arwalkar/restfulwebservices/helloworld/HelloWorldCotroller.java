package com.anurag.arwalkar.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4300")
@RestController
public class HelloWorldCotroller {
	
	@GetMapping(path= "/anurag")
	public String helloWorld() {
		return "Hello Anurag Arwalkar";
	}
	
	@GetMapping(path= "/google")
	public  HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("anurag");
	}
	
	@GetMapping(path="/google/get/{name}")
	public HelloWorldBean getAccountName(@PathVariable String name) {
//		throw new RuntimeException("some error has happen! C contact anurag arwalkar");
		return new HelloWorldBean(String.format("Geetings From Google, %s", name));
	}
}
