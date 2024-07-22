package com.lordbao.dao.impl;

import com.lordbao.beans.Student;
import com.lordbao.dao.StudentDao;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 13:55
 * @Version 1.0
 */
@Repository(value = "studentDao")
public class StudentDaoImpl implements StudentDao {



    @Override
    public List<Student> queryAll() {
        System.out.println(this);
        return null;
    }
}
