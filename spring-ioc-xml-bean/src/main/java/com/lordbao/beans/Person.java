package com.lordbao.beans;

/**
 * @Author Lord_Bao
 * @Date 2024/7/18 8:17
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;
    private Pig pig;

    public Person(){

    }

    public Person(int age,String name, Pig pig) {
        this.age = age;
        this.name = name;
        this.pig = pig;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPig(Pig pig) {
        this.pig = pig;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", pig=" + pig +
                '}';
    }
}
