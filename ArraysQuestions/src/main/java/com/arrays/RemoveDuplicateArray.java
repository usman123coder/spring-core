package com.arrays;

import java.util.HashSet;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,2,2,5,5,8,6,9};
        removeDuplicate(numbers);
    }
    public static void removeDuplicate(int[] arr){
        HashSet<Integer> uniqueElement = new HashSet<>();
        for (int num : arr)
            if (uniqueElement.add(num))
                System.out.print(num + " ");
    }
}
