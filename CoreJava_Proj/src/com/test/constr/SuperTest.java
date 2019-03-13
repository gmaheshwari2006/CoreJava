package com.test.constr;

public class SuperTest {

	private SuperTest() {
		super();
		System.out.println("super test default constructor");
	}
	
	public SuperTest(int a) {
		this();
		System.out.println("super test 1 param constructor");
	}

}
