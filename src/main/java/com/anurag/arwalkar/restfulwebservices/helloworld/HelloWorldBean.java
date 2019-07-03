package com.anurag.arwalkar.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String name;

	public HelloWorldBean(String name) {
		this.name = name;
	}
	
	public void setMessage(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return String.format("Hello world bean [name=%s]", name);
	}
}
