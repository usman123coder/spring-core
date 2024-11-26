package com.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {84,85,2,45,5,6,6};
        int start = 0;
        int end = numbers.length-1;
        while (start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        for (int n : numbers)
            System.out.print(n + " ");
    }
}
