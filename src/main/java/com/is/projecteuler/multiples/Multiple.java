package com.is.projecteuler.multiples;

import java.util.List;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Multiple {

    /**
     * Sum of list multiples below count.
     *
     * @param multiples   List of numbers multiples
     * @param numberBelow Until what number can get sum of multiples from list of multiples les
     * @return sum of all the multiples below count, the integer
     */
    public static int sumOfMultiples(int numberBelow, List<Integer> multiples) {
        int result = 0;
        if (numberBelow > 0) {
            for (int inspectorNumber = 0; inspectorNumber < numberBelow; inspectorNumber++) {
                if (isMultiples(inspectorNumber, multiples)) {
                    result += inspectorNumber;
                }
            }
            return result;
        }
        throw new IllegalArgumentException("Not correct value " + numberBelow);
    }

    /**
     * Check by checkerOfMultiples all integers from list of multiples
     *
     * @param checkerOfMultiples inspector of number
     * @param multiples List of divider
     * @return boolean. Is the number a multiple
     */
    private static boolean isMultiples(int checkerOfMultiples, List<Integer> multiples) {
        for (Integer divider : multiples) {
            if (divider != null && divider != 0) {
                if (checkerOfMultiples % divider == 0) {
                    return true;
                }
            }
        }
        return false;
    }

}
