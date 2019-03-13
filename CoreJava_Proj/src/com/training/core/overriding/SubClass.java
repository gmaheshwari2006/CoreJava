package training.core.overriding;

public class SubClass extends BaseClass {

	public B methodA(int x) {
		System.out.println("in sub class methodA");
		return new B();
	}
	

	public A methodB(int x, B ab){
		System.out.println("in sub class methodB");
		return new A();
	}
}
