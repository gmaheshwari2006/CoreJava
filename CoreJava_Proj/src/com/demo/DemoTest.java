package com.demo;

public class DemoTest {

	User setmyName(User u1){
		u1.setName("gaurav");
		return u1;
	}
	public static void main(String[] args) {
		
		DemoTest test = new DemoTest();
		User user = new User();
		user.setName("xyz");
		System.out.println(user.getName());
		User u2 = test.setmyName(user);
		System.out.println(u2.getName());
	}

}
