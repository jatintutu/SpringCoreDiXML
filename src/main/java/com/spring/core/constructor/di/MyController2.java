package com.spring.core.constructor.di;

public class MyController2 {
	private MyService2 myService2;
	private String textSample;

	public MyController2(MyService2 myService2, String textSample) {
		this.myService2 = myService2;
		this.textSample = textSample;
	}

	public void method2() {
		System.out.println(MyController2.class.getName() + ".method2" + "," + textSample);
		myService2.method2();

	}
}
