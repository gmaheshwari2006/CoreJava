package com.statictest;

public class TestStatic {
	static int i;
	int n;

	static {
		System.out.println("static block");
		i = 100;
//		n = 5;
	}
	
		public static void main(String[] a) {
		TestStatic test1  =  new TestStatic();
		TestStatic test2  =  new TestStatic();
		i = 10;
		i = 20;
		
		System.out.println("test1.i: " + i);
		System.out.println("test2.i: " + i);
//		staticMethod(1);
		System.out.println("test2.i: " + i);
		//process();
	}
	
	public void process(){
		i = 30;
		System.out.println(i); // but we can use static member in a non-static method
	}
	/*public static void staticMethod(int value){
		i = value;
		//n= 10; // we cann't use non-static member in a static method
		
	}*/
}
