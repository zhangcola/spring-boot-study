package com.jpa;

import com.jpa.jdbc.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;

/**
 * Created by cola on 2017/1/23.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private PersonDao personDao;

    public Person save() {
        Person person = new Person();
        person.setId(12345L);
        person.setName("test");

        personRepository.save(person);

        return person;

    }

    public Person get(Long id) {
        Person person = personRepository.findOne(id);
        return person;
    }

    public void delete(Long id) {
        personRepository.delete(id);
    }

    public Person getByDao(Long id) {
        return personDao.getPerson(id);
    }
}
