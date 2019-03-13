package com.inner.test;

interface Person {
	void eat();
}

class PersonImpl implements Person {

	@Override
	public void eat() {
		System.out.println("eat");
		
	}

}

public class TestAnnonymousInner {

	public static void main(String args[]) {
		TestAnnonymousInner inner = new TestAnnonymousInner();

		Person p = new PersonImpl();
		Person p1 = new Person() {
			@Override
			public void eat() {
				System.out.println("eat1");
				
				

			}
		};
		p.eat();
		p1.eat();
		inner.testAnno(new Person() {

			@Override
			public void eat() {
				System.out.println("eat2");

			}
		});
	}

	public void testAnno(Person p) {
		p.eat();
	}
}
