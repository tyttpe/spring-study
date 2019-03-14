package com.spring.orm.service.impl;

import com.spring.orm.entity.User;
import com.spring.orm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void selectUsers() {
        List<User> users = userService.selectUsers();
        users.forEach(user -> System.out.println(user));
    }
    @Test
    public void selectOneUser() {
        User user = userService.selectOneUser(2);
        System.out.println(user);
    }
    @Test
    public void addUser(){
        User user =new User();
        user.setAccount("admit");
        user.setPassword("333");
        user.setCredits(300);
        int n = userService.addUsers(user);
        assertEquals(1,n);
    }
    @Test
    public void deleteUser(){
        int n = userService.deleteUser(1);
        assertEquals(1,n);
    }
    @Test
    public void updateUser() {
        User user = userService.selectOneUser(2);
        user.setPassword("444");
        user.setCredits(400);
        int n = userService.updateUser(user);
        assertEquals(1, n);
    }
}