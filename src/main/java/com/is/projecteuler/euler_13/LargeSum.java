package com.is.projecteuler.euler_13;

import java.math.BigDecimal;

/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * String should loading from storage.
 */
public class LargeSum {

    public static BigDecimal getSum(String stringNumbers) {
        BigDecimal sum = new BigDecimal("0");
        if (stringNumbers == null | stringNumbers.length() < 1) {
            throw new IllegalArgumentException("Not correct value");
        }
        for (int index = 0; index < stringNumbers.length(); index++) {
            BigDecimal temporary = BigDecimal.valueOf(Character.getNumericValue(stringNumbers.charAt(index)));
            sum = sum.add(temporary);
        }
        return sum;
    }


}
