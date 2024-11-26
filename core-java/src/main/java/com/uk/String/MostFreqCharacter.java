package com.uk.String;

public class MostFreqCharacter {
    public static void main(String[] args) {
        String s = "alb";
        char maxChar = ' ';
        int maxCount = 0;
        for (int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            int count = 0;
            for (int j=0;j<s.length();j++){
                if (currentChar==s.charAt(j))
                    count++;
            }
            if (count>maxCount){
                maxCount = count;
                maxChar = currentChar;
            }
        }
        System.out.println("Most Freq char is : " + maxChar + " (occurs : " + maxCount + " times).");
    }
}
