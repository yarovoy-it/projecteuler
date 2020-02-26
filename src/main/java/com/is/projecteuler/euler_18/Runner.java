package com.is.projecteuler.euler_18;


import static com.is.projecteuler.euler_18.Storage.loadArray;
import static com.is.projecteuler.euler_18.TrianglePathSum.findMaxValuePath;

public class Runner {

    public static void main(String[] args) {

        System.out.println(findMaxValuePath(loadArray()));

    }
}
