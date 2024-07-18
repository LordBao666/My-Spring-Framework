package com.lordbao.beans;

/**
 * @Author Lord_Bao
 * @Date 2024/7/16 15:08
 * @Version 1.0
 */
public class Pig {
    private String name;

    public Pig(){
        name="";
    }

    public Pig(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                '}';
    }
}
