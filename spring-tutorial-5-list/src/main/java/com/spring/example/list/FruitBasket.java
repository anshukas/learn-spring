package com.spring.example.list;

import java.util.List;

public class FruitBasket {
	private String name;
	private List<String> basket;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBasket(List<String> basket) {
		this.basket = basket;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(name);
		sb.append("\n");
		
		for (String item : basket) {
			sb.append(item);
			sb.append("\n");
		}
		return sb.toString();
	}
}
