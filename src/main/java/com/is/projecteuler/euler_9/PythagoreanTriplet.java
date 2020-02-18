package com.is.projecteuler.euler_9;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class PythagoreanTriplet {

    public static void definerPythagoreanTriplet(int nearestNumber) {
        for (int a = 1; a < nearestNumber; a++) {
            for (int b = a; b < nearestNumber; b++) {
                int c = nearestNumber - a - b;
                if (a * a + b * b == c * c) {
                    System.out.println(a + " " + b + " " + c);
                }
            }

        }
    }
}
