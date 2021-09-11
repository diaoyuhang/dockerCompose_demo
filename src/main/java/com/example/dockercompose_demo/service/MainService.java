package com.example.dockercompose_demo.service;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MainService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public void test(){
        String sql="select * from person";
        BeanPropertyRowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        List<Person> list = jdbcTemplate.query(sql, rowMapper);
        System.out.println(list);
    }
}
