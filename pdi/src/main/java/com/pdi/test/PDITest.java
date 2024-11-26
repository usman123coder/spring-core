package com.pdi.test;

import com.pdi.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PDITest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/pdi/common/app-context.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
