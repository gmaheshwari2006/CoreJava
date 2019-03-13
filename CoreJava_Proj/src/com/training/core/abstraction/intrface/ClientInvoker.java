package training.core.abstraction.intrface;

/*import training.core.abstraction.abstrct.AbsCalculation;
import training.core.abstraction.abstrct.AbsFinalCalcImpl;*/

import training.core.abstraction.abstrct.*;

public class ClientInvoker {

	public static void main(String[] args) {
		calculatorClient calucator = new calculatorClient();
		ICalculation bc = new CalculationBC();
		ICalculation bc1 = new CalucationNewBC();
		
		
		calucator.doAddtion(bc1, 10, 20);
		
//		AbsCalculation acal = new AbsCalculationImpl();
		AbsCalculation acal = new AbsFinalCalcImpl();
		calucator.doAddtionWithAbst(acal, 30, 40);
	}

}

class calculatorClient{
	
	public void doAddtion(ICalculation calc, int a, int b){
		int sum = calc.addition(a, b);
		System.out.println("sum is: " + sum);
	}
	
	public void doAddtionWithAbst(AbsCalculation calc, int a, int b){
		int sum = calc.addition(a, b);
		System.out.println("sum is: " + sum);
		calc.nonAbstractMethod();
	}
}