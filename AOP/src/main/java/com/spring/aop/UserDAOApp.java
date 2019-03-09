package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDAOApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/application.xml");
        UserDAO userDAO = context.getBean(UserDAO.class);
        userDAO.insert();
    }
}
