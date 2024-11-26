package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamClass {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Usman","Java",200000));
        emp.add(new Employee("Salman","Java",250000));
        emp.add(new Employee("Haziq","Java",150000));
        emp.add(new Employee("Ubesh","Java",500000));
        System.out.println(emp);
        for(Employee e : emp)
            System.out.println(e);
        emp.stream().filter((e)->e.geteName().toLowerCase().startsWith("u")).forEach((e)->System.out.println(e));
        Set<String> nameSI=emp.stream().map((employee -> employee.geteName())).collect(Collectors.toSet());
        System.out.println();
        System.out.println(nameSI);
    }
}
