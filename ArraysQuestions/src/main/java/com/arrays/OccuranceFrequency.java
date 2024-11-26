package com.arrays;

import java.util.HashMap;

public class OccuranceFrequency {
    public static void main(String[] args) {
        int[] numbers = {1,11,1,2,4,3,4,3,5,6,6,6,8,9,9};
        occuranceFrequency(numbers);
    }
    public static void occuranceFrequency(int[] arr){
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : arr)
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        for (int num : freqMap.keySet())
            System.out.println("Element : " + num + " , frequency : " + freqMap.get(num));
    }
}
