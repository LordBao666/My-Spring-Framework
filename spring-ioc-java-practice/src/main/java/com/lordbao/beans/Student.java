package com.lordbao.beans;

import lombok.Data;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 10:52
 * @Version 1.0
 */
@Data
public class Student {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String clazz;//班级
}

