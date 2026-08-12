package com.lordbao.app.service.impl;


import com.lordbao.app.dao.GreetDao;
import com.lordbao.app.service.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author Lord_Bao
 * @Date 2026/8/12 9:34
 * @Version 1.0
 */
@Component
public class GreetServiceImpl implements GreetService {

    @Autowired
    private GreetDao dao;
    @Override
    public void greet() {
        dao.greet();
    }
}
