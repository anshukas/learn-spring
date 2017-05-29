package com.spring.example.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/example/autowire/bytype/beans/beans.xml");
	
	Drawing drawing = (Drawing) context.getBean("drawing");
		System.out.println(drawing);
	}
}
