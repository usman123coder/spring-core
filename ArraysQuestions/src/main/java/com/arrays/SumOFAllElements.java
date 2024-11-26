package com.arrays;

public class SumOFAllElements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5};
        int s= 0;
        for(int i : a)
            s= s+i;
        System.out.println("Sum of all Elements is : " + s);
    }
}
