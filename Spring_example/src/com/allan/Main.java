package com.allan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//Example used to understand the difference bettween singleton scope and prototype scope
		
		/*
		ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloworld");
		
		objA.setMsg("I'm object A!!!");
		objA.getMsg();
		
		HelloWorld objB = (HelloWorld) context.getBean("helloworld");
		objB.getMsg();
		*/
		
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");

		obj.getMsg();
		context.registerShutdownHook();
	}

}
