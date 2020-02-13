package com.is.projecteuler.multiples;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Multiple {

    /**
     * Sum of multiples below 1000.
     *
     * @param first  the first multiples
     * @param second the second multiples
     * @return the integer
     */
    public static Integer sumOfMultiples(Integer first, Integer second) {
        Integer counter = 1000;
        Integer sum = 0;
        for (int i = 0; i < counter; i++) {
            if (i % first == 0 | i % second == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
