package com.lordbao.app.dao.impl;


import com.lordbao.app.dao.GreetDao;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @Author Lord_Bao
 * @Date 2026/8/12 9:32
 * @Version 1.0
 */
@Component
@ConditionalOnProperty(name = "service.greet.type", havingValue = "implA",matchIfMissing = true)
public class GreetDaoImplA implements GreetDao {
    @Override
    public void greet() {
        System.out.println("this is GreetDaoImplA.Hi!!!");
    }
}
