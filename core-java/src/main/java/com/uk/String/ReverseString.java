package com.uk.String;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Murshid";
        String rev="";
        for (int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);
        System.out.println("Reverse is : " + rev);
    }
}
