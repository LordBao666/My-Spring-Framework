package com.lordbao.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 10:05
 * @Version 1.0
 */
public class PigFactoryBeanFactory  implements FactoryBean<Pig> {
    @Override
    public Pig getObject() throws Exception {
        //The logic here ie creating a  complex object.
        Pig p =new Pig("pigBean");
        return p;
    }

    @Override
    public Class<?> getObjectType() {
        return Pig.class;
    }
}
