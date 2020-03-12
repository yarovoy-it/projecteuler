package com.is.projecteuler.euler_22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 * <p>
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * <p>
 * What is the total of all the name scores in the file?
 */
public class FileParser {

    private final static String PATH = "./src/main/resources/p022_names.txt";
    private final static String COMMA = ",";

    public static List<String> getFile() {
        List<String> cutString = null;
        try {
            String listString = Files.lines(Paths.get(PATH)).collect(Collectors.joining());
            cutString = split(listString)
                    .stream()
                    .map(str -> str.replaceAll("\"", ""))
                    .sorted()
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cutString;
    }

    private static List<String> split(String str) {
        return Stream.of(str.split(COMMA))
                .map(String::new)
                .collect(Collectors.toList());
    }

    public static Integer getNumberForChar(String character) {
        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals(character)) {
                return i + 1;
            }
        }
        return null;
    }

    public static long getScoreName(List<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("wrong value !! ");
        }
        long result = 0;
        for (int indexOfName = 0; indexOfName < list.size(); indexOfName++) {
            int numberOfABCPosition = 0;
            String currentName = list.get(indexOfName);
            for (int indexOfCharName = 0; indexOfCharName < currentName.length(); indexOfCharName++) {
                char charPosition = currentName.charAt(indexOfCharName);
                numberOfABCPosition += getNumberForChar(Character.toString(charPosition));
            }
            result += numberOfABCPosition * (indexOfName + 1);
        }
        return result;
    }


}
