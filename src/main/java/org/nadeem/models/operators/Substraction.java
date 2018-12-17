package org.nadeem.models.operators;

import org.nadeem.RPNCalculator;
import org.nadeem.models.Constants;
import org.nadeem.models.Operation;

public class Substraction implements Operator {
	@Override
	public boolean operate(RPNCalculator rpnCalculator) {
		if (rpnCalculator.stack.size() > 1) {
			double a = Double.parseDouble(rpnCalculator.stack.pop());
			double b = Double.parseDouble(rpnCalculator.stack.pop());
			rpnCalculator.stack.push(Double.toString(b - a));
			Operation operation = new Operation();
			operation.operator = Constants.SUBSTRACTION;
			operation.operands = a + Constants.DELIMITER + b;
			rpnCalculator.calculatorHistory.add(operation);
			return true;
		} else {
			int operatorPosition = rpnCalculator.calculatorHistory.size() + 1;
			System.out.println("operator - (position: " + operatorPosition + "): insufficient parameters");
			return false;
		}
	}
}
