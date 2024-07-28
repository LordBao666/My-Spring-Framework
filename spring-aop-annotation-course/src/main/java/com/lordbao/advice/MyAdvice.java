package com.lordbao.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

/**
 * @Author Lord_Bao
 * @Date 2024/7/28 11:47
 * @Version 1.0
 */
@Component
@Aspect
public class MyAdvice {

//    @Before("execution(* com..impl.*.*(..))")
    @Before("com.lordbao.pointcut.MyPointCut.servicePointCut()")
    public void before(JoinPoint joinPoint){

        //get the class to which the target method belong
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        System.out.println(simpleName);

        //get the modifier of the target method
        String modifier = Modifier.toString(joinPoint.getSignature().getModifiers());
        System.out.println(modifier);
        System.out.println(joinPoint.getSignature());

        //get the parameter passing to the target method
        Object[] args = joinPoint.getArgs();
        for(Object arg:args){
            System.out.println(arg);
        }
    }

//    @AfterReturning(value = "execution(* com..impl.*.*(..))",returning = "result")
    @AfterReturning(value = "com.lordbao.pointcut.MyPointCut.servicePointCut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println("The result is "+result);

    }

//    @AfterThrowing(value = "execution(* com..impl.*.*(..))",throwing = "throwable")
    @AfterThrowing(value = "com.lordbao.pointcut.MyPointCut.servicePointCut()",throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){
        throwable.printStackTrace();
    }
}
