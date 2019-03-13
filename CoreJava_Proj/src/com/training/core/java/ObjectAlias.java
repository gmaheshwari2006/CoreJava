package training.core.java;


public class ObjectAlias {
	int age;
	
	public static void main(String abc[]) {
		ObjectAlias obj3 = new ObjectAlias();
		ObjectAlias obj4 = new ObjectAlias();
		
		TestJava test1 = new TestJava();
		//test1.showAge();
		System.out.println("Gaesh first session");
		obj3.process();
		System.out.println("object:" + obj3);
		System.out.println("object:" + obj4);
		
		obj4 = obj3;
		System.out.println("object:" + obj3);
		System.out.println("object:" + obj4);
	}

	private void process(){
		age= 10;
	}
}
