package com.inner.test;

public class MethodInnerClassTest {
	private String x = "Outer2";

	public void MyMethod() {
		final int t = 10;
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				System.out.println("value of t:  " + t);
			}
		}
		
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	

	public static void main(String[] args) {
		MethodInnerClassTest test = new MethodInnerClassTest();
		test.MyMethod();
	}

}
