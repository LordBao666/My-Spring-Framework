package com.lordbao.controller;

import com.lordbao.beans.Student;
import com.lordbao.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 13:58
 * @Version 1.0
 */
@Controller
public class StudentController {


    private StudentService studentService;

//    @Autowired
//    @Qualifier(value = "studentService")
    @Resource(name = "studentService")
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }


    public void findAll(){
        List<Student> students = studentService.queryAll();
        System.out.println("StudentController-->findAll() is called");
    }
}
