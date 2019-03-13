package training.core.arrays;

import training.core.abstraction.intrface.DefaultClassA;
import training.core.overloading.A;

public class ArrayTest {
	private int i;

	public void process() {
		A[] a = new A[3];
		System.out.println(a[0]);
		A aobj = new A();
		aobj.setName("gaurav");
		a[0] = aobj;
		a[1] = new A();
		System.out.println(a[0]);
		System.out.println("name is: " + (a[3]).getName());

	}

	public static void main(String[] args) {

		ArrayTest test = new ArrayTest();
		test.process();
	}

}

class B extends DefaultClassA{
	
}
