package com.di.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("com/di/beans/application-context.xml");
        MessageWriter messageWriter = (MessageWriter) context.getBean("messageWriter");
        messageWriter.writeMessage("Hii");
    }
}
