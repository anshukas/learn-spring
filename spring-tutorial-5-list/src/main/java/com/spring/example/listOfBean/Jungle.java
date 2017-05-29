package com.spring.example.listOfBean;

import java.util.List;

public class Jungle {
	
	private Animal largest;
	private List<Animal> animals;
	
	
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(largest);
		sb.append("\n");
		
		sb.append("List of Animals name: ");
		sb.append("\n");
		for (Animal item : animals) {
			sb.append(item);
			sb.append("\n");
		}
		return sb.toString();
	}
}
