package org.nadeem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.nadeem.models.Constants;
import org.nadeem.models.Operation;
import org.nadeem.models.operators.Operator;
import org.nadeem.models.operators.OperatorFactory;
import org.nadeem.utils.StringFormatter;

public class RPNCalculator {

	public Stack<String> stack = new Stack<String>();
	public List<Operation> calculatorHistory = new ArrayList<Operation>();

	public RPNCalculator() {
	}

	public String displayStack() {
		String stackSTR = "stack: ";
		for (String str : stack) {
			//Display only 10 decimals if more than 10 Decimal Places Exist
			str = String.format("%.11f", Double.parseDouble(str));
			str = str.substring(0, str.length()- 1);
			//Strip Trailing Zeros in the String
			stackSTR += StringFormatter.stripTrailingZeros(str) + Constants.SPACE;
		}
		System.out.println(stackSTR);
		return stackSTR;
	}

	public void processInputs(String inputs) {
		try {
			List<String> stackSTRList = new ArrayList<String>();
			stackSTRList.addAll(Arrays.asList(inputs.trim().split(" ")));
			for (String str : stackSTRList) {
				//Create Operator Object using Factory
				Operator operator = OperatorFactory.createOperator(this, str);
				if (operator != null) {
					//Perform Operation. If Operations returns false then break execution 
					if(!operator.operate(this))
						break;
				} else {
					if (str.matches("^[0-9]+$")) {
						stack.push(str);
						Operation operation = new Operation();
						operation.operator = "Push";
						operation.operands = str;
						// Add operation to History
						calculatorHistory.add(operation);
					} else {
						System.err.println("Invalid Operator Found");
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
}