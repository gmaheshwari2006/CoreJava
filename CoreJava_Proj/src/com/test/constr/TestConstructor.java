package com.test.constr;

public class TestConstructor extends SuperTest {
	int salary;

	 TestConstructor() {
		super(10);
		System.out.println("default constructor");
	}

	public TestConstructor(int a) {
//		super(20);// both super and this not allowed 
		this();
		
		salary = a;
		System.out.println("paramaterized constructor with 1 param " + salary);
	}

	public TestConstructor(int a, int b) {
		this(a);
		// this();
		// not more than one salary = a;
		System.out.println("paramaterized constructor with 2 param " + salary);
	}

	public static void main(String[] a) {
		TestConstructor cons1 = new TestConstructor();
		// TestConstructor cons2 = new TestConstructor(5000);
		// TestConstructor cons3 = new TestConstructor(1000, 2000);
		
//		SuperTest test1 = new SuperTest(); // becoz const is private
	}

}
