package com.spring.core.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.di.controller.MyController;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
		MyController myController = (MyController) applicationContext.getBean("myController");
		myController.method1();
		applicationContext.close();
	}
}
