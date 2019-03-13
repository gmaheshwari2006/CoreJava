package com.io.test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {

	public void writeIntoFile() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src\\com\\io\\test\\abc1.txt");
			String s = "Sachin Tendulkar is my favourite player";
			byte b[] = s.getBytes();// converting string into byte array
			fout.write(b);

			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void writeUsingBufferedOutputStream() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src\\com\\io\\test\\abc1.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String s = "Sachin Tendulkar is my favourite player";
			byte b[] = s.getBytes();// converting string into byte array
			bout.write(b);
			bout.flush();

			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String ap[]) throws IOException {
		/*
		 * int a = System.in.read(); System.out.println(a);
		 */

		FileIOTest test = new FileIOTest();
		// test.writeIntoFile();
		test.readFile();
		//test.testByteArrayOutputStream();
//		test.writeUsingBufferedOutputStream();
	}

	public void readFile() {
		try {
			FileInputStream fin = new FileInputStream("src\\com\\io\\test\\abc.txt");
			int i = 0;
			String compStr = "";
			while ((i = fin.read()) != -1) {
				 compStr = compStr.concat(Character.toString((char) i));
				
				
			}
			System.out.print(compStr);
			fin.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

	public void testByteArrayOutputStream() throws IOException {
		FileOutputStream fout1 = new FileOutputStream("src\\com\\io\\test\\f1.txt");
		FileOutputStream fout2 = new FileOutputStream("src\\com\\io\\test\\f2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(139);
		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();// has no effect
		System.out.println("success...");

	}

}
