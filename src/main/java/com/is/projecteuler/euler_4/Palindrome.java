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
            for (int currNumb2 = currNumb1; currNumb2 <= to; currNumb2++) {
                int palindrome = currNumb2 * currNumb1;
                if (isPalindrome(Integer.toString(palindrome)))
                    maxPalindrome = maxPalindrome < palindrome ? palindrome : maxPalindrome;
            }
        }
        return maxPalindrome;
    }

    /**
     * Is palindrome boolean.
     *
     * @param palindrome string
     * @return palindrome or not, the boolean
     */
    public static boolean isPalindrome(String palindrome) {
        if (palindrome == null) {
            throw new IllegalArgumentException("Oooops something wrong with this: " + null);
        }
        return Objects.equals(palindrome, new StringBuilder(palindrome).reverse().toString());
    }
}
