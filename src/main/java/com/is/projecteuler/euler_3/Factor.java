package com.is.projecteuler.euler_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Factor {

    /**
     * From number method calculate the prime factors and return list
     *
     * @param number which calculate the prime factors
     * @return the list of prime factors
     */
    public static Set<Long> definerPrimeFactors(long number) {
        if (number < 1) {
            throw new IllegalArgumentException("No reason looking for factor " + number);
        }
        Set<Long> primeFactors = new HashSet<>();
        for (long divider = 2; divider <= number; divider++) {
            while (number % divider == 0) {
                primeFactors.add(divider);
                number /= divider;
            }
        }
        return primeFactors;
    }



}





