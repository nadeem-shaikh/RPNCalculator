package org.nadeem.models.operators;

import org.nadeem.RPNCalculator;

public class Clear implements Operator {
	@Override
	public boolean operate(RPNCalculator rpnCalculator) {
		rpnCalculator.stack.clear();
		return true;
	}

}
