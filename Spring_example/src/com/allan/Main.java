package com.allan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		//Example used to understand the difference between singleton scope and prototype scope
		/*
		ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		
		objA.setMsg1(msg);("I'm object A!!!");
		objA.getMsg();
		
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		objB.getMsg();
		*/
		//Example used to understand bean life cycle and post process
		/*
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloworld");

		obj.getMsg1();
		context.registerShutdownHook();
		*/
		
		// Example used to understand bean definition inheritance
		ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		
		objA.getMsg1();
		objA.getMsg2();
		
		HelloBrasil objB = (HelloBrasil) context.getBean("helloBrasil");
		objB.getMsg1();
		objB.getMsg2();
		objB.getMsg3();
		
	}

}
