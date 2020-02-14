package com.is.projecteuler.factor;

import java.util.ArrayList;
import java.util.List;

import static com.is.projecteuler.factor.Factorial.calculatorFactorial;

public class Runner {

    public static void main(String[] args) {
        List<Long> longs = new ArrayList<>();
        longs.add(13195L);
        longs.add(13195L);
        longs.add(600851475143L);
        System.out.println(calculatorFactorial(13195));
    }

}
