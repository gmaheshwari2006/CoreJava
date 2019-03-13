package com.june.staticex;

public class TestStatic {

	static int counter = 0;

	static int i = 10;

	{
		System.out.println("non static block");
	}
	
	static {
		System.out.println("static block");
		
	}
	
	public void prePostIncrement(){
		int x = 1;
		System.out.println(x++);
		System.out.println(++x);
	}
	
	public TestStatic() {
		counter = counter + 1;
		System.out.println("counter is: " + counter);
	}

	public void showVariable() {
		i = i + 10;
		System.out.println("value of i is: " + i);
		printName();
	}

	public static  void printName() {
		String name = "gaurav";
		System.out.println("my name is: " + name);
	}

	public static void main(String[] args) {
		TestStatic test1 = new TestStatic();
		test1.showVariable();

		TestStatic test2 = new TestStatic();
		test2.showVariable();
		
		TestStatic.printName();
		test1.prePostIncrement();
	}

}
