package training.core.abstraction.intrface;

public class CalculationBC extends DefaultClassA implements ICalculation  {

	
	public int addition(int a, int b) {
		int n = a + b;
		return n;
	}

}
