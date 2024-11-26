package com.strings;

import java.util.Arrays;

public class Ex {
    public static void main(String[] args) {
        String s1 = "usman";
        String s2 = "rahul";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.length()==s2.length()){
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean result = Arrays.equals(c1,c2);
            if (result)
                System.out.println("anagram");
            else
                System.out.println("not anagram");
        }
        else System.out.println("not angaram");
    }
}
