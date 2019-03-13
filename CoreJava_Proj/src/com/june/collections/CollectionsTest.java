package com.june.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsTest {
	public void testCollections() {
		List primitiveList = new ArrayList();
		primitiveList.add(1);
		primitiveList.add(2);
		primitiveList.add(3);
		primitiveList.add(4);
		primitiveList.add(5);
		primitiveList.add(5);

		for (int i = 0; i < 6; i++) {
			System.out
					.println("value at " + i + " is: " + primitiveList.get(i));
		}
		System.out.println("advanced for loop: ");

		for (Object x : primitiveList) {
			System.out.println("value at " + x + " is: " + x);
		}

		System.out.println("contains 4: " + primitiveList.contains(4));

		List primitiveList1 = new ArrayList();
		System.out.println(primitiveList1.isEmpty());
		primitiveList.remove(3);
		System.out.println("contains 4: " + primitiveList.contains(4));

		System.out.println("index value of 5: " + primitiveList.indexOf(5));

		Set myset = new HashSet();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		myset.add(5);
		myset.add(5);
		for (Object x : myset) {
			System.out.println("set value at " + x + " is: " + x);
		}
	}

	public static void main(String a[]) {
		CollectionsTest test = new CollectionsTest();
		test.testCollections();
		test.compareStudents();
	}

	public void compareStudents() {
		Set<Student> studentsSet = new HashSet<Student>();
		Student stud1 = new Student();
		stud1.setId(10);
		stud1.setName("gaurav");

		Student stud2 = new Student();
		stud2.setId(10);
		stud2.setName("gaurav");

		Student stud3 = new Student();
		stud3.setId(10);
		stud3.setName("gaurav");

		studentsSet.add(stud1);
		studentsSet.add(stud2);
		studentsSet.add(stud3);
		
		for (Object student : studentsSet) {
			Student std = (Student) student;
		}
		System.out.println("size of students set: " + studentsSet.size());
		for (Student student : studentsSet) {
			
		}
	}
}
