package com.noteslookup.spring.test;

/**
 * Here are r try to achieve dependency injection using setter method.
 * 
 * @author anshu.kumar
 *
 */
		
public class Person {
	/** Person has address is type Of HAS-A relationship.*/
	private Address address;
	
	// This getter is need for normal way of doing Java.
	public Address getAddress() {
		if(address==null){
			address = new Address();
		}
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void sayFromAddress(){
		address.say();
	}
	
	public void speak(){
		System.out.println("hello! I am Person Class..");
	}

}
