package com.lordbao.service;

import com.lordbao.beans.Student;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 13:57
 * @Version 1.0
 */
public interface StudentService {
    List<Student> queryAll();
    int updateAgeById(int id,int age);
}
