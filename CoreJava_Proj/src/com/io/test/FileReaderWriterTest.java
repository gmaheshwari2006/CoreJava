package com.io.test;

import java.io.File;
import java.io.FileWriter;

public class FileReaderWriterTest {

	public static void main(String[] args) {
		FileReaderWriterTest test = new FileReaderWriterTest();
		test.testFileWriter();

	}

	private void testFileWriter() {
		try {
			File file = new File("src\\com\\io\\test\\sachin1.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("my name is sachin");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("success");
	}

}
