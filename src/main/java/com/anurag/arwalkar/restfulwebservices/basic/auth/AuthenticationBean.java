package com.anurag.arwalkar.restfulwebservices.basic.auth;

public class AuthenticationBean {

	private String name;

	public AuthenticationBean(String name) {
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
