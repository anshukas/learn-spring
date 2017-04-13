package com.noteslookup.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		
		/**This is simple way to doing thing in Java*/
		System.out.println("/**This is simple way to doing thing in Java*/");
		Person person = new Person();
		person.speak();
		
		System.out.println();
		System.out.println("Doing same thing in spring.");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/noteslookup/spring/test/beans/beans.xml");
		Person person2 = (Person) context.getBean("person");
		person2.speak();

		// close the context.
		((ClassPathXmlApplicationContext)context).close();
	}
}
