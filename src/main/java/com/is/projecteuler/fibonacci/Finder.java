package com.is.projecteuler.fibonacci;

public class Finder {

    public static Long evenCounter() {
        Long first = 1L;
        Long second = 0L;
        Long sum = 0L;
        Long evenSum = 0L;
        while (checker(sum)) {
            sum = first + second;
            if (sum % 2 == 0) {
                evenSum = evenSum + sum;
            }
            first = second;
            second = sum;
        }
        return evenSum;
    }

    private static boolean checker(Long sum) {
        Boolean flag = true;
        if (sum < 4_000_000) {
        } else {
            return flag = false;
        }
        return flag;
    }
}
