package com.spring.core.constructor.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"springConfigConstructorInjection.xml");
		MyController2 controller2 = (MyController2) applicationContext.getBean("myController2Bean");
		controller2.method2();
		applicationContext.close();
	}

}
