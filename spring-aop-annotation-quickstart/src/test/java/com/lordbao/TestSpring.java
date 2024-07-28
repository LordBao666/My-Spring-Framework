package com.lordbao;

import com.lordbao.config.SpringConfig;
import com.lordbao.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author Lord_Bao
 * @Date 2024/7/28 10:40
 * @Version 1.0
 */
@SpringJUnitConfig(value = SpringConfig.class)
public class TestSpring {

    @Autowired
    private Calculator calculator;


    @Test
    public void testAdvice(){
        System.out.println(calculator.getClass());
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        for(Class<?> clazz : interfaces){
            System.out.println(clazz);
        }
        calculator.add(1,1);
    }
}
