package com.spring.example.autowire.byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Drawing {
	
	@Autowired
	@Qualifier("myTriangle")
	private Shape triangle;
	
	@Autowired
	@Qualifier("myCircle")
	private Shape circle;

	@Override
	public String toString() {
		return "Drawing [triangle=" + triangle + ", circle=" + circle + "]";
	}
	
}
