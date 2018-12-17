package org.nadeem.models.operators;

import org.nadeem.RPNCalculator;
import org.nadeem.models.Constants;
import org.nadeem.models.Operation;


public class Undo implements Operator {

	@Override
	public boolean operate(RPNCalculator rpnCalculator) {

		Operation lastOperation = new Operation();
		lastOperation = rpnCalculator.calculatorHistory.get(rpnCalculator.calculatorHistory.size() - 1);

		rpnCalculator.stack.pop();
		if (lastOperation.operator != "Push") {
			String[] operands = lastOperation.operands.toString().split(Constants.DELIMITER);
			int operandsSize = operands.length;
			for (int i = operandsSize - 1; i >= 0; i--) {
				rpnCalculator.stack.push(operands[i]);
			}
		}
		rpnCalculator.calculatorHistory.remove(lastOperation);
		return true;
	}
}
