package com.test.general;

public class GeneralTest {
	public void testVarArg(int i, int n, String... x){
		System.out.println("test: " + i);
		System.out.println("test n: " + n);
		for(String str: x){
			System.out.println(str);
		}
		
	}
	public void process() {
		testVarArg(10,20,  "abc", "xyz", "fsdfs");
		testVarArg(10,20);
	}

	public static void main(String[] args) {
		GeneralTest test = new GeneralTest();
		test.process();

	}

}
