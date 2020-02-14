package com.is.projecteuler.factor;

import java.util.ArrayList;
import java.util.List;

import static com.is.projecteuler.factor.Factorial.calculatorFactorial;
import static com.is.projecteuler.factor.Factorial.calculatorFactorials;

public class Runner {

    public static void main(String[] args) {
        List<Long> longs = new ArrayList<>();
        longs.add(13195L);
        longs.add(13195L);
        longs.add(null);
        longs.add(600851475143L);

        System.out.println(calculatorFactorials(longs));
        System.out.println(calculatorFactorial(13195));
    }

}
