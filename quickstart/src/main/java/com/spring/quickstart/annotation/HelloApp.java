package com.spring.quickstart.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by DELL on 2019/2/28.
 */
/*
* ComponentScan
* 用于寻找@Component注解标注的bean
* */
@ComponentScan
public class HelloApp {
    public static void main(String[] args) {
        //1 通过注解创建上下文
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloApp.class);
        //2 读取bean
        Hello hello = context.getBean(Hello.class);
        //3 运行
        System.out.println(hello.getHello());
    }
}
