package com.is.projecteuler.euler_16;

import java.math.BigDecimal;

import static com.is.projecteuler.euler_16.DigitSum.exponentiation;
import static com.is.projecteuler.euler_16.DigitSum.sumOfDigitNumber;

public class Runner {

    public static void main(String[] args) {

        System.out.println(exponentiation(new BigDecimal(2), new BigDecimal(1000)));
        System.out.println(sumOfDigitNumber(exponentiation(new BigDecimal(2), new BigDecimal(1000))));


    }
}
