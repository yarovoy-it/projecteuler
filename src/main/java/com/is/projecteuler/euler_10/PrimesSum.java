package com.is.projecteuler.euler_10;

/**
 * he sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class PrimesSum {

    /**
     * Sum of simple number long.
     *
     * @param number the number
     * @return the long
     */
    public static long SumOfSimpleNumber(long number) {
        long sum = 0;
        for (long prime = 2; prime < number; prime++) {
            if (isPrime(prime)) {
                sum += prime;
            }
        }
        return sum;
    }

    /**
     * Define number is prime
     *
     * @param number for inspect
     * @return false not true prime
     */
    private static boolean isPrime(long number) {
        for (long index = 2; index * index <= number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }
}
