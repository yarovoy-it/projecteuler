package com.is.projecteuler.euler_17;

import java.util.HashMap;
import java.util.Map;

/**
 * Storage which keep arrays of latter numbers
 */
public class LatterNumberStorage {

    public static Map<Integer, String> tens() {
        Map<Integer, String> tens = new HashMap<>();
        tens.put(0, "");
        tens.put(1, "ten");
        tens.put(2, "twenty");
        tens.put(3, "thirty");
        tens.put(4, "forty");
        tens.put(5, "fifty");
        tens.put(6, "sixty");
        tens.put(7, "seventy");
        tens.put(8, "eighty");
        tens.put(9, "ninety");
        return tens;
    }


    public static Map<Integer, String> ones() {
        Map<Integer, String> ones = new HashMap<>();
        ones.put(0, "");
        ones.put(1, "one");
        ones.put(2, "two");
        ones.put(3, "three");
        ones.put(4, "four");
        ones.put(5, "five");
        ones.put(6, "six");
        ones.put(7, "seven");
        ones.put(8, "eight");
        ones.put(9, "nine");
        ones.put(10, "ten");
        ones.put(11, "eleven");
        ones.put(12, "twelve");
        ones.put(13, "thirteen");
        ones.put(14, "fourteen");
        ones.put(15, "fifteen");
        ones.put(16, "sixteen");
        ones.put(17, "seventeen");
        ones.put(18, "eighteen");
        ones.put(19, "nineteen");
        return ones;
    }


}
