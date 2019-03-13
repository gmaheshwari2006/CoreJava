package training.core.overloading;

public class TestOverLoad {

	public void printName(int x) {
		System.out.println("with int");
	}
	
	/*public int printName(int x) {
		System.out.println("with return int");
		return x;
	}*/
	public void printName(long x) {
		System.out.println("with long");
	}
	
	public void printName(A a) {
		System.out.println("with A");
	}

	public void printName(B b) {
		System.out.println("with B");
	}
	
	public void printName(String name) {
		System.out.println("gaurav" + name);
	}
	
	public void printName(int x, long l) {
		System.out.println("with int and long");
	}

	public void printName(long x, int i) {
		System.out.println("with long and int");
	}
	 
	
	/*public A printName() {
		System.out.println("with int");
		return new A();
	}
	
	public B printName() {
		System.out.println("with int");
		return new B();
	}*/
}
