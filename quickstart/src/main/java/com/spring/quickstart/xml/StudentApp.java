package com.spring.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 2019/2/25.
 */
public class StudentApp {
    public static void main(String[] arg){
        ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
