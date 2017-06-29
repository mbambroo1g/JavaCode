package com.fannie.entity;

public class Greeting {
	private String message;
	private String name;
	public Greeting(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public String getName() {
		return name;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setName(String name) {
		this.name = name;
	}
}
