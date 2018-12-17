package org.nadeem.models.operators;

import org.nadeem.RPNCalculator;
import org.nadeem.models.Constants;
import org.nadeem.models.Operation;

public class Addition implements Operator {
	

	@Override
	public boolean operate(RPNCalculator rpnCalculator) {

		if (rpnCalculator.stack.size() > 1) {
			//Pop Value from Stack and parse to Double
			double a = Double.parseDouble(rpnCalculator.stack.pop());
			//Pop Value from Stack and parse to Double
			double b = Double.parseDouble(rpnCalculator.stack.pop());
			// Perform Addition Operation and Push the result to Stack
			rpnCalculator.stack.push(Double.toString(b + a));

			//Add Operation in Calculator's Operations List
			Operation operation = new Operation();
			operation.operator = Constants.ADDITION;
			operation.operands = a + Constants.DELIMITER + b;
			rpnCalculator.calculatorHistory.add(operation);
			return true;
		} else {
			int operatorPosition = rpnCalculator.calculatorHistory.size() + 1;
			System.out.println("operator + (position: " + operatorPosition + "): insufficient parameters");
			return false;
		}

	}

}
