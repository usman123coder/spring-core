package com.stype.annotatio;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component("usman")
//@Controller
//@Service
@Repository
public class Robot {
    public void walk(int feet, String direction){
        System.out.println("Walk " + feet + " feet in " + direction + " direction.");
    }
}
