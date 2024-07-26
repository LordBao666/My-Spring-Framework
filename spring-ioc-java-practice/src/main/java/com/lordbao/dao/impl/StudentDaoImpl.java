package com.lordbao.dao.impl;


import com.lordbao.beans.Student;
import com.lordbao.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 13:55
 * @Version 1.0
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,gender,age,class classes from students";
        List<Student> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        return list;
    }
}
