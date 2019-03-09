package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDAOImpl implements UserDAO {

    private static final Logger logger= LoggerFactory.getLogger(UserDAO.class);

    @Override
    public void insert() {
        logger.info("开始进行插入操作。。。");
    }
}
