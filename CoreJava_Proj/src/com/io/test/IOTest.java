package com.io.test;

import java.io.IOException;
import java.io.PrintStream;

public class IOTest {

	public static void main(String[] args) throws IOException {
		//System.out.println("arg: ");
		int n = System.in.read();
		System.out.println("read n: " + n);
		System.out.println("read n: " + (char)n);
		System.err.println("error");
		

	}

}
