package com.streamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class AverageAge {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Usman",24),
                new Person("Salman",25),
                new Person("Haziq", 22),
                new Person("Ubesh", 14)
        );
       double averageAge = persons.stream().mapToInt(Person::getAge).
                average().orElse(0);
        System.out.println("Average age is : "+averageAge);

    }
}
