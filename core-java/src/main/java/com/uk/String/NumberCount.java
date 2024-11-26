package com.uk.String;

public class NumberCount {
    public static void main(String[] args) {
        String s="Hello World Welcome";
        int w=1;
        for (int i=0;i<s.length();i++)
            if (s.charAt(i)!=' ')
                w++;
        System.out.println("Count is : " + w);
    }
}
