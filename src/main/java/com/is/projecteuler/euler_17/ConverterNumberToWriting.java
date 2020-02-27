package com.is.projecteuler.euler_17;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * <p>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * <p>
 * NOTE: Do not count spaces or hyphens.
 * For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */
public class ConverterNumberToWriting {

    private static final int TEN = 10;
    private static final int TWENTY = 20;
    private static final int ONE_HUNDRED = 100;
    private static final int ONE_THOUSAND = 1000;
    private static final String HUNDRED = " hundred";
    private static final String HYPHEN = "-";

    /**
     * Get latter numbers form array of value.
     *
     * @param number int value
     * @return number of string
     */
    public static String getLatterNumber(int number) {
        if (number > ONE_THOUSAND) {
            throw new IllegalArgumentException("Number have to be less then " + ONE_THOUSAND + " or bigger then 0 our value = " + number);
        }
        if (number == ONE_THOUSAND) {
            return "one thousand";
        }
        if (number < TWENTY) {
            return LatterNumberStorage.ones().get(number);
        }
        if (number < ONE_HUNDRED) {
            String withHyphen = getLatterNumber(number % TEN);
            if (withHyphen.length() > 0) {
                withHyphen = HYPHEN + withHyphen;
            }
            return LatterNumberStorage.tens().get(number / TEN) + withHyphen;
        }
        String withAnd = getLatterNumber(number % ONE_HUNDRED);
        if (withAnd.length() > 0) {
            withAnd = " and " + withAnd;
        }
        return LatterNumberStorage.ones().get(number / ONE_HUNDRED) + HUNDRED + withAnd;
    }

    /**
     * From 1 to number get latter numbers and count string length
     *
     * @param numberFrom start number
     * @param numberTo   end number
     * @return count
     */
    public static long countNumberLatter(int numberFrom, int numberTo) {
        if (numberFrom < 1 || numberFrom > numberTo) {
            throw new IllegalArgumentException("Can not be less then ZERO or " + numberFrom + " have to be less then " + numberTo);
        }
        long sumOfLatter = 0;
        for (int currNumber = numberFrom; currNumber <= numberTo; currNumber++) {
            String temporaryNumber = getLatterNumber(currNumber);
            sumOfLatter += countLengthStringExcludeSpace(temporaryNumber);
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
        if (string == null) {
            throw new IllegalArgumentException("Not correct value " + null);
        }
        return string.replaceAll("\\s+", "").replaceAll(HYPHEN, "").length();
    }


}
