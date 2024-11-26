package com.stype.annotatio.pdijavaConfigApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimitiveInjectionJavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext
                (PrimitiveInjectionJavaConfig.class);
        Branch branch = context.getBean("branch2",Branch.class);
        System.out.println(branch);
    }
}
