package com.june.collections;

public class CompareTest {

	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.setId(10);
		stud1.setName("gaurav");

		Student stud2 = new Student();
		stud2.setId(10);
		stud2.setName("gaurav");

		System.out.println(stud1.equals(stud2));
 
	}

}
