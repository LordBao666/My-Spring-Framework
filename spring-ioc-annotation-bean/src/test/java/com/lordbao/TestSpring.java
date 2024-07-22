package com.lordbao;

import com.lordbao.beans.MySecret;
import com.lordbao.controller.StudentController;
import com.lordbao.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 16:37
 * @Version 1.0
 */
public class TestSpring {
    @Test
    public void  testAnnotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentController studentController = context.getBean("studentController", StudentController.class);

        studentController.findAll();
    }

    @Test
    public void  testValue(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        MySecret mySecret = context.getBean("mySecret", MySecret.class);
        System.out.println(mySecret);
    }
}
