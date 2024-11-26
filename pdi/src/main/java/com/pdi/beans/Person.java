package com.pdi.beans;

public class Person {
    int id;
    String fullName;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public Person(int id){
        this.id=id;
    }

    public void setFullName(String fullName){
        this.fullName=fullName;
    }
}
