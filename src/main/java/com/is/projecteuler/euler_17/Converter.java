package com.is.projecteuler.euler_17;

import java.util.Objects;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * <p>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * <p>
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */
public class Converter {

    private static final int TEN = 10;
    private static final int TWENTY = 20;
    private static final int ONE_HUNDRED = 100;
    private static final int ONE_THOUSAND = 1000;
    private static final String HYPHEN = "-";

    /**
     * Get latter numbers form array of value.
     *
     * @param number int value
     * @return number of string
     */
    public static String getLatterNumber(int number) {
        String withAnd = "";
        String withHyphen = "";
        if (number > ONE_THOUSAND) {
            throw new IllegalArgumentException("Number have to be less then " + ONE_THOUSAND);
        }
        if (number == ONE_THOUSAND) {
            return "one thousand";
        }
        if (number < TWENTY) {
            return LatterNumberStorage.ones()[number];
        }
        if (number < ONE_HUNDRED) {
            withHyphen = getLatterNumber(number % TEN);
            if (withHyphen.length() > 0) {
                withHyphen = HYPHEN + withHyphen;
            }
            return LatterNumberStorage.tens()[number / TEN] + withHyphen;
        }
        if (number < ONE_THOUSAND) {
            withAnd = getLatterNumber(number % ONE_HUNDRED);
            if (withAnd.length() > 0) {
                withAnd = " and " + withAnd;
            }
            return LatterNumberStorage.hundreds()[number / ONE_HUNDRED] + withAnd;
        }
        return null;
    }

    /**
     * From 1 to number get latter numbers and count string length
     *
     * @param number until which the number
     * @return count
     */
    public static long countNumberLatter(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Can not be ZERO ");
        }
        long sumOfLatter = 0;
        for (int currNumber = 1; currNumber <= number; currNumber++) {
            sumOfLatter += countLengthStringExcludeSpace(Objects.requireNonNull(getLatterNumber(currNumber)));
        }
        return sumOfLatter;
    }

    /**
     * Replace spaces and hyphens then return length of string
     *
     * @param string for define length
     * @return length of string
     */
    public static int countLengthStringExcludeSpace(String string) {
        return string.replaceAll("\\s+", "").replaceAll(HYPHEN, "").length();
    }


}
