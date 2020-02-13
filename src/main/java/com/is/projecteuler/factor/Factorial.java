package com.is.projecteuler.factor;

import java.util.ArrayList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Factor {

    /**
     * From number method calculate the factorials and return list
     *
     * @param number  which calculate the factorial
     * @return the list of factorials
     */
    public static List<Long> calculatorFactorial(long number) {
        if (number < 1) {
            throw new IllegalArgumentException("No reason looking for factorial " + number);
        }
        List<Long> factorials = new ArrayList<>();
        for (int divider  = 2; divider  <= number; divider++) {
            while (number % divider  == 0) {
                factorials.add((long) divider );
                number /= divider ;
            }
        }
        return factorials;
    }

}





