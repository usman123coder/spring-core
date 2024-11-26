package com.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="UsMan";
        String s2 = "salman";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length()==s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean result = Arrays.equals(c1,c2);
            if (result)
                System.out.println("Both strings are Annagram");
            else
                System.out.println("Both String s are not Anagram");
        }
        else System.out.println("Both strings are not anagram");

    }
}
