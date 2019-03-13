public class TestConstructors {

	String name;

	TestConstructors() {
		System.out.println("in first constructor");
	}

	public TestConstructors(int x) {
		this();
		System.out.println("in paramaterized constructor with 1 param");

		// obj.name = "gaurav";
	}

	public TestConstructors(int x, int y) {
		this(10);
		System.out.println("in paramaterized constructor with 2 param");
	}
public void testThis(){
	
}
	public void sayHello() {
		System.out.println("hello to mr. :" + name);
		this.testThis();
	}
	//TestConstructors obj = new TestConstructors();
	public static void main(String[] args) {
		
		new TestConstructors(1, 5).sayHello();
		new ConstSubClass(1);
		
	}

}

class outerConstBaseClass {
	TestConstructors obj = new TestConstructors();

	outerConstBaseClass() {
		System.out.println("outerConstBaseClass");
	}
	outerConstBaseClass(int i) {
		this();
		System.out.println("outerConstBaseClass with 1 param");
	}
	public void superMethod(){}
}

class ConstSubClass extends outerConstBaseClass {
	static {
		System.out.println("static block");
	}

	ConstSubClass() {
		super();
		System.out.println("ConstSubClass");
	}
	
	ConstSubClass(int i) {
		super(10);
//		super(10);
		System.out.println("ConstSubClass with 1 param");
	}
	public void subMethod(){
		super.superMethod();
	}
}