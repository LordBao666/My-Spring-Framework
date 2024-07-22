package com.lordbao.service.impl;

import com.lordbao.beans.Student;
import com.lordbao.dao.StudentDao;
import com.lordbao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 13:57
 * @Version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> queryAll() {
        return studentDao.queryAll();
    }
}
