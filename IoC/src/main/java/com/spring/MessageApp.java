package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        MessagePrinter printer =context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
