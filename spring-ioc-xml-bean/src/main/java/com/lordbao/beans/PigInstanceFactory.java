package com.lordbao.beans;

/**
 * @Author Lord_Bao
 * @Date 2024/7/18 8:08
 * @Version 1.0
 */
public class PigInstanceFactory {
    private static Pig pig=null;
    public Pig getInstance(){
        if(pig==null){
            pig=new Pig("pig3");
        }
        return pig;
    }
}
