package com.noteslookup.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args){
		/**Try with simple java*/
		Person person = new Person();
		person.speak();	
		
		/** Changes simple java to spring way */
		// This our container to get bean from it.
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		System.out.println("Spring way!!");
		Person person2 = (Person) context.getBean("person");
		person2.speak();
	}
}
