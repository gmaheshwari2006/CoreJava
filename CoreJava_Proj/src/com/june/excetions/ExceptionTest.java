package com.june.excetions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
	String line = null;

	public void testException() throws IOException, MyExecption {

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			int x = 10;

			if (x > 5) {
				throw new Exception("Throwing my exception");
			}
			fileReader = new FileReader("F:/testExceptionFile.txt");

			bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				fileReader = new FileReader("F:/testExceptionFile1.txt");

			}

		} catch (IOException e) {
			System.out.println("File not exists on the specified path");
		} catch (MyExecption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		try {
			test.testException();
		} catch (IOException | MyExecption  e) {
			e.printStackTrace();
		}

	}

}
