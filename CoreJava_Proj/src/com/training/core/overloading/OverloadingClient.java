package training.core.overloading;

public class OverloadingClient {

	public static void main(String arg[]) {
		TestOverLoad test = new TestOverLoad();
		test.printName("ganesh");
		test.printName(10l);
		A a = new A();
		B b = new B();
		test.printName(b);
		test.printName(10, 20l);
	}
}
