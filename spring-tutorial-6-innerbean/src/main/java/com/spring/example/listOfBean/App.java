package com.spring.example.listOfBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/example/listOfBean/bean/beans.xml");
		
		Jungle jungle = (Jungle) context.getBean("jungle");
		
		System.out.println(jungle);
	}
}
