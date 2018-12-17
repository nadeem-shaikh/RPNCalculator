package org.nadeem;

import org.junit.Before;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class RPNCalculatorTest extends TestCase {
	RPNCalculator rpnCalculator = new RPNCalculator();

	@Before
	public void initializeTests() {
		rpnCalculator.stack.clear();
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testExample1() {
		try {
			String inputs = "5 2";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 5 2 "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	
	/**
	 * Rigourous Test :-)
	 */
	public void testExample2() {
		try {
			String inputs = "2 sqrt";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 1.4142135623 "));
			inputs = "clear 9 sqrt";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 3 "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	/**
	 * Rigourous Test :-)
	 */
	public void testExample3() {
		try {
			String inputs = "5 2 -";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 3 "));
			inputs = "3 -";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 0 "));
			inputs = "clear";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	
	/**
	 * Rigourous Test :-)
	 */
	public void testExample4() {
		try {
			String inputs = "5 4 3 2";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 5 4 3 2 "));
			inputs = "undo undo *";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 20 "));
			inputs = "5 *";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 100 "));
			inputs = "undo";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 20 5 "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	
	/**
	 * Rigourous Test :-)
	 */
	public void testExample5() {
		try {
			String inputs = "7 12 2 /";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 7 6 "));
			inputs = "*";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 42 "));
			inputs = "4 /";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 10.5 "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	/**
	 * Rigourous Test :-)
	 */
	public void testExample6() {
		try {
			String inputs = "1 2 3 4 5";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 1 2 3 4 5 "));
			inputs = "*";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 1 2 3 20 "));
			inputs = "clear 3 4 -";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: -1 "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	
	/**
	 * Rigourous Test :-)
	 */
	public void testExample7() {
		try {
			String inputs = "1 2 3 4 5";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 1 2 3 4 5 "));
			inputs = "* * * *";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 120 "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
	
	/**
	 * Rigourous Test :-)
	 */
	public void testExample8() {
		try {
			String inputs = "1 2 3 * 5 + * * 6 5";
			rpnCalculator.processInputs(inputs);
			assertTrue(rpnCalculator.displayStack().equals("stack: 11 "));

		} catch (Exception e) {
			System.err.println("Error - " + e);
		}
	}
}
