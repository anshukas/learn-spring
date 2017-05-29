package com.spring.example.autowire.bytype;

public class Triangle {
	
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
