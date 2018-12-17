package org.nadeem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) throws IOException {

		// Initialize RPNCalculator Instance;
		RPNCalculator rpnCal = new RPNCalculator();
		// Initialize reader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			// Create Infinite loop to keep reading inputs
			for (;;) {
				// Collect the input into a String
				String s = in.readLine();

				// If input is null then break
				if (s == null)
					break;
				// If input is empty then Display Stack and continue
				if (s.isEmpty()) {
					rpnCal.displayStack();
					continue;
				}
				// Process the Inputs
				rpnCal.processInputs(s);
				// Display Stack after processing Inputs
				rpnCal.displayStack();
			}
		} catch (Exception e) {
			System.err.println("Error" + e);
		}
	}
}