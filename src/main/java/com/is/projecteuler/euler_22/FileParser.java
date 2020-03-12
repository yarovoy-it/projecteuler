package com.is.projecteuler.euler_22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
public class FileParser {

    private final static String PATH = "./src/main/resources/p022_names.txt";
    private final static String COMMA = ",";
    private final static String QUOTES = "";


    public static void getFile() {
        try {
//            List<String> strings = Files
//                    .lines(Paths.get(PATH))
//                    .map(str -> str.split(COMMA))
//                    .map(Arrays::toString)
//                    .map(str -> str.replaceAll("\"", QUOTES))
////                    .sorted()
//                    .peek(System.out::println)
//                    .collect(Collectors.toList());
//            System.out.println(strings);
//


            String listString = Files.lines(Paths.get(PATH)).collect(Collectors.joining());
            List<String> cutString = split(listString)
                    .stream()
                    .map(str -> str.replaceAll("\"", ""))
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(cutString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> split(String str) {
        return Stream.of(str.split(COMMA))
                .map(String::new)
                .collect(Collectors.toList());
    }
}
