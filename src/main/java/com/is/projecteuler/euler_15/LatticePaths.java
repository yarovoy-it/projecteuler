package com.is.projecteuler.euler_15;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * <p>
 * <p>
 * How many such routes are there through a 20×20 grid?
 */
public class LatticePaths {

    /**
     * searching all possible ways from matrix size
     *
     * @param size the size of web
     * @return the long
     */
    public static long searchRoutes(int size) {
        long paths = 1;
        for (int index = 0; index < size; index++) {
            paths *= (2 * size) - index;
            paths /= index + 1;
        }
        return paths;
    }
}
