package com.spring.example.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/example/autowire/byname/beans/beans.xml");
	
	Drawing drawing = (Drawing) context.getBean("drawing");
	System.out.println(drawing);
	}
}
