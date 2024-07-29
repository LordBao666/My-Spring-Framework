package com.lordbao;

import com.lordbao.config.SpringConfig;
import com.lordbao.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Lord_Bao
 * @Date 2024/7/29 10:21
 * @Version 1.0
 */
@SpringJUnitConfig(value = SpringConfig.class)
public class SpringTest {

    @Autowired
    private StudentController studentController;


    @Test
    public void testUpdateAgeById(){
        studentController.updateAgeById();
    }
}
