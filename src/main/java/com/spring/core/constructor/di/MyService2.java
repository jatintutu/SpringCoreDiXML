package com.spring.core.constructor.di;

public class MyService2 {
	private MyRepository2 myRepository2;
	private long numbers;

	public MyService2(MyRepository2 myRepository2, long numbers) {
		this.myRepository2 = myRepository2;
		this.numbers = numbers;
	}

	public void method2() {
		System.out.println(MyService2.class.getName() + ".method2" + "," + numbers);
		myRepository2.method2();
	}
}
