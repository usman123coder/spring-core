package com.arrays;

public class ArrayContains {
    public static void main(String[] args) {
        int[] numbers = {03,93,44,2,8,9};
        int target = 20;
        boolean contains = false;
        for (int num : numbers)
            if (target==num){
                contains=true;
                break;
            }
        if (contains)
            System.out.println("Arrays Contains : " + target);
        else
            System.out.println("Arrays does'nt contains : " + target);
    }
}
