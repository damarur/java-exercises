package org.example.exercises.basic;

import java.util.Arrays;
import java.util.List;

public class Collections {

    private static String[] getOnlyDistinctValues(String[] input) {
        // TODO
        return input;
    }

    private static List<String> getOnlyDistinctValues(List<String> input) {
        // TODO
        return input;
    }

    public static void main(String[] args) {
        String[] input = new String[]{"one", "two", "two", "three", "four", "five", "five"};

        String[] resultInArrayFormat = Collections.getOnlyDistinctValues(input);
        List<String> resultInListFormat = Collections.getOnlyDistinctValues(Arrays.stream(input).toList());

        System.out.println("resultInArrayFormat -> " + Arrays.toString(resultInArrayFormat));
        System.out.println("resultInListFormat -> " + resultInListFormat);
    }
}
