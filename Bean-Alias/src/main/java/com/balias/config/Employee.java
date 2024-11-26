package com.balias.config;

public class Employee {
    private Integer empId;
    private String empName;
    private String desig;
    private Double salary;

    public Employee(Integer empId, String empName, String desig, Double salary) {
        this.empId = empId;
        this.empName = empName;
        this.desig = desig;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
