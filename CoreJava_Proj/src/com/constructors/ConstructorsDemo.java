package com.constructors;

public class ConstructorsDemo {
	int n;
	String name;
	// default constructors
	public ConstructorsDemo() {
		System.out.println("in constructor");
	}

	// paramaterized constructors
	public ConstructorsDemo(int i) {
		this();
		System.out.println("in constructor with param");

	}

	public ConstructorsDemo(int i, int j) {
		this(i);
		System.out.println("in constructor with 2 param ");
		n = i;
		
	}

	public void test(){
		
	}
	
	public void reset(int n){
		name = "";
		this.n = 0;
		this.n = n;
		this.test();
	}
	public static void main(String[] args) {
		new ConstructorsDemo(1, 2);

	}

}
