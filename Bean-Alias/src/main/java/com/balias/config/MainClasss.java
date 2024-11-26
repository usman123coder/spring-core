package com.balias.config;

import java.util.Arrays;
import java.util.List;

public class MainClasss {
    public static void main(String[] args) {
        List<Employee> l=null;
        Employee e1 = new Employee(101,"Salman","CA",220000.00);
        Employee e2 = new Employee(102,"Usman","Developer",750000.00);
        Employee e3 = new Employee(103,"Suleman","Driver",46000.00);
        Employee e4 = new Employee(104,"Ubesh","Doctor",450000.00);
        Employee e5 = new Employee(105,"a","Driver",45000.00);
        Employee e6 = new Employee(106,"b","Driver",35000.00);
        Employee e7 = new Employee(107,"v","Driver",25000.00);

        l = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);

        l.stream().filter(emp->emp.getSalary()<=40000.00).forEach(System.out::println);
    }
}
