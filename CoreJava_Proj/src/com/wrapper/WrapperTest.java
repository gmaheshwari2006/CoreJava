package com.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		WrapperTest test = new WrapperTest();
		test.process();
	}

	public void process(){
		Boolean b = new Boolean("abc");
		Integer in = new Integer(12);
		
		if(b){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		int i = 1;
		int j = 2;
		if(i==j){
			System.out.println("1==2");
		}
		
		//valueOf methods
		int x = 10;
		Integer xW = Integer.valueOf(x);
		Integer xr = Integer.valueOf("101", 16);
		System.out.println("binary value: " + xr);
		Short dr = Short.valueOf("11111111111", 2);
		System.out.println("Short value: " + xr);
	
		

//		xxxValue():
		int iv = 130;
//		need to covert into byte
//		Byte b = (Byte)iv;
		byte b1 = 0;
//		Integer ib = (Integer)(new Byte(b1));
//		1 step
		Integer ivalue =  new Integer(iv);
//		2step
		b1 = ivalue.byteValue();
		System.out.println(b1);
		byte b2 = 127;
		Byte bw = new Byte(b2);
		iv = bw.intValue();
		System.out.println(iv);
		
		long l1 = 5655656l;
		Long lw = new Long(l1);
		double d1 = lw.doubleValue();
		System.out.println(d1);
		
		double f1 = 2147483648454545345543543554353534534d;
		Double d2 = new Double(f1);
		int id = d2.intValue();
		System.out.println(id);
		System.out.println(f1);
		
		long l3 = 9223372036854775807l;
		Long lw1 = new Long(l3);
		int il = lw1.intValue();
		System.out.println(il);
		
//		parseXxx() its a static method
		//used for converting String to specific type of premetive
		String salary = "50000";
		int isalary = Integer.parseInt(salary);
		System.out.println("salary: " + isalary);
		String bl = "true1";
		boolean bb = Boolean.parseBoolean(bl);
		System.out.println(bb);
		
		//toString()
		
		String str50 = Integer.toString(50);
		 
		int i5 = 250;
		String binaryOfInt = Integer.toString(i5, 2);
		System.out.println("binaryOfInt: " + binaryOfInt);
		
	}
	
}
