package com.is.projecteuler.euler_5;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Multiple {

    /**
     * Smallest positive number that is evenly divisible by all of the numbers from 1 to "int to".
     *
     * @param to number until what will searching evenly divisible.
     * @return evenly divisible.
     */
    public static int defineSmallestDividedNumber(int to) {
        if (1 > to) {
            throw new IllegalArgumentException("Not correct value this number can not be less then " + to);
        }
        int divisibleNumber = 1;
        while (!isDivisible(divisibleNumber, to)) {
            divisibleNumber++;
        }
        return divisibleNumber;
    }

    /**
     * If smallest positive number that is evenly divisible by all of the numbers from 1 to stopper, will be find
     * return true otherwise false.
     *
     * @param number divisible number
     * @param stopper looking until stopper
     * @return true if divider without remainder otherwise false
     */
    private static boolean isDivisible(int number, int stopper) {
        for (int divider = 1; divider <= stopper; divider++) {
            if (number % divider != 0) {
                return false;
            }
        }
        return true;
    }
}
