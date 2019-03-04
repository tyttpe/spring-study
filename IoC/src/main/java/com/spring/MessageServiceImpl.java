package com.spring;

public class MessageServiceImpl implements MessageService{
    private String username;
    private int age;

    public MessageServiceImpl(String username,int age){
        this.username=username;
        this.age=age;
    }

    @Override
    public String getMessage() {
        return "Hello World!"+username+", age is "+ age;
    }
}
