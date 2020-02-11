package com.is.projecteuler.multiple;

public class Multiple {

    public static Integer multipleFounder(){
        int min = 1;
        while (!isDividend(min)){
            min++;
        }
        return min;
    }

    public static boolean isDividend(Integer number) {
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
