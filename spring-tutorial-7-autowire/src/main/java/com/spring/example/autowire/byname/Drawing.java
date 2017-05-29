package com.spring.example.autowire.byname;

public class Drawing {
	private Shape triangle;
	private Shape circle;
	

	public void setTriangle(Shape triangle) {
		this.triangle = triangle;
	}

	public void setCircle(Shape circle) {
		this.circle = circle;
	}
	
	@Override
	public String toString() {
		return "Drawing [triangle=" + triangle + ", circle=" + circle + "]";
	}
}
