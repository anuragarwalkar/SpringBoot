package com.anurag.arwalkar.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloWorldCotroller {
	
	@GetMapping(path= "/")
	public String applicationStart() {
		return "Hello Anurag Arwalkar, Spring has been started";
	}
	
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
