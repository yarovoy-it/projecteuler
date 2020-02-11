package com.is.projecteuler.multiples;

public class Multiple {

    public static Integer finder(Integer first, Integer second) {
        Integer multiple = 1000;
        Integer sum = 0;
        for (int i = 0; i < multiple; i++) {
            if (i % first == 0 | i % second == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
