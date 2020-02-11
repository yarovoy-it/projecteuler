package com.is.projecteuler.factor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static List<Long> counter(Long number) {
        List<Long> factors = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                factors.add((long) i);
                number = number / i;
            }
        }
        if (number != 1) {
            factors.add(number);
        }
        return factors;
    }
}





