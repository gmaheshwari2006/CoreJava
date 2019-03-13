package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaJDBCTest {

	public static void main(String[] args) {
		int id = 17;
		try {
			Class c = Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/test");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select emp_id, age, fname, lname, name, city from employee_details where emp_id = " + id);
			
			
			while(rs.next()){
				 int empId = rs.getInt("emp_id");
				 int age = rs.getInt(2);
				 String fname = rs.getString(3);
				 System.out.println(empId + " " + age +" " +fname);
			}
			
			PreparedStatement prstmt = con.prepareStatement("select emp_id, age, fname, lname, name, city from employee_details where emp_id = ? and age > ?");
			prstmt.setInt(1, 17);
			prstmt.setInt(2, 15);
			ResultSet rs1 = prstmt.executeQuery();

			while(rs1.next()){
				 int empId = rs1.getInt("emp_id");
				 int age = rs1.getInt(2);
				 String fname = rs1.getString(3);
				 System.out.println(empId + " " + age +" " +fname);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
