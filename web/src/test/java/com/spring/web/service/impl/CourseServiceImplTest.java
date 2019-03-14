package com.spring.web.service.impl;

import com.spring.web.entity.CourseVO;
import com.spring.web.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring_mybatis.xml"})
public class CourseServiceImplTest {
    @Autowired
    private CourseService courseService;

    @Test
    public void selectCurrenCourses() {
        List<CourseVO> courseVOList = courseService.selectCurrenCourses();
        courseVOList.forEach(courseVO -> System.out.println(courseVO));
    }
}