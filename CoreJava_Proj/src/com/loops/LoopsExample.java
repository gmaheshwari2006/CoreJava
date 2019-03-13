package com.loops;

public class LoopsExample {

	public void ifElse() {
		int i = 10;
		int b = 5;
		if (i > 9) {
			System.out.println("i is greater than 10");
			if (b == 5) {
				System.out.println("b is equal to 5");
			} else {

			}
		} else {
			System.out.println("i is not greater than 10");
		}

		if (i > 50) {

		} else if (i > 40) {

		} else if (i == 30) {

		} else {

		}
	}

	public static void main(String[] args) {
		LoopsExample ex = new LoopsExample();
		ex.ifElse();
		ex.switchTest();
		ex.whileloop();
		ex.forLoop();
	}

	public void switchTest() {
		int i = 3;

		switch (i) {
		case 1: {
			System.out.println("1");
			break;
		}
		case 2: {
			System.out.println("2");
			break;
		}
		default: {
			System.out.println("default");
			break;
		}
		}
	}

	public void whileloop() {
		int i = 1;
		int n = 6;
		while (i <= 5) {
			System.out.println("gaurav");
			i++;
		}

		do {
			System.out.println("raghuram");
			n++;
		} while (n <= 5);
	}

	public void forLoop() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("santosh: " + i);
			if (i == 3) {
				break;
			}
			if (i == 2)
			{
				continue;
			}
			System.out.println("next statement: " + i);
		}
	}
}
