package training.core.overriding;

public class A {
	public void method() {
		System.out.println("A");
	}

	public A myMethod() {
		
		//return new B();
//		A a = new B();
		
		A a = new B();
		return a;
	}
}
