package com.inner.test;

public class TestMemberOuter {

	private int data = 30;

	 class Inner {
		 int x = 100;
		void msg() {
			System.out.println("data is " + this.x);
//			System.out.println("data is " + this.data);// 'this' represent Inner class only 
			testThis(this);
			testOuterThis(TestMemberOuter.this);
		}
		
		void testThis(Inner obj){
			
		}
		
		void testOuterThis(TestMemberOuter obj){
			
		}
	}

	void outerMethod() {
		Inner in = new Inner();
		in.msg();
	}
	
	public static void main(String args[]) {
		TestMemberOuter obj = new TestMemberOuter();
		//data = 100;
		TestMemberOuter.Inner in = obj.new Inner();
		in.msg();
	}

}

class Test extends TestMemberOuter{
	
	public void Mytest(){
		
		Test test = new Test();
		TestMemberOuter obj = new TestMemberOuter();
		
		Inner in = new Inner();
		Test.Inner in1 = test.new Inner();
		in.msg();
		in1.msg();
	}
	
}
