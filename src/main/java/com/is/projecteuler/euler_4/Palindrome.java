package com.is.projecteuler.euler_4;

import java.util.Objects;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Palindrome {

    /**
     * Find the largest palindrome "from" number until "to".
     * <p>
     * A palindromic number reads the same both ways
     *
     * @return largest palindrome
     */
    public static long findLargestPalindrome(int from, int to) {
        if (from < 0 || to <= from) {
            throw new IllegalArgumentException("Not correct value this number can not be negative " + from +
                    " or more then this " + to);
        }
        long maxPalindrome = 0;
        for (int currNumb1 = to; currNumb1 >= from; currNumb1--) {
            for (int currNumb2 = to; currNumb2 >= currNumb1; currNumb2--) {
                int number = currNumb2 * currNumb1;
                if (isPalindrome(Integer.toString(number))) {
                    maxPalindrome = maxPalindrome < number ? number : maxPalindrome;
                    break;
                }
            }
        }
        return maxPalindrome;
    }

    /**
     * Is palindrome boolean.
     *
     * @param string string
     * @return if palindrome true otherwise false
     */
    public static boolean isPalindrome(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Oooops something wrong with this: " + null);
        }
        return Objects.equals(string, new StringBuilder(string).reverse().toString());
    }
}
