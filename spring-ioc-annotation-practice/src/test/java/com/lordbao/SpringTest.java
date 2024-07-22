package com.lordbao;

import com.lordbao.beans.Student;
import com.lordbao.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 11:54
 * @Version 1.0
 */
public class SpringTest {


    @Test
    public void testThreeLayerFramework(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
        StudentController studentController = context.getBean("studentController", StudentController.class);
        studentController.findAll();
    }
}
