package com.lordbao.controller;

import com.lordbao.beans.Student;
import com.lordbao.service.StudentService;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 13:58
 * @Version 1.0
 */
public class StudentController {

    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll(){
        List<Student> students = studentService.queryAll();
        students.forEach(System.out::println);
    }
}
