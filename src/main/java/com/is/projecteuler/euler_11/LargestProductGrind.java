package com.is.projecteuler.euler_11;

public class LargestProductGrind {

    public static long getLargestResult(int[][] array) {
        long result = 0;
        result = Math.max(result, getHorizontalLargestResult(array));
        result = Math.max(result, getVerticalLargestResult(array));
        result = Math.max(result, geDiagonallyLeftLargestResult(array));
        result = Math.max(result, geDiagonallyRightLargestResult(array));
        return result;
    }

    public static long getHorizontalLargestResult(int[][] numberArray) {
        long largestSum = 0;
        for (int row = 0; row < numberArray.length; row++) {
            for (int col = 0; col < numberArray[row].length - 3; col++) {
                long currSum = numberArray[row][col] * numberArray[row][col + 1] * numberArray[row][col + 2] * numberArray[row][col + 3];
                largestSum = Math.max(largestSum, currSum);
            }
        }
        return largestSum;
    }

    public static long getVerticalLargestResult(int[][] numberArray) {
        long largestSum = 0;
        for (int row = 0; row < numberArray.length - 3; row++) {
            for (int col = 0; col < numberArray[0].length; col++) {
                long currSum = numberArray[row][col] * numberArray[row + 1][col] * numberArray[row + 2][col] * numberArray[row + 3][col];
                largestSum = Math.max(largestSum, currSum);
            }
        }
        return largestSum;
    }

    public static long geDiagonallyLeftLargestResult(int[][] numberArray) {
        long largestSum = 0;
        for (int row = 0; row < numberArray.length - 3; row++) {
            for (int col = 0; col < numberArray[0].length - 3; col++) {
                long currSum = numberArray[row][col] * numberArray[row + 1][col + 1] * numberArray[row + 2][col + 2] * numberArray[row + 3][col + 3];
                largestSum = Math.max(largestSum, currSum);
            }
        }
        return largestSum;
    }

    public static long geDiagonallyRightLargestResult(int[][] numberArray) {
        long largestSum = 0;
        for (int row = 0; row < numberArray.length - 3; row++) {
            for (int col = 3; col < numberArray[0].length; col++) {
                long currSum = numberArray[row][col] * numberArray[row + 1][col - 1] * numberArray[row + 2][col - 2] * numberArray[row + 3][col - 3];
                largestSum = Math.max(largestSum, currSum);
            }
        }
        return largestSum;
    }


}
