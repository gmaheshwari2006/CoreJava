package com.june.wrapperex;

public class WrapperTest {

	static public Object add(){
		return new Integer(10);
	}
	
	
	public static void main(String[] args) {
		Integer i = (Integer)add();
		
	Integer int1 = new Integer("10");
	Integer int2 = new Integer(10);
	
	System.out.println(int1);
	System.out.println(int2);
	
	Double d1 = new Double(15d);
	
	Float f1 = new Float(5f);

	Boolean b1 = new Boolean("Treu");
	
//	if(b1 == true){
	if(b1){
		System.out.println("b1 true:  " + b1);
	}else {
		System.out.println("b1 false: " + b1);
	}
	}

}
