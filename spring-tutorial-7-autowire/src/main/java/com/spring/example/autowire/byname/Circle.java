package com.spring.example.autowire.byname;

public class Circle implements Shape{
	private String name;
	
	public void draw(){
		System.out.println("Drawing Circle.");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Circle [name=" + name + "]";
	}

}
