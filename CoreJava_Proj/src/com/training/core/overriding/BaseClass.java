package training.core.overriding;

public class BaseClass {

	public A methodA(int x) {
		System.out.println("in base class methodA"); 
		int n = 10 + x;
		A a = new A(); 
		return a;
//		 return new A();
//		return null;
	}
	
	
	public A methodB(int x, A ab){
		System.out.println("in base class methodA");
		return new A();
	}
}
