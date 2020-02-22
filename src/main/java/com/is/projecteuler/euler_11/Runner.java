package com.is.projecteuler.euler_11;

import static com.is.projecteuler.euler_11.LargestProduct.getLargestSum;
import static com.is.projecteuler.euler_11.LargestProductGrind.getLargestResult;


public class Runner {

    public static void main(String[] args) {


        System.out.println(getLargestResult(Storage.getNumbers()));
        System.out.println(getLargestSum(Storage.getNumbers(), 4));
    }

}
