package com.is.projecteuler.euler_13;

import static com.is.projecteuler.euler_13.LargeSum.getSum;

public class Runner {

    public static void main(String[] args){

        System.out.println(getSum(Storage.loadStringOfNumber()));
    }
}
