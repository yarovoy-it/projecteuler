package com.is.projecteuler.euler_20;

import java.math.BigDecimal;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * <p>
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * <p>
 * Find the sum of the digits in the number 100!
 */
public class Factorial {

    /**
     * Get factorial
     *
     * @param number BigDecimal
     * @return factorial of number
     */
    public static BigDecimal getFactorial(BigDecimal number) {
        if (number.equals(BigDecimal.valueOf(1))) {
            return BigDecimal.valueOf(1);
        }
        return number.multiply(getFactorial(number.subtract(BigDecimal.valueOf(1))));
    }

    /**
     * Count sum of the digits in the number
     *
     * @param number BigDecimal
     * @return sum
     */
    public static int sumOfDigitNumber(BigDecimal number) {
        if (number == null) {
            throw new IllegalArgumentException("Wrong value");
        }
        String countString = number.toString();
        int result = 0;
        for (int index = 0; index < countString.length(); index++) {
            result += Character.getNumericValue(countString.charAt(index));
        }
        return result;
    }


}
