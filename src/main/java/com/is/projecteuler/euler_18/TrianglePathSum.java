package com.is.projecteuler.euler_18;

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * <p>
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * <p>
 * That is, 3 + 7 + 4 + 9 = 23.
 * <p>
 * Find the maximum total from top to bottom of the triangle below:
 * <p>
 * load triangle from Storage
 */
public class TrianglePathSum {

    public static int findMaxValuePath(int[][] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty " + null);
        }
        for (int row = array.length - 2; row >= 0; row--) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] += Math.max(array[row + 1][col], array[row + 1][col + 1]);
                System.out.println(array[row][col]);
            }
        }
        return array[0][0];
    }


}
