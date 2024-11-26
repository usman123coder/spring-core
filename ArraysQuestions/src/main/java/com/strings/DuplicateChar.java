package com.strings;

public class DuplicateChar {
    public static void main(String[] args) {
        String s = "programming";
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for (int j=i+1;j<s.length();j++)
                if(c==s.charAt(j)){
                    System.out.print(c+" ");
                    break;
                }
        }
        System.out.println();
        String s2 = "madam";
        for (int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            for (int j=i+1;j<s2.length();j++)
                if (c==s2.charAt(i)) {
                    System.out.print(c + " ");
                    break;
                }
        }
    }
}
