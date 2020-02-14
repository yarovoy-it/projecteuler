package com.is.projecteuler.euler_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Factor {

    /**
     * From number method calculate the factors and return list
     *
     * @param number which calculate the factors
     * @return the list of factorials
     */
    public static List<Long> calculatorFactors(long number) {
        if (number < 1) {
            throw new IllegalArgumentException("No reason looking for factor " + number);
        }
        List<Long> factors = new ArrayList<>();
        for (int divider = 2; divider <= number; divider++) {
            while (number % divider == 0) {
                factors.add((long) divider);
                number /= divider;
            }
        }
        return factors;
    }

    /**
     * Calculate factors from list then put in map, where key is number, value is list of factors
     *
     * @param numbers list of number
     * @return map key is number value is list of factors
     */
    public static Map<Long, List<Long>> calculatorFactors(List<Long> numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("No reason looking for factors " + numbers);
        }
        Map<Long, List<Long>> mapOfFactors = new HashMap<>();
        for (Long numberForFactor : numbers) {
            if (numberForFactor != null)
                mapOfFactors.put(numberForFactor, calculatorFactors(numberForFactor));
        }

        return mapOfFactors;
    }

}





