package com.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(3);
            System.out.println(5/0);
            System.out.println(4);
        }catch (ArithmeticException ae){
            System.out.println("Don't Pass Zero as a Value");
        }
        finally {
            System.out.println("I a finally block Always executed");
        }
    }
}
