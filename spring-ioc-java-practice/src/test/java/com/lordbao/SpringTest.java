package com.lordbao;

import com.lordbao.config.JDBCConfig;
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

@SpringJUnitConfig(value = {JDBCConfig.class})
public class SpringTest {
    @Autowired
    private StudentController studentController;


    //test1是可以直接注入studentController 来进行测试
    @Test
    public void test1() {
        studentController.findAll();
    }

    //下面这种测试显然没有上面这种测试好...
    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
        StudentController studentController = context.getBean(StudentController.class);
        studentController.findAll();
    }
}
