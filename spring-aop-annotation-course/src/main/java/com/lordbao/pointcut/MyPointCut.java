package com.lordbao.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author Lord_Bao
 * @Date 2024/7/28 14:45
 * @Version 1.0
 */
@Component
public class MyPointCut {

    @Pointcut("execution(* com..impl.*.*(..))")
    public void servicePointCut(){
    }
}
