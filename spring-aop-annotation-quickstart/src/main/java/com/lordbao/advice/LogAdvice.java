package com.lordbao.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author Lord_Bao
 * @Date 2024/7/28 10:35
 * @Version 1.0
 */
@Component
@Aspect
public class LogAdvice {

    @Before("execution(* com.lordbao.service.impl.*.*(..))")
    public void before(){
        System.out.println("方法开始");
    }

    @AfterReturning("execution(* com.lordbao.service.impl.*.*(..))")
    public void afterReturning(){
        System.out.println("方法结束");
    }

    @AfterThrowing("execution(* com.lordbao.service.impl.*.*(..))")
    public void error(){
        System.out.println("方法异常");
    }
}
