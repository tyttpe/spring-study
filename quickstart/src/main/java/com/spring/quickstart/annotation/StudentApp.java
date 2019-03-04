package com.spring.quickstart.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by DELL on 2019/2/28.
 */

@ComponentScan
public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentApp.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);

    }
}
