package com.is.projecteuler.square;

public class Square {

    public static Integer differenceSquare(Integer squareSum, Integer naturalNumber) {
        Integer curr = 0;
        for (int i = 0; i <= naturalNumber; i++) {
            curr += i * i;
        }
        Integer sum = (squareSum * (squareSum + 1)) / 2;
        return sum * sum - curr;
    }

}
