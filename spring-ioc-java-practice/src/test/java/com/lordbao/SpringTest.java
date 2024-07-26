package com.lordbao;

import com.lordbao.config.SpringConfig;
import com.lordbao.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author Lord_Bao
 * @Date 2024/7/26 10:44
 * @Version 1.0
 */

@SpringJUnitConfig(value = {SpringConfig.class})
public class SpringTest {
    @Autowired
    private StudentController studentController;

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        StudentController studentController = context.getBean("studentController", StudentController.class);
        StudentController studentController = context.getBean(StudentController.class);
        studentController.findAll();
    }

    //Import spring-test package first, so you can use  @Annotation SpringJunitConfig.
    //The  SpringJunitConfig provides a spring environment for you to test, so you can
    //eliminate redundant code to create the ioc-container. See the difference between
    //test and test2.
    @Test
    public void test2(){
        studentController.findAll();
    }
}
