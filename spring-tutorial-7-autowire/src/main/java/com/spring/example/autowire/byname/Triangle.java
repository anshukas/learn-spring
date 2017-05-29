package com.spring.example.autowire.byname;

public class Triangle implements Shape{
	
	private String name;
	
	public void draw(){
		System.out.println("Drawing Triangle.");
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Triangle [name=" + name + "]";
	}
	
}
