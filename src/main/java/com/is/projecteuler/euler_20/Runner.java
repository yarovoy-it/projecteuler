package com.is.projecteuler.euler_20;

import java.math.BigDecimal;

import static com.is.projecteuler.euler_20.Factorial.sumOfDigitNumber;
import static com.is.projecteuler.euler_20.Factorial.getFactorial;

public class Runner {

    public static void main(String[] args){

        System.out.println(getFactorial(BigDecimal.valueOf(10)));
        System.out.println(sumOfDigitNumber(getFactorial(BigDecimal.valueOf(100))));
    }

}
