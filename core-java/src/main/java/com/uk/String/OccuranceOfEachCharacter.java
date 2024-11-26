package com.uk.String;

public class OccuranceOfEachCharacter {
    public static void main(String[] args) {
        String s = "hello";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count = 0;

            //Count occurance of current character
            for (int j=0;j<s.length();j++){
                if (ch==s.charAt(j))
                    count++;
            }

            //to avoid duplicate characters
            boolean alreadyPrinted = false;
            for(int k=0;k<i;k++){
                if (s.charAt(k)==ch){
                    alreadyPrinted=true;
                    break;
                }
            }

            if (!alreadyPrinted)
                System.out.println("Character " + ch + " : " + count + " times.");
        }
    }
}
