package com.uk.String;

public class FirstRepeatedCharFound {
    public static void main(String[] args) {
        String s = "salman";
        boolean found = false;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            boolean isRep = false;
            for (int j=0;j<s.length();j++){
                if (i!=j && ch==s.charAt(j)){
                    isRep=true;
                    break;
                }
            }
            if (isRep){
                System.out.println("First Repeated Chat is : " + ch);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("No non-repeated character found");
    }
}
