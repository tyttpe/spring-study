package com.spring.aop;

public class HelloImpl implements Hello{
    @Override
    public String getHellow() {
        return "Hello,spring AOP";
    }
}
