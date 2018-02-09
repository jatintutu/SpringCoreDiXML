package com.spring.core.di.service;

import com.spring.core.di.repository.MyRepository;

public class MyService {
	private MyRepository myRepository;

	public MyRepository getMyRepository() {
		return myRepository;
	}

	public void setMyRepository(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	public void method1() {
		System.out.println(MyService.class.getName() + "method1");
		myRepository.method1();
	}
}
