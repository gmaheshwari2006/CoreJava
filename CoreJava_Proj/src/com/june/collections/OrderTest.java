package com.june.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OrderTest {

	public void test() {
		StudentCompareById compareById = new StudentCompareById();
		Set<Student> studentSet = new TreeSet<Student>(compareById);
		Student stud1 = createStudent(10, "Gaurav");
		Student stud4 = createStudent(10, "Gaurav");
		Student stud2 = createStudent(11, "Ganesh");

		Student stud3 = createStudent(12, "Santosh");

		studentSet.add(stud1);

		studentSet.add(stud3);
		studentSet.add(stud2);

		// studentSet.add(stud4);
		// studentSet.add(100);
		// studentSet.add("gsdfsj");
		// studentSet.add(new OrderTest());

		for (Student student : studentSet) {
			System.out.println(student.getName());
		}
	}

	public void testListSorting() {
		List<Student> studentList = new ArrayList<Student>();
		Student stud1 = createStudent(10, "Gaurav");
		Student stud2 = createStudent(11, "Ganesh");

		Student stud3 = createStudent(12, "Santosh");

		studentList.add(stud1);

		studentList.add(stud3);
		studentList.add(stud2);
		// Collections.sort(studentList);
		for (Student student : studentList) {
			System.out.println("List: " + student.getName());
		}
		StudentCompareById compareById = new StudentCompareById();
		Collections.sort(studentList, compareById);
		System.out.println("List sorted by id using comparator: ");
		for (Student student : studentList) {

			System.out.println(student.getName() + ": id: " + student.getId());
		}
	}

	public static void main(String[] args) {
		OrderTest orderTest = new OrderTest();
		orderTest.test();
		orderTest.testListSorting();
		orderTest.sortArray();
	}

	public Student createStudent(int id, String name) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		return student;
	}

	public void sortArray() {
		Student[] studentsArray = new Student[3];
		Student stud1 = createStudent(1, "Gaurav");
		Student stud2 = createStudent(3, "aamesh");

		Student stud3 = createStudent(2, "Mahesh");
		studentsArray[0] = stud1;
		studentsArray[1] = stud2;
		studentsArray[2] = stud3;
		System.out.println("Array Sorting");
		StudentCompareById compareById = new StudentCompareById();
		Arrays.sort(studentsArray, compareById); 
		for (Student stud : studentsArray) {
			System.out.println("id: " + stud.getId() + ": name: "
					+ stud.getName());
		}
	}
}
