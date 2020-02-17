package com.is.projecteuler.euler_6;


/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 12+22+...+102=385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1+2+...+10)2=552=3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Square {

    /**
     * Difference between the sum of the squares of the "number" and the square of the sum
     *
     * @param number will get the sum of the squares and the square of the sum
     * @return difference between the sum of the squares and the square of the sum
     */
    public static int differenceSumOfSquareAndSquareOfSum(int number) {
        return squareOfSum(number) - SumOfSquare(number);
    }

    /**
     * Sum of square take each number from 0 to endNumber and multiple itself then sum.
     *
     * @param endNumber the last number of square
     * @return sum of square
     */
    private static int SumOfSquare(int endNumber) {
        int sumOfSquare = 0;
        for (int numberNumber = 0; numberNumber <= endNumber; numberNumber++) {
            sumOfSquare += numberNumber * numberNumber;
        }
        return sumOfSquare;
    }

    /**
     * Sum of the squares of "number" natural numbers
     *
     * @param number from it will get sum of square
     * @return Sum of the squares
     */
    public static int squareOfSum(int number) {
        int sum = (number * (number + 1)) / 2;
        return sum * sum;
    }
}
