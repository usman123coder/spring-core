package com.streamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaple","banana","date","grapefruits");
        Optional<String> longestStrings =
                strings.stream().max(Comparator.comparing(String::length));
        System.out.println("Longest String is : " + longestStrings);
    }
}
