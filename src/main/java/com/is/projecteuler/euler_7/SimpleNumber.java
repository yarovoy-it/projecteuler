package com.is.projecteuler.euler_7;


/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 */
public class SimpleNumber {

    /**
     * Define simple number, serialPrimeNumber is prime number.
     *
     * @param serialPrimeNumber the serial prime number
     * @return last prime number
     */
    public static int defineSimpleNumber(int serialPrimeNumber) {
        int counter = 0;
        int lastSimpleNumber = 0;
        int checkerNumber = 1;
        while (counter <= serialPrimeNumber) {
            if (isSimple(checkerNumber)) {
                lastSimpleNumber = checkerNumber;
                counter++;
            }
            checkerNumber++;
        }
        return lastSimpleNumber;
    }

    /**
     * Define prime number or not
     *
     * @param number for define
     * @return if number is prime return true
     */
    private static boolean isSimple(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
