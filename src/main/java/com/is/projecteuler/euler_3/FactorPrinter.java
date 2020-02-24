package com.is.projecteuler.euler_3;

import java.util.HashMap;
import java.util.Map;

/**
 * Print factor
 */
public class FactorPrinter {

    /**
     * Prints shortcut view of number and degree with sign of multiplication.
     * Include methods printSymbol and definerSimpleDividerToMap
     *
     * @param number long value
     */
    public static void printSimpleNumberDividers(long number) {
        System.out.print(number + " = ");
        Map<Integer, Integer> dividerDegreeMap = collectNumberDegreeMap(number);
        int counter = 1;
        for (Map.Entry<Integer, Integer> entry : dividerDegreeMap.entrySet()) {
            printNumberDegree(entry.getKey(), entry.getValue());
            if (dividerDegreeMap.size() > counter)
                System.out.print(" * ");
            counter++;
        }
        System.out.println();
    }

    /**
     * Define simple divider and degree, collect to map
     *
     * @param number the number for parsing
     */
    private static Map<Integer, Integer> collectNumberDegreeMap(long number) {
        Map<Integer, Integer> dividerDegreeMap = new HashMap<>();
        int countDegree = 0;
        for (int divider = 2; divider <= number; divider++) {
            while (number % divider == 0) {
                number /= divider;
                countDegree++;
                dividerDegreeMap.put(divider, countDegree);
            }
            countDegree = 0;
        }
        return dividerDegreeMap;
    }

    /**
     * Prints degree`s sign or does not print if the number does not have a degree.
     *
     * @param number number
     * @param degree degree
     */
    private static void printNumberDegree(int number, int degree) {
        if (degree <= 1) {
            System.out.print(number + " ");
        } else {
            System.out.print(number + "^" + degree);
        }
    }
}
