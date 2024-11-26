package com.arrays;

public class Employee {
    private String eName;
    private String dpt;
    private double sal;

    public Employee(String eName, String dpt, double sal) {
        this.eName = eName;
        this.dpt = dpt;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                ", dpt='" + dpt + '\'' +
                ", sal=" + sal +
                '}';
    }

    public String geteName() {
        return eName;
    }

    public String getDpt() {
        return dpt;
    }

    public double getSal() {
        return sal;
    }
}
