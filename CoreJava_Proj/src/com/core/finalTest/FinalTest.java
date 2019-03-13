package com.core.finalTest;

public class FinalTest {

	final int salary = 1000; 

	public static void main(String[] args) {
		FinalTest test = new FinalTest();
		test.execute(10);
	}

	public void execute(final int a) {
//		a = 20;
		//salary = 2000;
		final int code; 
		code = 123;
//		code = 456;
		System.out.println("salary is :" + salary);
		System.out.println("code is :" + code);
		System.out.println("a is :" + a);
	}
}
