package com.spring.quickstart.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 2019/2/25.
 */
public class HelloworldApp {
       public static void main(String[] arg){
//           读入配置文件
           ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
//           读取配置好的bean
           HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
//           运行helloworld的方法
           System.out.println(helloWorld.getHello());
       }

}
