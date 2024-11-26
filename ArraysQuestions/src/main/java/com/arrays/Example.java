package com.arrays;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = scanner.nextInt();
        int fac = factorial(n);
        System.out.println(fac);
    }
    public static int factorial(int a){
        if (a==1 || a==0)
            return 1;
        return  a*factorial(a-1);
//        return a;
    }
}
