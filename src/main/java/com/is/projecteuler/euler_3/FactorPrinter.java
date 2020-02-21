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
     * @param number, value degree
     */
    public static void printViewNumberDividerDegree(long number) {
        System.out.print(number + " = ");
        Map<Integer, Integer> map = collectNumberDegreeToMap(number);
        int counter = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            printNumberDegree(entry.getKey(), entry.getValue());
            if (map.size() > counter)
                System.out.print(" * ");
            counter++;
        }
        System.out.println();
    }

    /**
     * Define simple divider and its degree collect to map,
     *
     * @param number the number which will print
     */
    private static Map<Integer, Integer> collectNumberDegreeToMap(long number) {
        Map<Integer, Integer> dividerDegree = new HashMap<>();
        int countDegree = 0;
        for (int divider = 2; divider <= number; divider++) {
            while (number % divider == 0) {
                number /= divider;
                countDegree++;
                dividerDegree.put(divider, countDegree);
            }
            countDegree = 0;
        }
        return dividerDegree;
    }

    /**
     * Prints degree`s sign or does not print if the number does not have a degree.
     * Support printShortVariation method
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
