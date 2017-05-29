package com.spring.example.autowire.bytype;

import org.springframework.beans.factory.annotation.Autowired;

public class Drawing {
	
	@Autowired
	private Triangle triangle;
	@Autowired
	private Circle circle;
	
/*	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
*/	
	@Override
	public String toString() {
		return "Drawing [triangle=" + triangle + ", circle=" + circle + "]";
	}
}
