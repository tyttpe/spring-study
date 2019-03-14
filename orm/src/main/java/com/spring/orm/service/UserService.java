package com.spring.orm.service;

import com.spring.orm.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectUsers();//查询所有
    int addUsers(User user);//插入
    int deleteUser(long id);//删除
    int updateUser(User user);//更新
    User selectOneUser(long id);//根据id查询
}
