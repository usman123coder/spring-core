package com.stype.annotatio.pdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.stype.annotatio.pdi");
        Book book = context.getBean("book",Book.class);
        System.out.println(book.toString());
    }
}
