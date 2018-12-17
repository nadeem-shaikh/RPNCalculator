package org.nadeem.models.operators;

import org.nadeem.RPNCalculator;
import org.nadeem.models.Constants;
import org.nadeem.models.Operation;

public class Division implements Operator {
	@Override
	public boolean operate(RPNCalculator rpnCalculator) {
		if (rpnCalculator.stack.size() > 1) {
			//Pop Value from Stack and parse to Double
			double firstOperand = Double.parseDouble(rpnCalculator.stack.pop());
			//Pop Value from Stack and parse to Double
			double secondOperand = Double.parseDouble(rpnCalculator.stack.pop());
			// Perform Division Operation and Push the result to Stack
			rpnCalculator.stack.push(Double.toString(secondOperand / firstOperand));
			
			Operation operation = new Operation();
			operation.operator = Constants.DIVISION;
			operation.operands = firstOperand + Constants.DELIMITER + secondOperand;
			//Add the operation performed into the operations list for audit
			rpnCalculator.calculatorHistory.add(operation);
			return true;
		} else {
			int operatorPosition = rpnCalculator.calculatorHistory.size() + 1;
			System.out.println("operator / (position: " + operatorPosition + "): insufficient parameters");
			return false;
		}
	}

}
