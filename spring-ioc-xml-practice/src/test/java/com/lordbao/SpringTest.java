package com.lordbao;

import com.lordbao.beans.Student;
import com.lordbao.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 11:54
 * @Version 1.0
 */
public class SpringTest {

    @Test
    public void testInsertSQL(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String sql = "insert into students(name,gender,age,class) values(?,?,?,?)";
        int rows = template.update(sql,"jack","男",23,"高中1班");
        System.out.println("rows "+rows+" have been affected");
    }

    @Test
    public void testQueryForObjectSQL(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

//        String sql = "select * from students where id = ?";
//        Student student = template.queryForObject(sql, new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student s = new Student();
//                s.setId(rs.getInt("id"));
//                s.setAge(rs.getInt("age"));
//                s.setName(rs.getString("name"));
//                s.setGender(rs.getString("gender"));
//                s.setClasses(rs.getString("class"));
//                return s;
//            }
//        }, 1);

        //The code works the same as the above one.
        String sql = "select id,name,gender,age,class classes from students where id = ?";
        Student student = template.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), 1);
        System.out.println(student);
    }

    @Test
    public void testQuerySQL(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String sql = "select id,name,gender,age,class classes from students";
        List<Student> list = template.query(sql, new BeanPropertyRowMapper<>(Student.class));
        for(Student s : list){
            System.out.println(s);
        }
    }

    @Test
    public void testThreeLayerFramework(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
        StudentController studentController = context.getBean("studentController", StudentController.class);
        studentController.findAll();
    }
}
