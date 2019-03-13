package com.inner.test;

class BigOuter {
	static class Nest {
		void go() {
			System.out.println("hi");
		}
	}
}

public class StaticNestedTest {

	int x;
	static int t;

	static class B2 {
		void goB2() {
			System.out.println("hi 2");
		}

		static void goB3() {
			System.out.println("hi 3" + t);
		}
	}

	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest(); // both class names
		n.go();

		B2 b2 = new B2(); // access the enclosed class
		b2.goB2();

	}

}
