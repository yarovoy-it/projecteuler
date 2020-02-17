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
    public static int smallestSimpleDiviner(int to) {
        if (1 > to) {
            throw new IllegalArgumentException("Not correct value this number can not be less then " + to);

        }
        int divisible = 1;
        while (!isDivisible(divisible, to)) {
            divisible++;
        }
        return divisible;
    }

    /**
     * If smallest positive number that is evenly divisible by all of the numbers from 1 to stopper, will be find
     * return true otherwise false.
     *
     * @param number
     * @param stopper looking until stopper
     * @return true if divider without remainder otherwise false
     */
    private static boolean isDivisible(int number, int stopper) {
        for (int checker = 1; checker <= stopper; checker++) {
            if (number % checker != 0) {
                return false;
            }
        }
        return true;
    }
}
