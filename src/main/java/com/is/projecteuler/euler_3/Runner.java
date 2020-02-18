package com.is.projecteuler.euler_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.is.projecteuler.euler_3.Factor.definerSimpleDivider;
import static com.is.projecteuler.euler_3.Factor.printShortFormula;


public class Runner {

    public static void main(String[] args) {
        List<Long> longs = new ArrayList<>();
//        System.out.println(definerSimpleDivider(2000));
//        mapCollector(definerSimpleDivider(2000));
//        printer();
        Map<Integer, Integer> map = definerSimpleDivider(2000000);
        printShortFormula(map);
//        System.out.println(printShortVariation(20));
//        definerSimpleDivider(20);
//        longs.add(20L);
//        longs.add(13195L);
//        longs.add(600851475143L);
//        System.out.println(definerPrimeFactors(longs));

    }

}
