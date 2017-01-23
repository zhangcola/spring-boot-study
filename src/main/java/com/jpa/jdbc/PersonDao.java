package com.jpa.jdbc;

import com.jpa.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by cola on 2017/1/23.
 */
@Repository
public class PersonDao {


    @Resource
    private JdbcTemplate jdbcTemplate;

    public Person getPerson(Long id) {
        String sql = "select * from Person where id = ?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<Person>(Person.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);
    }


}
