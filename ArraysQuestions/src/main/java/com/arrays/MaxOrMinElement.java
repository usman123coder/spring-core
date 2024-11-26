package com.arrays;

public class MaxOrMinElement {
    public static void main(String[] args) {
        int[] numbers = {10,48,33,74,75,64,75,100000};
        int max = numbers[0];
        int min = numbers[0];
        for(int num : numbers){
            if (num>max)
                max=num;
            if (num<min)
                min=num;
        }
        System.out.println("Maximum no : " + max);
        System.out.println("MInimum no : " + min);
    }
}
