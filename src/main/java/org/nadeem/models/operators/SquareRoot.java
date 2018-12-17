package org.nadeem.models.operators;

import org.nadeem.RPNCalculator;
import org.nadeem.models.Constants;
import org.nadeem.models.Operation;

public class SquareRoot implements Operator {
	@Override
	public boolean operate(RPNCalculator rpnCalculator) {
		if (rpnCalculator.stack.isEmpty()) {
			int operatorPosition = rpnCalculator.calculatorHistory.size() + 1;
			System.out.println("operator sqrt (position: " + operatorPosition + "): insufficient parameters");
			return false;
		} else {
			double a = Double.parseDouble(rpnCalculator.stack.pop());
			rpnCalculator.stack.push(Double.toString(Math.sqrt(a)));
			Operation operation = new Operation();
			operation.operator = Constants.SQUAREROOT;
			operation.operands = Double.toString(a);
			rpnCalculator.calculatorHistory.add(operation);
			return true;
		}
	}

}
