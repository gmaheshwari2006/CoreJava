package com.access.practice;

class BaseClass {
	
	private void printName(){
		System.out.println("Base class printName");
	}
	
	protected void protectedPrintName(){
		System.out.println("Base class protectedPrintName");
	}
}

class subClass extends BaseClass{
	public void process(){
		BaseClass obj = new BaseClass();
//		obj.printName();
		obj.protectedPrintName();
	}
	void printName(){
		System.out.println("Sub class printName");
	}
	protected void protectedPrintName(){
		System.out.println("Sub class protectedPrintName");
	}
}

public class TestAccess{
	public static void main(String[] arg){
		BaseClass obj = new subClass();
		//obj.printName();
		subClass sub = new subClass();
		sub.process();
		obj.protectedPrintName();
	}
	
	void defaultPrintName(){
		
	}
	
	protected void testProtected(){
		System.out.println("test protected in TestAccess class");
	}
}

