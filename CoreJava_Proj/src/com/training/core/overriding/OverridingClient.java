package training.core.overriding;

public class OverridingClient {

	int g;
	
	double [] myList;
	
	double  myList11 [] = {10.5,6.2,8.56};  // 1 way of declaring and initializing array         
	
	void method(final int x){
		double [] myList2 = {10.5,6.2,8.56};
		myList2 [0] = 5;
		
		myList = new double [10]; // // 1 way of declaring array  
		myList [0] = 5.5;
		myList [1] = 7.5;
		myList [0] = 9.65;
		System.out.println("value at index 1: " + myList[10]); 
		
		for (int i=0;i<3;i++){
			System.out.println("value at index "  + i + " : " + myList11[i]);
		}
		g = g + 5;
		//x = 10;
		//x = x + 11;
	}
	
	public static void main(String[] args) {
		OverridingClient client = new OverridingClient();
		client.method(10);
		byte i = 127;
		short s = -32768;
		int x, y, z;
		final int f;
//		f = 30;
//		f = f + 10;
		/*BaseClass base = new BaseClass();
		base.methodA(10);
		
		SubClass sub = new SubClass();
		sub.methodA(20); */
		
		BaseClass base1 = new BaseClass();
		base1.methodA(30); 
		
		//SubClass sub1 = (SubClass) new BaseClass();
		
		BaseClass base = new SubClass();
		base2.methodB(5, new A());
		
		A a = new A();
		B b = new B();
		
		//b = (B) a;
//		b =  (B) new A();
//		b.method();
		a = (A) new B();
		a.method();
//		b =  (B) new A();
//		A a = new B();
		A b1 =  (A) a.myMethod();
		b1.method();
	}

}
