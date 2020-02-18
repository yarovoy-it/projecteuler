package com.is.projecteuler.euler_10;

/**
 * he sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class PrimesSum {

    public static long SumOfSimpleNumber(long number) {
        long sum = 0;
        for (int i = 2; i < number; i++) {
            if (isSimple(i)) {
                sum += i;
            }

        }
        return sum;
    }


    private static boolean isSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
