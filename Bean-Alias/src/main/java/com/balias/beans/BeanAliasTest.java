package com.balias.beans;

import com.balias.config.BeanAliasConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BeanAliasTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext
                (BeanAliasConfig.class);
        FuelTank fuelTank = context.getBean("fuelTank",FuelTank.class);
        System.out.println(fuelTank);
        String[] aliases = context.getAliases("fuelTank");
        Arrays.stream(aliases).forEach(System.out::println);
    }
}
