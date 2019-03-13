package com.inheritence;

public class Car implements Vechile {
	// method overloading
	public void startEngine() {
		System.out.println("car start");
	}

	private int startEngine(String type) {
		System.out.println("car start");
		return 0;
	}

	@Override
	public void testInterface() {
		// TODO Auto-generated method stub
		
	}
}
