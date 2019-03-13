package com.june.wrapperex;

public class WrapperSample {

	public void process() {
		Integer i2 = Integer.valueOf("101101");
		
		System.out.println(i2);
		String pie = "3.14f";
//		float pieWithCal = pie + 10;
		Float f2 = Float.valueOf(pie);
		Float pieWithCal = f2 + 10;
		System.out.println(pieWithCal);
		xxxValue();
		parseXXX();
		toStringEx();
		
	}
	
	public void xxxValue(){
		Integer i1 = new Integer(1006);
		int i1int = i1.intValue();
		System.out.println(i1int);
		short s1 = i1.shortValue();
		System.out.println(s1);
		
	}
	
	public void parseXXX(){
		int parsedInt = Integer.parseInt("25", 8);
		System.out.println("parsedInt:" + parsedInt);
		float parsedFloat = Float.parseFloat("25.69");
		System.out.println("parsedFloat: "+ parsedFloat);
	}
	
	public void toStringEx(){
		String s1 = Integer.toString(10);
		System.out.println("s1 string: " + s1);
		String binary25 = Integer.toBinaryString(25);
		System.out.println("binary25: " + binary25);
		float f1 = 20.5f;
		String s2 = Float.toHexString(f1);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		WrapperSample sample = new WrapperSample();
		sample.process();
		System.out.println(sample);

	}

}
