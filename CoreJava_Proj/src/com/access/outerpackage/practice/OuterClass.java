package com.access.outerpackage.practice;



import com.access.practice.TestAccess;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.OutputUtil;

public class OuterClass extends TestAccess {
	public void process() {
		TestAccess obj = new TestAccess();
//		obj.defaultPrintName();
		
	}
	/*protected void testProtected(){
		System.out.println("test protected in OuterClass class");
	}*/
	void defaultPrintName() {
		
	}

	public static void main(String[] arg){
		OuterClass test = new OuterClass();
		test.testProtected();
	}
}

class TestProteced extends OuterClass {
	public void test(){
		OuterClass test = new OuterClass();
		test.testProtected();
		
		TestProteced test1 = new TestProteced(); 
		test1.testProtected();
	}
}
