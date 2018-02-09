package com.spring.core.di.controller;

import com.spring.core.di.service.MyService;

public class MyController {
	private MyService myService;

	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}

	public void method1() {
		System.out.println(MyController.class.getName() + "method1");
		myService.method1();
	}
}
