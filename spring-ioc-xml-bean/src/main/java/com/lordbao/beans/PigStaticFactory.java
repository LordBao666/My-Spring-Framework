package com.lordbao.beans;

/**
 * @Author Lord_Bao
 * @Date 2024/7/18 7:56
 * @Version 1.0
 */
public class PigStaticFactory {
    private  static Pig pig =null;

    public static Pig  getInstance(){
        if(pig==null){
            pig = new Pig("pig2");
        }

        return pig;
    }
}
