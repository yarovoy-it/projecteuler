package com.is.projecteuler.euler_16;

import java.math.BigDecimal;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * <p>
 * What is the sum of the digits of the number 2^1000?
 */
public class DigitSum {

    /**
     * Exponentiation
     *
     * @param number
     * @param degree
     * @return number exponentiation
     */
    public static BigDecimal exponentiation(BigDecimal number, BigDecimal degree) {
        if (number == null | degree == null) {
            throw new IllegalArgumentException("Wrong value " + number + " or " + degree);
        }
        if (degree.equals(BigDecimal.ONE)) {
            return number;
        }
        return number.multiply(exponentiation(number, degree.subtract(BigDecimal.ONE)));
    }

    /**
     * Count sum of the digits in the number
     *
     * @param number BigDecimal
     * @return sum
     */
    public static int sumOfDigitNumber(BigDecimal number) {
        if (number == null) {
            throw new IllegalArgumentException("Wrong value " + null);
        }
        String countString = number.toString();
        int result = 0;
        for (int index = 0; index < countString.length(); index++) {
            result += Character.getNumericValue(countString.charAt(index));
        }
        return result;
    }
}
