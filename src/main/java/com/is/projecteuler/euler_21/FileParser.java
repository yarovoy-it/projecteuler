package com.is.projecteuler.euler_21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
