package com.june.wrapperex;

public class AddBoxing {
	static void go(Integer x) {
		System.out.println("Integer");
	}

	static void go(long x) {
		System.out.println("long");
	}

	public static void main(String[] args) {
		int i = 5;
		go(i); // which go() will be invoked?
		doCalculation(1,2);
	}

	static public void doCalculation(Integer x, Integer y) {
		System.out.println("autoboxing");
	}

	static public void doCalculation(int...x) {
		System.out.println("var agr");
		for(int i = 0; i<x.length; i++){
			System.out.println(x[i]);
		}
	}
}
