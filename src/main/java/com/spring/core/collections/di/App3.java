package com.spring.core.collections.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext(
				"springConfigCollections.xml");
		MyController3 myController3 = (MyController3) abstractApplicationContext.getBean("myContoller3Bean");
		myController3.method3();
		abstractApplicationContext.close();
	}
}