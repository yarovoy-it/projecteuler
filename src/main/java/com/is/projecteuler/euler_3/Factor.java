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

    /**
     * Prints shortcut view of number and degree with sign of multiplication.
     * Include methods printSymbol and printSymbol
     * Get map from definerSimpleDivider.
     *
     * @param number, value degree
     */
    public static void printDividerDegree(long number) {
        System.out.print(number + " = ");
        Map<Integer, Integer> map = definerSimpleDivider(number);
        int counter = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            printSymbol(entry.getKey(), entry.getValue());
            if (map.size() > counter)
                System.out.print(" * ");
            counter++;
        }
        System.out.println();
    }

    /**
     * Define simple divider return map
     *
     * @param number the number which will print
     */
    private static Map<Integer, Integer> definerSimpleDivider(long number) {
        Map<Integer, Integer> divinerDegree = new HashMap<>();
        int countDegree = 0;
        for (int divider = 2; divider <= number; divider++) {
            while (number % divider == 0) {
                number /= divider;
                countDegree++;
                divinerDegree.put(divider, countDegree);
            }
            countDegree = 0;
        }
        return divinerDegree;
    }

    /**
     * Prints degree`s sign or does not print if the number does not have a degree.
     * Support printShortVariation method
     *
     * @param key   number
     * @param value degree
     */
    private static void printSymbol(int key, int value) {
        if (value <= 1) {
            System.out.print(key + " ");
        } else {
            System.out.print(key + "^" + value);
        }
    }

}





