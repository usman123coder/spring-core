package com.stype.annotatio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext
                ("com.stype.annotatio");
        Robot robot = context.getBean("robot",Robot.class);
        robot.walk(1000,"Nort");
    }
}
