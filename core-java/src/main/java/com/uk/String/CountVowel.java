package com.uk.String;

public class CountVowel {
    public static void main(String[] args) {
        String str = "Hello345Java";
        str.toLowerCase();
        int vo =0,co=0,no=0;
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                vo++;
            else if(c>=30 && c<=59)
                no++;
            else co++;
        }
        System.out.println("Vowels are : " + vo);
        System.out.println("Consonent are : " + co);
        System.out.println("No are : " + no);
    }
}
