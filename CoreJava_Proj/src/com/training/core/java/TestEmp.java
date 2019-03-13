package training.core.java;

public class TestEmp {

	public static void main(String[] args) {
		
		CallingEmployee cemp = new CallingEmployee();
		Employee emp = cemp.myName();
		emp.printMyName();
	}

}
