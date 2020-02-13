package com.is.projecteuler.multiples;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        System.out.println(Multiple.sumOfMultiples(1000, numbers));

    }

}
