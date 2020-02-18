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

//    /**
//     * Define factors from list then put in map, where key is number, value is list of prime factors
//     *
//     * @param numbers list of number
//     * @return map key is number value is list of prime factors
//     */
//    public static Map<Long, Set<Long>> definerPrimeFactors(List<Long> numbers) {
//        if (numbers == null) {
//            throw new IllegalArgumentException("No reason looking for prime factors " + null);
//        }
//        Map<Long, Set<Long>> mapOfPrimeFactors = new HashMap<>();
//        for (Long numberForPrimeFactor : numbers) {
//            if (numberForPrimeFactor != null)
//                mapOfPrimeFactors.put(numberForPrimeFactor, definerPrimeFactors(numberForPrimeFactor));
//        }
//
//        return mapOfPrimeFactors;
//    }

//    /**
//     * Define all dividers
//     *
//     * @param number for defining list of divider
//     * @return list of dividers
//     */
//    public static List<Integer> definerAllDivider(long number) {
//        List<Integer> dividers = new ArrayList<>();
//        for (int divider = 1; divider <= number; divider++) {
//            if (number % divider == 0)
//                dividers.add(divider);
//        }
//        return dividers;
//    }

    /**
     * Define simple divider and print of them in a short variation
     *
     * @param number the number which will print
     */
    public static Map<Integer, Integer> definerSimpleDivider(long number) {
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
        printShortVariation(divinerDegree);
    }

    /**
     * Prints shortcut view of number and degree with sign of multiplication.
     * Include methods printSymbol and printSymbol
     * Get map from definerSimpleDivider.
     *
     * @param map key number, value degree
     */
    private static void printShortVariation(Map<Integer, Integer> map) {
        int counter = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            printSymbol(entry.getKey(), entry.getValue());
            printSymbol(map.size() > counter);
            counter++;
        }
    }

    /**
     * Prints degree`s sign or does not print if the number does not have a degree.
     * Support printShortVariation method
     *
     * @param key   number
     * @param value degree
     */
    private static void printSymbol(Integer key, Integer value) {
        if (value <= 1) {
            System.out.print(key + " ");
        } else {
            System.out.print(key + "^" + value);
        }
    }
}





