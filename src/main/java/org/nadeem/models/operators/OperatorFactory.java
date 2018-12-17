package org.nadeem.models.operators;

import org.nadeem.RPNCalculator;
import org.nadeem.models.Constants;

public class OperatorFactory {

	private OperatorFactory() {
		throw new RuntimeException("Not instantiable!");
	}

	public static Operator createOperator(RPNCalculator rpnCalculator, String operator) {
		Operator op = null;
		switch (operator) {
		case Constants.ADDITION:
			op = new Addition();
			break;
		case Constants.SUBSTRACTION:
			op = new Substraction();
			break;
		case Constants.MULTIPLICATION:
			op = new Multiplication();
			break;
		case Constants.DIVISION:
			op = new Division();
			break;
		case Constants.SQUAREROOT:
			op = new SquareRoot();
			break;
		case Constants.CLEAR:
			op = new Clear();
			break;
		case Constants.UNDO:
			op = new Undo();
			break;
		}
		return op;

	}

}
