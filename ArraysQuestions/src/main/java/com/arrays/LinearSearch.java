package com.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,5,3,5};
        int target = 5;
        int index = linarSearch(numbers,target);
        if (index!=-1)
            System.out.println("Element found at index : " + (index+1));
        else
            System.out.println("Element didn't found in this Array");
    }
    public static int linarSearch(int[] arr,int target){
        for (int i=0;i<=arr.length-1;i++)
            if (arr[i]==target)
                return i;
        return -1;
    }
}
