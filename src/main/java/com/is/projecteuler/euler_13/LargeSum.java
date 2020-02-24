package com.is.projecteuler.euler_13;

import java.math.BigInteger;

/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * String should loading from storage.
 */
public class LargeSum {

    private static final int RESULT_NUMBER = 10;

    /**
     * Count sum of numbers from array.
     *
     * @param arrayNumbers the array numbers
     * @return the sum
     */
    public static String getSum(String[] arrayNumbers) {
        if (arrayNumbers == null | arrayNumbers.length < 1) {
            throw new IllegalArgumentException("Not correct value");
        }
        BigInteger sum = BigInteger.ZERO;
        for (String tempString : arrayNumbers) {
            sum = sum.add(new BigInteger(tempString));
        }
        return sum.toString().substring(0, RESULT_NUMBER);
    }


}
