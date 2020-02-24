package com.is.projecteuler.euler_14;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <p>
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 * <p>
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class CollatzSequence {

    /**
     * Define Longest Collatz sequence long.
     *
     * @param stop the stop
     * @return number with the longest sequence
     */
    public static long defineNumberLongestCollatzSequence(long stop) {
        long longestSequence = 0;
        long biggestNumber = 0;
        for (long number = stop; number >= 1; number--) {
            long currentSequence = defineCollatzSequence(number);
            if (currentSequence >= longestSequence) {
                longestSequence = currentSequence;
                biggestNumber = number;
            }
        }
        return biggestNumber;
    }

    /**
     * Define Collatz`s sequence.
     *
     * @param number the number
     * @return Collatz`s sequence of number
     */
    public static long defineCollatzSequence(long number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        long counter = 1;
        if (number % 2 == 0) {
            counter += defineCollatzSequence(number / 2);
        } else {
            counter += defineCollatzSequence((3 * number) + 1);
        }
        return counter;
    }
}
