package com.lordbao.test;

import com.lordbao.beans.Person;
import com.lordbao.beans.Pig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Lord_Bao
 * @Date 2024/7/18 9:43
 * @Version 1.0
 */

public class TestSpring {

    @Test
    public void testGetBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("mybean.xml");
        Pig pig1 = context.getBean("pig1", Pig.class);
        Pig pig2 = context.getBean("pig2", Pig.class);
        Pig pig3 = context.getBean("pig3", Pig.class);
        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println(pig3);
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);
    }


    @Test
    public  void testBeanScope(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mybean.xml");
        Pig singletonPig1 = context.getBean("singletonPig", Pig.class);
        Pig singletonPig2= context.getBean("singletonPig", Pig.class);
        Assertions.assertSame(singletonPig1, singletonPig2);

        Pig prototypePig1 = context.getBean("prototypePig", Pig.class);
        Pig prototypePig2 = context.getBean("prototypePig", Pig.class);
        Assertions.assertNotSame(prototypePig1, prototypePig2);
    }
}
