package com.lordbao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author Lord_Bao
 * @Date 2024/7/28 10:34
 * @Version 1.0
 */
@Configuration
@ComponentScan(value = "com.lordbao")
@EnableAspectJAutoProxy
public class SpringConfig {
}
