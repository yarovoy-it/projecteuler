package com.is.projecteuler.euler_10;

/**
 * he sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class PrimesSum {

    public static long SumOfSimpleNumber(long number) {
        long sum = 0;
        for (int index = 2; index < number; index++) {
            if (isSimple(index)) {
                sum += index;
            }

        }
        return sum;
    }

    /**
     * testing methods dosen`t work
     *
     * @param number
     * @return
     */
    // TODO: 2/21/20
    public static int SumOfSimpleNumberByRec(int number) {
        int sum = 0;
        int garbege = 0;
        if (number < 2) {
            return 0;
        }
        sum = SumOfSimpleNumberByRec(number - 1);
        System.out.println();
        if (isSimple(sum)) {
            return sum += number;
        } else {
            garbege += number;
        }
        return sum;
    }

    private static boolean isSimple(int number) {
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }
}
