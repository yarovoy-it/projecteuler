package com.is.projecteuler.euler_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static int countMaxElements(String[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is empty " + null);
        }
        for (String currentArray : array) {
            System.out.println(currentArray);
        }
        return 0;
    }

    public static Map<Integer, List<Integer>> parserStringArrayToMap(String[] array) {
        Map<Integer, List<Integer>> powValueMap = new HashMap<>();
        for (int indexString = 0; indexString < array.length; indexString++) {
            String[] temp = array[indexString].split(" ");
            List<Integer> listValue = new ArrayList<>();
            for (int index = 0; index < temp.length; index++) {
                listValue.add(Integer.parseInt(temp[index]));
            }
            powValueMap.put(indexString, listValue);
        }
        return powValueMap;
    }


}
