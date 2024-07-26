package com.lordbao;

import com.lordbao.config.SpringConfig;
import com.lordbao.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Lord_Bao
 * @Date 2024/7/26 10:44
 * @Version 1.0
 */
public class SpringTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        StudentController studentController = context.getBean("studentController", StudentController.class);
        StudentController studentController = context.getBean(StudentController.class);
        studentController.findAll();
    }
}
