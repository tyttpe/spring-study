package com.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路劲
@ContextConfiguration(locations = {"/beans.xml"})
public class MaxTest {
    //自动注入
    @Autowired
    private Max max;

    @Test
    public void getMax() {
        assertEquals(5,max.getMax());
    }
}