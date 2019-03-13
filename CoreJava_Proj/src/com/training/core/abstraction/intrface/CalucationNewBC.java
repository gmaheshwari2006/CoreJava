package training.core.abstraction.intrface;

public class CalucationNewBC implements ICalculation {

	@Override
	public int addition(int a, int b) {
		int n = a + b + 100;
		return n;
	}

}
