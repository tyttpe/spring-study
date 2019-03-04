package com.spring.quickstart.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by DELL on 2019/2/28.
 */
/*
* 采用注解开发的bean
* @Component用于类级别注解,标注本类为一个可被spring容器托管的bean
* */
@Component
public class Hello {
    public String getHello(){
        return "Hello World";
    }
}
