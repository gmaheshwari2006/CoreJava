package com.test.stringtest;

public class StringTest {

	public static void main(String[] args) {

		String name = new String("gaurav");
		name.concat(" Maheshwari");
		System.out.println(name); 

		
		String name1 = new String("gaurav");
		String fullname = name1.concat(" Maheshwari");
		System.out.println(fullname); 

		StringBuffer sb = new StringBuffer();
		sb.append("fdsfd").append("fdsfsd").append("fdsfds");
		String name2 = sb.toString();
		StringBuilder s;
	}

}
