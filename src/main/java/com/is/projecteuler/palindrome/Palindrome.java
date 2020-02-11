package com.is.projecteuler.palindrome;

import java.util.Objects;

public class Palindrome {

    public static long finder() {
        Integer palindrome = 0;
        for (int i = 999; i >= 100; i--) {
            for (int x = i; x <= 999; x++) {
                int temp = x * i;
                if (isPalindrome(temp))
                    palindrome = palindrome < temp ? temp : palindrome;
            }
        }
        return palindrome;
    }

    public static Boolean isPalindrome(Integer number) {
        return Objects.equals(number, Integer.parseInt(new StringBuilder(number.toString()).reverse().toString()));
    }
}
