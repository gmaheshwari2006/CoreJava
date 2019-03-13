package training.core.java;


public class TestJava {
	
	//for instance and reference variables
	//creation and instantiaation
	
	//1. creation of variables
	int age; // instance type variable
	TestJava obj1; // reference type variable
	
	//2. creation and instantation  simultaniously
//	int age1 = 100;
//	TestJava obj2 = new TestJava();
	
	// nothing can be changed in the below method signature except "abc"
	public static void main(String abc[]) {
		TestJava obj3 = new TestJava();
		System.out.println("Gaesh first session");
		obj3.showName();
	}
	
	void showName(){
		//age = 50; // instantation 
//		obj1 = new TestJava(); //instantation 
		System.out.println("gaurav"); 
		//showAge();
	}
	
	private void showAge(){
		System.out.println("age is: " + age +2); 
	 
	}
}
