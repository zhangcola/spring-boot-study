package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cola on 2017/1/23.
 */
@RestController
@RequestMapping(value = "/jpa")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/save")
    public Person save() {
       return personService.save();
    }

    @RequestMapping(value = "/get/{id}")
    public Person get(@PathVariable("id") Long id) {
        return personService.get(id);
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        try {
            personService.delete(id);
        } catch(Exception e) {

        }
         return "success-dfdfd";
    }

    @RequestMapping(value="/get/jdbctemplate/{id}")
    public Person getByJdbcTemplate(@PathVariable("id") Long id) {
        return personService.getByDao(id);
    }
}
