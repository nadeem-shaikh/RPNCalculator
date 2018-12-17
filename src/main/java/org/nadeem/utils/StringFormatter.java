package org.nadeem.utils;

import java.math.BigDecimal;

public class StringFormatter {

	public static String stripTrailingZeros(String number) {
		if (number == null) {
			throw new NullPointerException("number is null");
		}
		return new BigDecimal(number).stripTrailingZeros().toPlainString();

	}

}
