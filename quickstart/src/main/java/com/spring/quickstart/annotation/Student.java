package com.spring.quickstart.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by DELL on 2019/2/28.
 */

@Component
@Data
public class Student {
    @Value("tom")
    private String name;

    @Value("8")
    private int age;

    //使用@Autowired注入一个Phone类型的bean
    @Autowired
    private Phone phone;
}
