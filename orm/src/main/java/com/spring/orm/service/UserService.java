package com.spring.orm.service;

import com.spring.orm.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectUsers();

    int addUsers(User user);

    int deleteUser(long id);

    int updateUser(User user);

    User selectOneUser(long id);

    /*
    * 查询所有用户
    *
    * @return
    * */
}
