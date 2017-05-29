package com.spring.example.autowire.bytype;

public class Drawing {
	private Triangle triangle;
	private Circle circle;
	
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	@Override
	public String toString() {
		return "Drawing [triangle=" + triangle + ", circle=" + circle + "]";
	}
}
